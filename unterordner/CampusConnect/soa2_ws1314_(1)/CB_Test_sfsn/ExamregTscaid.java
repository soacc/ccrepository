/**
 ** Please don't modify this file.
 ** This file was generated by the EntireX Java Wrapper
 ** from the IDL file EXAMREG.refactored.idl.
 **
 ** @author    Software AG
 ** @version   EntireX Wrapper, Version: 8.2.2.0.186, Date: 04 Nov 2011 (1.132.4.9)
 ** Generated: 2013-11-17 20:31:09.076 +0100
 **/


public class ExamregTscaid extends com.softwareag.entirex.aci.Tester2 {

	protected void setFields() {
		addField("1  #COURSEID (P9)",false,true,4,"scaid_courseid");
	}

	public static void main(String[] args) {
		new ExamregTscaid().test(args, Examreg.class, "scaid");
	}
}