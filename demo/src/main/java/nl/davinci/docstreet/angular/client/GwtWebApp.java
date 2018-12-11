package nl.davinci.docstreet.angular.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.RootLayoutPanel;
import nl.davinci.docstreet.angular.client.resource.ApplicationResources;
import nl.davinci.docstreet.angular.client.ui.MainPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 *
 * Point d'entrée du module GWT
 */
public class GwtWebApp implements EntryPoint {

	/**
	 * gin injector
	 */
	private final GwtWebAppGinjector injector = GWT.create(GwtWebAppGinjector.class);

	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {
		ApplicationResources.INSTANCE.style().ensureInjected();
		MainPanel mainPanel = injector.getMainPanel();
		RootLayoutPanel.get().add(mainPanel);
	}
}
