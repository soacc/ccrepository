// generated by Glue 8.0 Fix 4 build 5 (wsdl2java) on Fri Jan 31 13:10:41 CET 2014

package com.webmethods.caf.is.wsclient.campusconnect.work.gradesubmission.submitgrade_wsd_hk3;

import electric.registry.Registry;
import electric.registry.RegistryException;
import electric.util.Context;

public class submitGrade_WSD_HK3Helper
  {
  public static IsubmitGrade_WSD_HK3_PortType bind()
    throws RegistryException
    {
    return bind( "file:/C:/Documents and Settings/wir09cdz/Desktop/ccrepository/unterordner/workspace82/CampusConnect_HK/src/com/webmethods/caf/is/wsclient/campusconnect/work/gradesubmission/submitgrade_wsd_hk3/submitGrade_WSD_HK3.wsdl" );
    }

  public static IsubmitGrade_WSD_HK3_PortType bind( String url )
    throws RegistryException
    {
    return bind( url, new Context() );
    }

  public static IsubmitGrade_WSD_HK3_PortType bind( String url , Context context )
    throws RegistryException
    {
    return (IsubmitGrade_WSD_HK3_PortType) Registry.bind( url, IsubmitGrade_WSD_HK3_PortType.class, context );
    }
  }
