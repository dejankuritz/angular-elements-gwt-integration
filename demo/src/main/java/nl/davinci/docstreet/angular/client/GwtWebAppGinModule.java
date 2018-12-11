package nl.davinci.docstreet.angular.client;

import com.google.gwt.event.shared.SimpleEventBus;
import com.google.gwt.inject.client.AbstractGinModule;
import com.google.inject.Singleton;
import nl.davinci.docstreet.angular.client.resource.ApplicationResources;
import nl.davinci.docstreet.angular.client.resource.Messages;
import nl.davinci.docstreet.angular.client.ui.MainPanel;

/**
 * Google gin module configuration
 *
 * @author AGI
 *
 */
public class GwtWebAppGinModule extends AbstractGinModule {

	@Override
	protected void configure() {
		// Resources
		bind(Messages.class).in(Singleton.class);
		bind(ApplicationResources.class).in(Singleton.class);

		// Core
		bind(SimpleEventBus.class).in(Singleton.class);

		// UI
		bind(MainPanel.class).in(Singleton.class);
	}

}
