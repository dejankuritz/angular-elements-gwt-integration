package nl.davinci.docstreet.angular.client.components;

import java.util.Arrays;
import java.util.List;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.ScriptInjector;
import com.google.gwt.dom.client.Element;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.resources.client.TextResource;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import nl.davinci.docstreet.angular.client.resources.RepairWidgetResources;

public class BasicHeader extends Composite {

	private static final String HEADER_TEXT_ID = "1";

	interface BasicHeaderUiBinder extends UiBinder<Widget, BasicHeader> {

	}

	private static BasicHeaderUiBinder uiBinder = GWT.create(BasicHeaderUiBinder.class);

	@UiField
	protected Element headerText;
	@UiField
	protected Button clearText;

	@Inject
	public BasicHeader() {
		initScripts();
		initWidget(uiBinder.createAndBindUi(this));
		initFieldIds();
		setText("test");
	}

	@UiHandler("clearText")
	public void handleClearTextClick(ClickEvent e) {
		this.clearText();
	}

	public void setText(String text) {
		headerText.setAttribute("content", text);
	}

	public void clearText() {
		this.clearTextNative(headerText);
	}

	private void initScripts() {
		final List<TextResource> scripts = Arrays.asList(
				RepairWidgetResources.INSTANCE.customElementsScript(),
				RepairWidgetResources.INSTANCE.webComponentsLoaderScript(),
				RepairWidgetResources.INSTANCE.customElementsAdapterScript(),
				RepairWidgetResources.INSTANCE.basicHeaderScript()
		);
		for (final TextResource script : scripts) {
			ScriptInjector.fromString(script.getText())
						  .setWindow(ScriptInjector.TOP_WINDOW)
						  .inject();
		}
	}

	private void initFieldIds() {
		headerText.setId(HEADER_TEXT_ID);
	}

	private native void clearTextNative(Element element) /*-{
		element.clearText();
	}-*/;
}
