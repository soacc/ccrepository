// generated by Glue 8.0 Fix 4 build 5 (wsdl2java) on Fri Jan 24 12:01:56 CET 2014

package com.webmethods.caf.is.wsclient.campusconnect.work.enrollment.getapplicantinfos_wsd_hk1;

import electric.registry.Registry;
import electric.registry.RegistryException;
import electric.util.Context;

public class getApplicantInfos_WSD_HK1Helper
  {
  public static IgetApplicantInfos_WSD_HK1_PortType bind()
    throws RegistryException
    {
    return bind( "file:/C:/Documents and Settings/wir09cdz/Desktop/ccrepository/unterordner/workspace82/CampusConnect/src/com/webmethods/caf/is/wsclient/campusconnect/work/enrollment/getapplicantinfos_wsd_hk1/getApplicantInfos_WSD_HK1.wsdl" );
    }

  public static IgetApplicantInfos_WSD_HK1_PortType bind( String url )
    throws RegistryException
    {
    return bind( url, new Context() );
    }

  public static IgetApplicantInfos_WSD_HK1_PortType bind( String url , Context context )
    throws RegistryException
    {
    return (IgetApplicantInfos_WSD_HK1_PortType) Registry.bind( url, IgetApplicantInfos_WSD_HK1_PortType.class, context );
    }
  }
