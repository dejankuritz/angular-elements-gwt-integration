package com.google.gwt.i18n.client.impl;

import com.google.gwt.core.client.GWT;
import com.google.gwt.i18n.client.LocaleInfo;
import com.google.gwt.i18n.client.constants.NumberConstants;
import com.google.gwt.i18n.client.constants.NumberConstantsImpl;
import com.google.gwt.i18n.client.DateTimeFormatInfo;
import com.google.gwt.i18n.client.impl.cldr.DateTimeFormatInfoImpl;

public class LocaleInfoImpl_fr extends LocaleInfoImpl_shared {
  @Override
  public String getLocaleName() {
    return "fr";
  }
  
  @Override
  public String getLocaleQueryParam() {
    return "locale";
  }
  
  @Override
  public DateTimeFormatInfo getDateTimeFormatInfo() {
    return GWT.create(com.google.gwt.i18n.client.impl.cldr.DateTimeFormatInfoImpl.class);
  }
  
  @Override
  public NumberConstants getNumberConstants() {
    return GWT.create(com.google.gwt.i18n.client.constants.NumberConstantsImpl.class);
  }
}
