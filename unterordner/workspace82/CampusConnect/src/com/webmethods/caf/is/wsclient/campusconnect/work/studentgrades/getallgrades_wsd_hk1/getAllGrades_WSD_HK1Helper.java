// generated by Glue 8.0 Fix 4 build 5 (wsdl2java) on Sun Jan 26 12:31:15 CET 2014

package com.webmethods.caf.is.wsclient.campusconnect.work.studentgrades.getallgrades_wsd_hk1;

import electric.registry.Registry;
import electric.registry.RegistryException;
import electric.util.Context;

public class getAllGrades_WSD_HK1Helper
  {
  public static IgetAllGrades_WSD_HK1_PortType bind()
    throws RegistryException
    {
    return bind( "file:/C:/Documents and Settings/wir09cdz/Desktop/ccrepository/unterordner/workspace82/CampusConnect/src/com/webmethods/caf/is/wsclient/campusconnect/work/studentgrades/getallgrades_wsd_hk1/getAllGrades_WSD_HK1.wsdl" );
    }

  public static IgetAllGrades_WSD_HK1_PortType bind( String url )
    throws RegistryException
    {
    return bind( url, new Context() );
    }

  public static IgetAllGrades_WSD_HK1_PortType bind( String url , Context context )
    throws RegistryException
    {
    return (IgetAllGrades_WSD_HK1_PortType) Registry.bind( url, IgetAllGrades_WSD_HK1_PortType.class, context );
    }
  }
