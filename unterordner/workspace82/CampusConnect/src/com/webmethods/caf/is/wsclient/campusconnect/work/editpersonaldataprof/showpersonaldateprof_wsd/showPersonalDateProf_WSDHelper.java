// generated by Glue 8.0 Fix 4 build 5 (wsdl2java) on Sun Jan 12 13:50:31 CET 2014

package com.webmethods.caf.is.wsclient.campusconnect.work.editpersonaldataprof.showpersonaldateprof_wsd;

import electric.registry.Registry;
import electric.registry.RegistryException;
import electric.util.Context;

public class showPersonalDateProf_WSDHelper
  {
  public static IshowPersonalDateProf_WSD_PortType bind()
    throws RegistryException
    {
    return bind( "file:/C:/Documents and Settings/wir09cdz/workspace82/CampusConnect/src/com/webmethods/caf/is/wsclient/campusconnect/work/editpersonaldataprof/showpersonaldateprof_wsd/showPersonalDateProf_WSD.wsdl" );
    }

  public static IshowPersonalDateProf_WSD_PortType bind( String url )
    throws RegistryException
    {
    return bind( url, new Context() );
    }

  public static IshowPersonalDateProf_WSD_PortType bind( String url , Context context )
    throws RegistryException
    {
    return (IshowPersonalDateProf_WSD_PortType) Registry.bind( url, IshowPersonalDateProf_WSD_PortType.class, context );
    }
  }
