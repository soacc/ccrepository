// generated by Glue 8.0 Fix 4 build 5 (wsdl2java) on Sat Feb 01 16:10:42 CET 2014

package com.webmethods.caf.is.wsclient.campusconnect.work.enrollment.setapplicantinfos_wsd_hk1;

import electric.registry.Registry;
import electric.registry.RegistryException;
import electric.util.Context;

public class setApplicantInfos_WSD_HK1Helper
  {
  public static IsetApplicantInfos_WSD_HK1_PortType bind()
    throws RegistryException
    {
    return bind( "file:/C:/Documents and Settings/wir09cdz/Desktop/ccrepository/unterordner/workspace82/CampusConnect_HK/src/com/webmethods/caf/is/wsclient/campusconnect/work/enrollment/setapplicantinfos_wsd_hk1/setApplicantInfos_WSD_HK1.wsdl" );
    }

  public static IsetApplicantInfos_WSD_HK1_PortType bind( String url )
    throws RegistryException
    {
    return bind( url, new Context() );
    }

  public static IsetApplicantInfos_WSD_HK1_PortType bind( String url , Context context )
    throws RegistryException
    {
    return (IsetApplicantInfos_WSD_HK1_PortType) Registry.bind( url, IsetApplicantInfos_WSD_HK1_PortType.class, context );
    }
  }
