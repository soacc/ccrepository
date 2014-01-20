package com.webmethods.caf.is.wsclient.campusconnect.work.examderegistration.deregisterexam_wsd_hk1;


import com.webmethods.caf.faces.data.ws.glue.GlueWSClientContentProvider;

/**
 * Glue Web Service Client bean generated for 
 * com.webmethods.caf.is.wsclient.campusconnect.work.examderegistration.deregisterexam_wsd_hk1.IderegisterExam_WSD_HK1_PortType.deregisterExam.
 */
public class DeregisterExam1 extends GlueWSClientContentProvider {

	private static final long serialVersionUID = 4271907984315348992L;

	/**
	 * Default constructor
	 */
	public DeregisterExam1() {
		super(com.webmethods.caf.is.wsclient.campusconnect.work.examderegistration.deregisterexam_wsd_hk1.IderegisterExam_WSD_HK1_PortType.class, // port type proxy class
			"deregisterExam", // method to invoke
			new String[] { "deregisterExam", }, // method parameter names
			new Class[] { com.webmethods.caf.is.wsclient.campusconnect.work.examderegistration.deregisterexam_wsd_hk1.deregisterExam.class, } // method parameter types
		);
		// wsdl and maps by are saved in the same package
		setWsdlUrl("classpath:deregisterExam_WSD_HK1.wsdl");
		setMapUrls(new String[] { "classpath:deregisterExam_WSD_HK1.map", });

		// init wsclient
		initParams();
		
		// parameters bean
		parameters = new Parameters();
		
		// complex output, just a place holder
		result = new com.webmethods.caf.is.wsclient.campusconnect.work.examderegistration.deregisterexam_wsd_hk1.deregisterExamResponse();
		
	}
	
	
	/**
	 * Method parameters bean
	 */
	public class Parameters  implements java.io.Serializable {

		private static final long serialVersionUID = 2924193856564377600L;

		public Parameters() {
		}
	
		private com.webmethods.caf.is.wsclient.campusconnect.work.examderegistration.deregisterexam_wsd_hk1.deregisterExam deregisterExam  = new  com.webmethods.caf.is.wsclient.campusconnect.work.examderegistration.deregisterexam_wsd_hk1.deregisterExam() ;

		public com.webmethods.caf.is.wsclient.campusconnect.work.examderegistration.deregisterexam_wsd_hk1.deregisterExam getDeregisterExam() {
			return deregisterExam;
		}

		public void setDeregisterExam(com.webmethods.caf.is.wsclient.campusconnect.work.examderegistration.deregisterexam_wsd_hk1.deregisterExam deregisterExam) {
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
	public com.webmethods.caf.is.wsclient.campusconnect.work.examderegistration.deregisterexam_wsd_hk1.deregisterExamResponse getResult() {
		return (com.webmethods.caf.is.wsclient.campusconnect.work.examderegistration.deregisterexam_wsd_hk1.deregisterExamResponse)result;
	}
	

		
}