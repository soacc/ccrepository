// generated by Glue 8.0 Fix 4 build 5 (wsdl2java) on Sat Feb 01 12:30:54 CET 2014

package com.webmethods.caf.is.wsclient.campusconnect.work.enrollment.getapplicantinfos_wsd_hk2;

import electric.registry.Registry;
import electric.registry.RegistryException;
import electric.util.Context;

public class getApplicantInfos_WSD_HK2Helper
  {
  public static IgetApplicantInfos_WSD_HK2_PortType bind()
    throws RegistryException
    {
    return bind( "file:/C:/Documents and Settings/wir09cdz/Desktop/ccrepository/unterordner/workspace82/CampusConnect_HK/src/com/webmethods/caf/is/wsclient/campusconnect/work/enrollment/getapplicantinfos_wsd_hk2/getApplicantInfos_WSD_HK2.wsdl" );
    }

  public static IgetApplicantInfos_WSD_HK2_PortType bind( String url )
    throws RegistryException
    {
    return bind( url, new Context() );
    }

  public static IgetApplicantInfos_WSD_HK2_PortType bind( String url , Context context )
    throws RegistryException
    {
    return (IgetApplicantInfos_WSD_HK2_PortType) Registry.bind( url, IgetApplicantInfos_WSD_HK2_PortType.class, context );
    }
  }
