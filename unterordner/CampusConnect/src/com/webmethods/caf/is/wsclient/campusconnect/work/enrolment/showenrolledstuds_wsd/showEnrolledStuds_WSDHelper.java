// generated by Glue 8.0 Fix 4 build 5 (wsdl2java) on Wed Dec 25 21:54:29 CET 2013

package com.webmethods.caf.is.wsclient.campusconnect.work.enrolment.showenrolledstuds_wsd;

import electric.registry.Registry;
import electric.registry.RegistryException;
import electric.util.Context;

public class showEnrolledStuds_WSDHelper
  {
  public static IshowEnrolledStuds_WSD_PortType bind()
    throws RegistryException
    {
    return bind( "file:/C:/Documents and Settings/wir09cdz/workspace82/CampusConnect/src/com/webmethods/caf/is/wsclient/campusconnect/work/enrolment/showenrolledstuds_wsd/showEnrolledStuds_WSD.wsdl" );
    }

  public static IshowEnrolledStuds_WSD_PortType bind( String url )
    throws RegistryException
    {
    return bind( url, new Context() );
    }

  public static IshowEnrolledStuds_WSD_PortType bind( String url , Context context )
    throws RegistryException
    {
    return (IshowEnrolledStuds_WSD_PortType) Registry.bind( url, IshowEnrolledStuds_WSD_PortType.class, context );
    }
  }
