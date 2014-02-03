package com.webmethods.caf.is.wsclient.campusconnect.work.gradesubmission.submitgrade_wsd_hk3;


import com.webmethods.caf.faces.data.ws.glue.GlueWSClientContentProvider;

/**
 * Glue Web Service Client bean generated for 
 * com.webmethods.caf.is.wsclient.campusconnect.work.gradesubmission.submitgrade_wsd_hk3.IsubmitGrade_WSD_HK3_PortType.submitGrade.
 */
public class SubmitGrade2 extends GlueWSClientContentProvider {

	private static final long serialVersionUID = 3912702094318149632L;

	/**
	 * Default constructor
	 */
	public SubmitGrade2() {
		super(com.webmethods.caf.is.wsclient.campusconnect.work.gradesubmission.submitgrade_wsd_hk3.IsubmitGrade_WSD_HK3_PortType.class, // port type proxy class
			"submitGrade", // method to invoke
			new String[] { "submitGrade", }, // method parameter names
			new Class[] { com.webmethods.caf.is.wsclient.campusconnect.work.gradesubmission.submitgrade_wsd_hk3.submitGrade.class, } // method parameter types
		);
		// wsdl and maps by are saved in the same package
		setWsdlUrl("classpath:submitGrade_WSD_HK3.wsdl");
		setMapUrls(new String[] { "classpath:submitGrade_WSD_HK3.map", });

		// init wsclient
		initParams();
		
		// parameters bean
		parameters = new Parameters();
		
		// complex output, just a place holder
		result = new com.webmethods.caf.is.wsclient.campusconnect.work.gradesubmission.submitgrade_wsd_hk3.submitGradeResponse();
		
	}
	
	
	/**
	 * Method parameters bean
	 */
	public class Parameters  implements java.io.Serializable {

		private static final long serialVersionUID = 5614391632872012800L;

		public Parameters() {
		}
	
		private com.webmethods.caf.is.wsclient.campusconnect.work.gradesubmission.submitgrade_wsd_hk3.submitGrade submitGrade  = new  com.webmethods.caf.is.wsclient.campusconnect.work.gradesubmission.submitgrade_wsd_hk3.submitGrade() ;

		public com.webmethods.caf.is.wsclient.campusconnect.work.gradesubmission.submitgrade_wsd_hk3.submitGrade getSubmitGrade() {
			return submitGrade;
		}

		public void setSubmitGrade(com.webmethods.caf.is.wsclient.campusconnect.work.gradesubmission.submitgrade_wsd_hk3.submitGrade submitGrade) {
			this.submitGrade = submitGrade;
		} 	
		
	}
	
	
	
	/**
	 * Return method invocation parameters bean
	 */
	public Parameters getParameters() {
		return (Parameters)parameters;
	}	
	


	
	/**
	 * Return method invocation result
	 */
	public com.webmethods.caf.is.wsclient.campusconnect.work.gradesubmission.submitgrade_wsd_hk3.submitGradeResponse getResult() {
		return (com.webmethods.caf.is.wsclient.campusconnect.work.gradesubmission.submitgrade_wsd_hk3.submitGradeResponse)result;
	}
	

		
}