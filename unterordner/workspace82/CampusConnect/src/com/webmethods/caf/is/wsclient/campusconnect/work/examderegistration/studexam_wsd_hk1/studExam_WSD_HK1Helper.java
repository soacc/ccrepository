// generated by Glue 8.0 Fix 4 build 5 (wsdl2java) on Sun Jan 12 20:56:50 CET 2014

package com.webmethods.caf.is.wsclient.campusconnect.work.examderegistration.studexam_wsd_hk1;

import electric.registry.Registry;
import electric.registry.RegistryException;
import electric.util.Context;

public class studExam_WSD_HK1Helper
  {
  public static IstudExam_WSD_HK1_PortType bind()
    throws RegistryException
    {
    return bind( "file:/C:/Documents and Settings/wir09cdz/workspace82/CampusConnect/src/com/webmethods/caf/is/wsclient/campusconnect/work/examderegistration/studexam_wsd_hk1/studExam_WSD_HK1.wsdl" );
    }

  public static IstudExam_WSD_HK1_PortType bind( String url )
    throws RegistryException
    {
    return bind( url, new Context() );
    }

  public static IstudExam_WSD_HK1_PortType bind( String url , Context context )
    throws RegistryException
    {
    return (IstudExam_WSD_HK1_PortType) Registry.bind( url, IstudExam_WSD_HK1_PortType.class, context );
    }
  }
