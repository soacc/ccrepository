// generated by Glue 8.0 Fix 4 build 5 (wsdl2java) on Fri Jan 31 12:22:24 CET 2014

package com.webmethods.caf.is.wsclient.campusconnect.work.administration.getexmareasons_wsd_mw1;

import electric.registry.Registry;
import electric.registry.RegistryException;
import electric.util.Context;

public class getExmaReasons_WSD_MW1Helper
  {
  public static IgetExmaReasons_WSD_MW1_PortType bind()
    throws RegistryException
    {
    return bind( "file:/C:/Documents and Settings/wir09cdz/Desktop/ccrepository/unterordner/workspace82/CampusConnect_HK/src/com/webmethods/caf/is/wsclient/campusconnect/work/administration/getexmareasons_wsd_mw1/getExmaReasons_WSD_MW1.wsdl" );
    }

  public static IgetExmaReasons_WSD_MW1_PortType bind( String url )
    throws RegistryException
    {
    return bind( url, new Context() );
    }

  public static IgetExmaReasons_WSD_MW1_PortType bind( String url , Context context )
    throws RegistryException
    {
    return (IgetExmaReasons_WSD_MW1_PortType) Registry.bind( url, IgetExmaReasons_WSD_MW1_PortType.class, context );
    }
  }
