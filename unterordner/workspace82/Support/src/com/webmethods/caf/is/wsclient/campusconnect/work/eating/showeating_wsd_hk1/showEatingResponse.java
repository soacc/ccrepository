// generated by Glue 8.0 Fix 4 build 5 (wsdl2java) on Sun Jan 12 05:17:48 CET 2014

package com.webmethods.caf.is.wsclient.campusconnect.work.eating.showeating_wsd_hk1;

public class showEatingResponse implements java.io.Serializable
  {
  private com.webmethods.caf.is.wsclient.campusconnect.work.eating.showeating_wsd_hk1.mealoffer_local[] mealoffer_local;
  private java.util.Date date;
private com.webmethods.caf.is.wsclient.campusconnect.work.eating.showeating_wsd_hk1.meal_offer mealoffer = new com.webmethods.caf.is.wsclient.campusconnect.work.eating.showeating_wsd_hk1.meal_offer();

  public com.webmethods.caf.is.wsclient.campusconnect.work.eating.showeating_wsd_hk1.meal_offer getMealoffer()
    {
    return mealoffer;
    }

  public void setMealoffer( com.webmethods.caf.is.wsclient.campusconnect.work.eating.showeating_wsd_hk1.meal_offer value )
    {
    this.mealoffer = value;
    }

  public com.webmethods.caf.is.wsclient.campusconnect.work.eating.showeating_wsd_hk1.mealoffer_local[] getMealoffer_local()
    {
    return mealoffer_local;
    }

  public void setMealoffer_local( com.webmethods.caf.is.wsclient.campusconnect.work.eating.showeating_wsd_hk1.mealoffer_local[] value )
    {
    this.mealoffer_local = value;
    }

  public java.util.Date getDate()
    {
    return date;
    }

  public void setDate( java.util.Date value )
    {
    this.date = value;
    }
  }
