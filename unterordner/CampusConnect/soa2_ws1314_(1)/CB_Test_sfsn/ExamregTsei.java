/**
 ** Please don't modify this file.
 ** This file was generated by the EntireX Java Wrapper
 ** from the IDL file EXAMREG.refactored.idl.
 **
 ** @author    Software AG
 ** @version   EntireX Wrapper, Version: 8.2.2.0.186, Date: 04 Nov 2011 (1.132.4.9)
 ** Generated: 2013-11-17 20:31:09.076 +0100
 **/


public class ExamregTsei extends com.softwareag.entirex.aci.Tester2 {

	protected void setFields() {
		addField("1  #EXAMID (P9)",true,false,1,"1");
		addField("1  #COURSEID (P9)",false,true,4,"sei_courseid");
		addField("1  #PROFESSORID (P9)",false,true,4,"sei_professorid");
		addField("1  #EXAMDATE (A32)",false,true,4,"sei_examdate");
		addField("1  #EXAMTIME (A32)",false,true,4,"sei_examtime");
		addField("1  #EXAMROOM (A32)",false,true,4,"sei_examroom");
		addField("1  #AMOUNTREGISTERED (P9)",false,true,4,"sei_amountregistered");
		addField("1  #EQUIVALENTID (P2)",false,true,4,"sei_equivalentid");
		addField("1  #MESSAGE (A40)",false,true,4,"sei_message");
	}

	public static void main(String[] args) {
		new ExamregTsei().test(args, Examreg.class, "sei");
	}
}
