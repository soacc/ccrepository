// generated by Glue 8.0 Fix 4 build 5 (wsdl2java) on Sun Jan 12 05:10:21 CET 2014

package com.webmethods.caf.is.wsclient.campusconnect.work.editpersonaldatastud.savepersonaldatastud_wsd_hk1;

import electric.registry.Registry;
import electric.registry.RegistryException;
import electric.util.Context;

public class savePersonalDataStud_WSD_HK1Helper
  {
  public static IsavePersonalDataStud_WSD_HK1_PortType bind()
    throws RegistryException
    {
    return bind( "file:/C:/Documents and Settings/wir09cdz/workspace82/CampusConnect/src/com/webmethods/caf/is/wsclient/campusconnect/work/editpersonaldatastud/savepersonaldatastud_wsd_hk1/savePersonalDataStud_WSD_HK1.wsdl" );
    }

  public static IsavePersonalDataStud_WSD_HK1_PortType bind( String url )
    throws RegistryException
    {
    return bind( url, new Context() );
    }

  public static IsavePersonalDataStud_WSD_HK1_PortType bind( String url , Context context )
    throws RegistryException
    {
    return (IsavePersonalDataStud_WSD_HK1_PortType) Registry.bind( url, IsavePersonalDataStud_WSD_HK1_PortType.class, context );
    }
  }
