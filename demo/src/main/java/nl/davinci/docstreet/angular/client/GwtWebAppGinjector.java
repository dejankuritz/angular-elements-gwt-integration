package nl.davinci.docstreet.angular.client;

import com.google.gwt.event.shared.SimpleEventBus;
import com.google.gwt.inject.client.GinModules;
import com.google.gwt.inject.client.Ginjector;
import nl.davinci.docstreet.angular.client.resource.ApplicationResources;
import nl.davinci.docstreet.angular.client.resource.Messages;
import nl.davinci.docstreet.angular.client.ui.MainPanel;

@GinModules(GwtWebAppGinModule.class)
public interface GwtWebAppGinjector extends Ginjector {

	SimpleEventBus getEventBus();

	ApplicationResources getApplicationResources();

	Messages getMessages();

	MainPanel getMainPanel();
}
