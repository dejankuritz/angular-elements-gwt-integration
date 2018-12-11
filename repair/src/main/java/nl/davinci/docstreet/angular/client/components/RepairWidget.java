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
import com.google.gwt.user.client.EventListener;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import nl.davinci.docstreet.angular.client.events.CastedEventListener;
import nl.davinci.docstreet.angular.client.events.FocusSetEvent;
import nl.davinci.docstreet.angular.client.resources.RepairWidgetResources;

public class RepairWidget extends Composite {

	interface RepairWidgetUiBinder extends UiBinder<Widget, RepairWidget> {

	}

	private static RepairWidgetUiBinder uiBinder = GWT.create(RepairWidgetUiBinder.class);

	@UiField
	protected Element element;
	@UiField
	protected Button clearFocusButton;

	private CastedEventListener<FocusSetEvent> focusSetEventListener;

	@Inject
	public RepairWidget() {
		initScripts();
		initWidget(uiBinder.createAndBindUi(this));
	}

	public void setName(String text) {
		element.setAttribute("name", text);
	}

	public void clearFocus() {
		this.clearFocus(element);
	}

	public void addFocusSetEventListener(CastedEventListener<FocusSetEvent> listener) {
		if (listener != this.focusSetEventListener) {
			this.focusSetEventListener = listener;
			this.addListener(element, FocusSetEvent.TYPE, listener);
		}
	}

	@UiHandler("clearFocusButton")
	public void clearFocusButtonClickHandler(ClickEvent event) {
		this.clearFocus();
	}

	private native void clearFocus(Element element) /*-{
		element.clearFocus();
	}-*/;

	private native void addListener(Element element, String eventType, EventListener eventListener) /*-{
		element.addEventListener(eventType, function (event) {
			eventListener.@com.google.gwt.user.client.EventListener::onBrowserEvent(*)(event);
		});
	}-*/;

	private void initScripts() {
		final List<TextResource> scripts = Arrays.asList(
				RepairWidgetResources.INSTANCE.customElementsScript(),
				RepairWidgetResources.INSTANCE.webComponentsLoaderScript(),
				RepairWidgetResources.INSTANCE.customElementsAdapterScript(),
				RepairWidgetResources.INSTANCE.repairWidgetScript()
		);
		for (final TextResource script : scripts) {
			ScriptInjector.fromString(script.getText())
						  .setWindow(ScriptInjector.TOP_WINDOW)
						  .inject();
		}
	}
}
