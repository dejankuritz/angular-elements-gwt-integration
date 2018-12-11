package nl.davinci.docstreet.angular.client.events;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.user.client.Event;
import com.google.gwt.user.client.EventListener;

public abstract class CastedEventListener<T extends JavaScriptObject> implements EventListener {

	public final void onBrowserEvent(Event event) {
		T casted = event.cast();
		this.onEvent(casted);
	}

	public abstract void onEvent(T event);
}
