/**
 ** Please don't modify this file.
 ** This file was generated by the EntireX Java Wrapper
 ** from the IDL file EXAMREG.refactored.idl.
 **
 ** @author    Software AG
 ** @version   EntireX Wrapper, Version: 8.2.2.0.186, Date: 04 Nov 2011 (1.132.4.9)
 ** Generated: 2013-11-17 20:31:09.076 +0100
 **/


public class ExamregTscm extends com.softwareag.entirex.aci.Tester2 {

	protected void setFields() {
		addField("1  #COURSEID (P9)",true,false,1,"1");
		addField("1  #PROFESSORID (P9)",true,false,1,"2");
		addField("1  #COURSENAME (A32)",true,false,1,"3");
		addField("1  #TERM (A32)",true,false,1,"4");
		addField("1  #MAXPARTICIPANTS (P9)",true,false,1,"5");
		addField("1  #COURSEDAY (A32)",true,false,1,"6");
		addField("1  #COURSETIME (A32)",true,false,1,"7");
		addField("1  #COURSEROOM (A32)",true,false,1,"8");
		addField("1  #COURSEFINISH (P1)",true,false,1,"9");
		addField("1  #MESSAGE (A40)",false,true,4,"scm_message");
	}

	public static void main(String[] args) {
		new ExamregTscm().test(args, Examreg.class, "scm");
	}
}
