// generated by Glue 8.0 Fix 4 build 5 (wsdl2java) on Sat Jan 11 15:44:55 CET 2014

package com.webmethods.caf.is.wsclient.campusconnect.work.searchcourse.searchcourse_wsd_5;

import electric.registry.Registry;
import electric.registry.RegistryException;
import electric.util.Context;

public class searchCourse_WSD_5Helper
  {
  public static IsearchCourse_WSD_5_PortType bind()
    throws RegistryException
    {
    return bind( "file:/C:/Documents and Settings/wir09cdz/workspace82/CampusConnect/src/com/webmethods/caf/is/wsclient/campusconnect/work/searchcourse/searchcourse_wsd_5/searchCourse_WSD_5.wsdl" );
    }

  public static IsearchCourse_WSD_5_PortType bind( String url )
    throws RegistryException
    {
    return bind( url, new Context() );
    }

  public static IsearchCourse_WSD_5_PortType bind( String url , Context context )
    throws RegistryException
    {
    return (IsearchCourse_WSD_5_PortType) Registry.bind( url, IsearchCourse_WSD_5_PortType.class, context );
    }
  }
