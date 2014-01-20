package com.webmethods.caf.is.wsclient.campusconnect.work.examderegistration.deregisterexam_wsd;


import com.webmethods.caf.faces.data.ws.glue.GlueWSClientContentProvider;

/**
 * Glue Web Service Client bean generated for 
 * com.webmethods.caf.is.wsclient.campusconnect.work.examderegistration.deregisterexam_wsd.IderegisterExam_WSD_PortType.deregisterExam.
 */
public class DeregisterExam1 extends GlueWSClientContentProvider {

	private static final long serialVersionUID = 556126996071382016L;

	/**
	 * Default constructor
	 */
	public DeregisterExam1() {
		super(com.webmethods.caf.is.wsclient.campusconnect.work.examderegistration.deregisterexam_wsd.IderegisterExam_WSD_PortType.class, // port type proxy class
			"deregisterExam", // method to invoke
			new String[] { "deregisterExam", }, // method parameter names
			new Class[] { com.webmethods.caf.is.wsclient.campusconnect.work.examderegistration.deregisterexam_wsd.deregisterExam.class, } // method parameter types
		);
		// wsdl and maps by are saved in the same package
		setWsdlUrl("classpath:deregisterExam_WSD.wsdl");
		setMapUrls(new String[] { "classpath:deregisterExam_WSD.map", });

		// init wsclient
		initParams();
		
		// parameters bean
		parameters = new Parameters();
		
		// complex output, just a place holder
		result = new com.webmethods.caf.is.wsclient.campusconnect.work.examderegistration.deregisterexam_wsd.deregisterExamResponse();
		
	}
	
	
	/**
	 * Method parameters bean
	 */
	public class Parameters  implements java.io.Serializable {

		private static final long serialVersionUID = 1565032575623717888L;

		public Parameters() {
		}
	
		private com.webmethods.caf.is.wsclient.campusconnect.work.examderegistration.deregisterexam_wsd.deregisterExam deregisterExam  = new  com.webmethods.caf.is.wsclient.campusconnect.work.examderegistration.deregisterexam_wsd.deregisterExam() ;

		public com.webmethods.caf.is.wsclient.campusconnect.work.examderegistration.deregisterexam_wsd.deregisterExam getDeregisterExam() {
			return deregisterExam;
		}

		public void setDeregisterExam(com.webmethods.caf.is.wsclient.campusconnect.work.examderegistration.deregisterexam_wsd.deregisterExam deregisterExam) {
			this.deregisterExam = deregisterExam;
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
	public com.webmethods.caf.is.wsclient.campusconnect.work.examderegistration.deregisterexam_wsd.deregisterExamResponse getResult() {
		return (com.webmethods.caf.is.wsclient.campusconnect.work.examderegistration.deregisterexam_wsd.deregisterExamResponse)result;
	}
	

		
}