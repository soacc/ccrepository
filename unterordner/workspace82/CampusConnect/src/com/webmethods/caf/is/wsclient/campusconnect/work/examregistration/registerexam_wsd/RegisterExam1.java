package com.webmethods.caf.is.wsclient.campusconnect.work.examregistration.registerexam_wsd;


import com.webmethods.caf.faces.data.ws.glue.GlueWSClientContentProvider;

/**
 * Glue Web Service Client bean generated for 
 * com.webmethods.caf.is.wsclient.campusconnect.work.examregistration.registerexam_wsd.IregisterExam_WSD_PortType.registerExam.
 */
public class RegisterExam1 extends GlueWSClientContentProvider {

	private static final long serialVersionUID = 1457319246157629440L;

	/**
	 * Default constructor
	 */
	public RegisterExam1() {
		super(com.webmethods.caf.is.wsclient.campusconnect.work.examregistration.registerexam_wsd.IregisterExam_WSD_PortType.class, // port type proxy class
			"registerExam", // method to invoke
			new String[] { "registerExam", }, // method parameter names
			new Class[] { com.webmethods.caf.is.wsclient.campusconnect.work.examregistration.registerexam_wsd.registerExam.class, } // method parameter types
		);
		// wsdl and maps by are saved in the same package
		setWsdlUrl("classpath:registerExam_WSD.wsdl");
		setMapUrls(new String[] { "classpath:registerExam_WSD.map", });

		// init wsclient
		initParams();
		
		// parameters bean
		parameters = new Parameters();
		
		// complex output, just a place holder
		result = new com.webmethods.caf.is.wsclient.campusconnect.work.examregistration.registerexam_wsd.registerExamResponse();
		
	}
	
	
	/**
	 * Method parameters bean
	 */
	public class Parameters  implements java.io.Serializable {

		private static final long serialVersionUID = 4904152375926236160L;

		public Parameters() {
		}
	
		private com.webmethods.caf.is.wsclient.campusconnect.work.examregistration.registerexam_wsd.registerExam registerExam  = new  com.webmethods.caf.is.wsclient.campusconnect.work.examregistration.registerexam_wsd.registerExam() ;

		public com.webmethods.caf.is.wsclient.campusconnect.work.examregistration.registerexam_wsd.registerExam getRegisterExam() {
			return registerExam;
		}

		public void setRegisterExam(com.webmethods.caf.is.wsclient.campusconnect.work.examregistration.registerexam_wsd.registerExam registerExam) {
			this.registerExam = registerExam;
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
	public com.webmethods.caf.is.wsclient.campusconnect.work.examregistration.registerexam_wsd.registerExamResponse getResult() {
		return (com.webmethods.caf.is.wsclient.campusconnect.work.examregistration.registerexam_wsd.registerExamResponse)result;
	}
	

		
}