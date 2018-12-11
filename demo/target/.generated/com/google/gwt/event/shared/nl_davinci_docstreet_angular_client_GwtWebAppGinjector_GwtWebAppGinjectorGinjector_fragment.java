package com.google.gwt.event.shared;

import com.google.gwt.core.client.GWT;
import nl.davinci.docstreet.angular.client.nl_davinci_docstreet_angular_client_GwtWebAppGinjector_GwtWebAppGinjectorGinjector;

public class nl_davinci_docstreet_angular_client_GwtWebAppGinjector_GwtWebAppGinjectorGinjector_fragment {
  public void memberInject_Key$type$com$google$gwt$event$shared$SimpleEventBus$_annotation$$none$$(com.google.gwt.event.shared.SimpleEventBus injectee) {
    
  }
  
  private com.google.gwt.event.shared.SimpleEventBus singleton_Key$type$com$google$gwt$event$shared$SimpleEventBus$_annotation$$none$$ = null;
  
  public com.google.gwt.event.shared.SimpleEventBus get_Key$type$com$google$gwt$event$shared$SimpleEventBus$_annotation$$none$$() {
    
    if (singleton_Key$type$com$google$gwt$event$shared$SimpleEventBus$_annotation$$none$$ == null) {
    Object created = GWT.create(com.google.gwt.event.shared.SimpleEventBus.class);
    assert created instanceof com.google.gwt.event.shared.SimpleEventBus;
    com.google.gwt.event.shared.SimpleEventBus result = (com.google.gwt.event.shared.SimpleEventBus) created;
    
    memberInject_Key$type$com$google$gwt$event$shared$SimpleEventBus$_annotation$$none$$(result);
    
        singleton_Key$type$com$google$gwt$event$shared$SimpleEventBus$_annotation$$none$$ = result;
    }
    return singleton_Key$type$com$google$gwt$event$shared$SimpleEventBus$_annotation$$none$$;
    
  }
  
  
  /**
   * Field for the enclosing injector.
   */
  private final nl_davinci_docstreet_angular_client_GwtWebAppGinjector_GwtWebAppGinjectorGinjector injector;
  public nl_davinci_docstreet_angular_client_GwtWebAppGinjector_GwtWebAppGinjectorGinjector_fragment(nl_davinci_docstreet_angular_client_GwtWebAppGinjector_GwtWebAppGinjectorGinjector injector) {
    this.injector = injector;
  }
  
}
