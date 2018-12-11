package nl.davinci.docstreet.angular.client.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import nl.davinci.docstreet.angular.client.components.RepairWidget;
import nl.davinci.docstreet.angular.client.events.CastedEventListener;
import nl.davinci.docstreet.angular.client.events.FocusSetEvent;

public class MainPanel extends Composite {

	interface MainPanelUiBinder extends UiBinder<Widget, MainPanel> {

	}

	private static MainPanelUiBinder uiBinder = GWT.create(MainPanelUiBinder.class);

	@UiField
	Button showRepairWidgetButton;
	@UiField
	Label repairWidgetFocusValue;

	@Inject
	public MainPanel() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	@UiHandler("showRepairWidgetButton")
	void onClickShowRepairWidgetButton(ClickEvent e) {
		final DialogBox dialogBox = new DialogBox(true, true);
		final RepairWidget repairWidget = new RepairWidget();
		repairWidget.setName("Johnny");
		repairWidget.addFocusSetEventListener(new CastedEventListener<FocusSetEvent>() {

			@Override
			public void onEvent(FocusSetEvent event) {
				repairWidgetFocusValue.setText("RepairWidget focus was set to: " + event.getDetail());
			}
		});
		dialogBox.setWidget(repairWidget);
		dialogBox.setPopupPosition(50, 50);
		dialogBox.show();
	}
}
