// generated by Glue 8.0 Fix 4 build 5 (wsdl2java) on Thu Jan 30 20:49:54 CET 2014

package com.webmethods.caf.is.wsclient.campusconnect.work.gradesubmission.submitgrade_wsd_hk2;

public class submitGrade implements java.io.Serializable
  {
  private com.webmethods.caf.is.wsclient.campusconnect.work.gradesubmission.submitgrade_wsd_hk2.StudentsGrade[] StudentsGrade;
  private java.lang.String StudentId;
  private java.lang.String CourseId;
  private java.lang.String Grade;

  public com.webmethods.caf.is.wsclient.campusconnect.work.gradesubmission.submitgrade_wsd_hk2.StudentsGrade[] getStudentsGrade()
    {
    return StudentsGrade;
    }

  public void setStudentsGrade( com.webmethods.caf.is.wsclient.campusconnect.work.gradesubmission.submitgrade_wsd_hk2.StudentsGrade[] value )
    {
    this.StudentsGrade = value;
    }

  public java.lang.String getStudentId()
    {
    return StudentId;
    }

  public void setStudentId( java.lang.String value )
    {
    this.StudentId = value;
    }

  public java.lang.String getCourseId()
    {
    return CourseId;
    }

  public void setCourseId( java.lang.String value )
    {
    this.CourseId = value;
    }

  public java.lang.String getGrade()
    {
    return Grade;
    }

  public void setGrade( java.lang.String value )
    {
    this.Grade = value;
    }
  }