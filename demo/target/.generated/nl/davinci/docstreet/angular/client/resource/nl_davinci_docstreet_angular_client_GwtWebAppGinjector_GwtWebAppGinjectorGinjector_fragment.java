package nl.davinci.docstreet.angular.client.resource;

import com.google.gwt.core.client.GWT;
import nl.davinci.docstreet.angular.client.nl_davinci_docstreet_angular_client_GwtWebAppGinjector_GwtWebAppGinjectorGinjector;

public class nl_davinci_docstreet_angular_client_GwtWebAppGinjector_GwtWebAppGinjectorGinjector_fragment {
  public void memberInject_Key$type$nl$davinci$docstreet$angular$client$resource$ApplicationResources$_annotation$$none$$(nl.davinci.docstreet.angular.client.resource.ApplicationResources injectee) {
    
  }
  
  public void memberInject_Key$type$nl$davinci$docstreet$angular$client$resource$Messages$_annotation$$none$$(nl.davinci.docstreet.angular.client.resource.Messages injectee) {
    
  }
  
  private nl.davinci.docstreet.angular.client.resource.ApplicationResources singleton_Key$type$nl$davinci$docstreet$angular$client$resource$ApplicationResources$_annotation$$none$$ = null;
  
  public nl.davinci.docstreet.angular.client.resource.ApplicationResources get_Key$type$nl$davinci$docstreet$angular$client$resource$ApplicationResources$_annotation$$none$$() {
    
    if (singleton_Key$type$nl$davinci$docstreet$angular$client$resource$ApplicationResources$_annotation$$none$$ == null) {
    Object created = GWT.create(nl.davinci.docstreet.angular.client.resource.ApplicationResources.class);
    assert created instanceof nl.davinci.docstreet.angular.client.resource.ApplicationResources;
    nl.davinci.docstreet.angular.client.resource.ApplicationResources result = (nl.davinci.docstreet.angular.client.resource.ApplicationResources) created;
    
    memberInject_Key$type$nl$davinci$docstreet$angular$client$resource$ApplicationResources$_annotation$$none$$(result);
    
        singleton_Key$type$nl$davinci$docstreet$angular$client$resource$ApplicationResources$_annotation$$none$$ = result;
    }
    return singleton_Key$type$nl$davinci$docstreet$angular$client$resource$ApplicationResources$_annotation$$none$$;
    
  }
  
  private nl.davinci.docstreet.angular.client.resource.Messages singleton_Key$type$nl$davinci$docstreet$angular$client$resource$Messages$_annotation$$none$$ = null;
  
  public nl.davinci.docstreet.angular.client.resource.Messages get_Key$type$nl$davinci$docstreet$angular$client$resource$Messages$_annotation$$none$$() {
    
    if (singleton_Key$type$nl$davinci$docstreet$angular$client$resource$Messages$_annotation$$none$$ == null) {
    Object created = GWT.create(nl.davinci.docstreet.angular.client.resource.Messages.class);
    assert created instanceof nl.davinci.docstreet.angular.client.resource.Messages;
    nl.davinci.docstreet.angular.client.resource.Messages result = (nl.davinci.docstreet.angular.client.resource.Messages) created;
    
    memberInject_Key$type$nl$davinci$docstreet$angular$client$resource$Messages$_annotation$$none$$(result);
    
        singleton_Key$type$nl$davinci$docstreet$angular$client$resource$Messages$_annotation$$none$$ = result;
    }
    return singleton_Key$type$nl$davinci$docstreet$angular$client$resource$Messages$_annotation$$none$$;
    
  }
  
  
  /**
   * Field for the enclosing injector.
   */
  private final nl_davinci_docstreet_angular_client_GwtWebAppGinjector_GwtWebAppGinjectorGinjector injector;
  public nl_davinci_docstreet_angular_client_GwtWebAppGinjector_GwtWebAppGinjectorGinjector_fragment(nl_davinci_docstreet_angular_client_GwtWebAppGinjector_GwtWebAppGinjectorGinjector injector) {
    this.injector = injector;
  }
  
}
