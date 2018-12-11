package nl.davinci.docstreet.angular.client.resources;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.TextResource;

public interface RepairWidgetResources extends ClientBundle {

	RepairWidgetResources INSTANCE = GWT.create(RepairWidgetResources.class);

	@Source("custom-elements/custom-elements.min.js")
	TextResource customElementsScript();

	@Source("custom-elements/custom-elements-es5-adapter.js")
	TextResource customElementsAdapterScript();

	@Source("custom-elements/webcomponents-loader.js")
	TextResource webComponentsLoaderScript();

	@Source("repair-widget.js")
	TextResource repairWidgetScript();

	@Source("basic-header.js")
	TextResource basicHeaderScript();
}
