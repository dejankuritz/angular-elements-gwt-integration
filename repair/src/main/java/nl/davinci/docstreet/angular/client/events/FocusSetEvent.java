package nl.davinci.docstreet.angular.client.events;

import com.google.gwt.core.client.JavaScriptObject;

public class FocusSetEvent extends JavaScriptObject {

	public static final String TYPE = "onFocusSet";

	protected FocusSetEvent() {
	}

	public final native String getDetail() /*-{
		return this.detail;
	}-*/;
}
