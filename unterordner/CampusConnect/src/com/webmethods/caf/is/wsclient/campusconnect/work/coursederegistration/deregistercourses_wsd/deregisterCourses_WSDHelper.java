// generated by Glue 8.0 Fix 4 build 5 (wsdl2java) on Wed Dec 25 20:45:19 CET 2013

package com.webmethods.caf.is.wsclient.campusconnect.work.coursederegistration.deregistercourses_wsd;

import electric.registry.Registry;
import electric.registry.RegistryException;
import electric.util.Context;

public class deregisterCourses_WSDHelper
  {
  public static IderegisterCourses_WSD_PortType bind()
    throws RegistryException
    {
    return bind( "file:/C:/Documents and Settings/wir09cdz/workspace82/CampusConnect/src/com/webmethods/caf/is/wsclient/campusconnect/work/coursederegistration/deregistercourses_wsd/deregisterCourses_WSD.wsdl" );
    }

  public static IderegisterCourses_WSD_PortType bind( String url )
    throws RegistryException
    {
    return bind( url, new Context() );
    }

  public static IderegisterCourses_WSD_PortType bind( String url , Context context )
    throws RegistryException
    {
    return (IderegisterCourses_WSD_PortType) Registry.bind( url, IderegisterCourses_WSD_PortType.class, context );
    }
  }