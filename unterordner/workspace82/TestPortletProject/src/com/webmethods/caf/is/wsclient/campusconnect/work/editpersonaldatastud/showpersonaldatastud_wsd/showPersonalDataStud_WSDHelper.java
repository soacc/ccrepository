// generated by Glue 8.0 Fix 4 build 5 (wsdl2java) on Sun Jan 26 11:31:39 CET 2014

package com.webmethods.caf.is.wsclient.campusconnect.work.editpersonaldatastud.showpersonaldatastud_wsd;

import electric.registry.Registry;
import electric.registry.RegistryException;
import electric.util.Context;

public class showPersonalDataStud_WSDHelper
  {
  public static IshowPersonalDataStud_WSD_PortType bind()
    throws RegistryException
    {
    return bind( "file:/C:/Documents and Settings/wir09cdz/Desktop/ccrepository/unterordner/workspace82/TestPortletProject/src/com/webmethods/caf/is/wsclient/campusconnect/work/editpersonaldatastud/showpersonaldatastud_wsd/showPersonalDataStud_WSD.wsdl" );
    }

  public static IshowPersonalDataStud_WSD_PortType bind( String url )
    throws RegistryException
    {
    return bind( url, new Context() );
    }

  public static IshowPersonalDataStud_WSD_PortType bind( String url , Context context )
    throws RegistryException
    {
    return (IshowPersonalDataStud_WSD_PortType) Registry.bind( url, IshowPersonalDataStud_WSD_PortType.class, context );
    }
  }