// generated by Glue 8.0 Fix 4 build 5 (wsdl2java) on Sun Jan 26 20:15:30 CET 2014

package com.webmethods.caf.is.wsclient.campusconnect.work.coursederegistration.deregistercourses_wsd;

public class deregisterCoursesResponse implements java.io.Serializable
  {
  private com.webmethods.caf.is.wsclient.campusconnect.work.coursederegistration.deregistercourses_wsd.deletedCourses[] deletedCourses;
  private java.lang.String message;
  private java.lang.String hidden;

  public com.webmethods.caf.is.wsclient.campusconnect.work.coursederegistration.deregistercourses_wsd.deletedCourses[] getDeletedCourses()
    {
    return deletedCourses;
    }

  public void setDeletedCourses( com.webmethods.caf.is.wsclient.campusconnect.work.coursederegistration.deregistercourses_wsd.deletedCourses[] value )
    {
    this.deletedCourses = value;
    }

  public java.lang.String getMessage()
    {
    return message;
    }

  public void setMessage( java.lang.String value )
    {
    this.message = value;
    }

  public java.lang.String getHidden()
    {
    return hidden;
    }

  public void setHidden( java.lang.String value )
    {
    this.hidden = value;
    }
  }
