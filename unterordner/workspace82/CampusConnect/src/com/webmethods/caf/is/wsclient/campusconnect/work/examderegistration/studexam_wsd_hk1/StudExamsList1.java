package com.webmethods.caf.is.wsclient.campusconnect.work.examderegistration.studexam_wsd_hk1;


import com.webmethods.caf.faces.data.ws.glue.GlueWSClientContentProvider;

/**
 * Glue Web Service Client bean generated for 
 * com.webmethods.caf.is.wsclient.campusconnect.work.examderegistration.studexam_wsd_hk1.IstudExam_WSD_HK1_PortType.studExamsList.
 */
public class StudExamsList1 extends GlueWSClientContentProvider {

	private static final long serialVersionUID = 6597159202872301568L;

	/**
	 * Default constructor
	 */
	public StudExamsList1() {
		super(com.webmethods.caf.is.wsclient.campusconnect.work.examderegistration.studexam_wsd_hk1.IstudExam_WSD_HK1_PortType.class, // port type proxy class
			"studExamsList", // method to invoke
			new String[] { "studExamsList", }, // method parameter names
			new Class[] { com.webmethods.caf.is.wsclient.campusconnect.work.examderegistration.studexam_wsd_hk1.studExamsList.class, } // method parameter types
		);
		// wsdl and maps by are saved in the same package
		setWsdlUrl("classpath:studExam_WSD_HK1.wsdl");
		setMapUrls(new String[] { "classpath:studExam_WSD_HK1.map", });

		// init wsclient
		initParams();
		
		// parameters bean
		parameters = new Parameters();
		
		// complex output, just a place holder
		result = new com.webmethods.caf.is.wsclient.campusconnect.work.examderegistration.studexam_wsd_hk1.studExamsListResponse();
		
	}
	
	
	/**
	 * Method parameters bean
	 */
	public class Parameters  implements java.io.Serializable {

		private static final long serialVersionUID = 8381467843929145344L;

		public Parameters() {
		}
	
		private com.webmethods.caf.is.wsclient.campusconnect.work.examderegistration.studexam_wsd_hk1.studExamsList studExamsList  = new  com.webmethods.caf.is.wsclient.campusconnect.work.examderegistration.studexam_wsd_hk1.studExamsList() ;

		public com.webmethods.caf.is.wsclient.campusconnect.work.examderegistration.studexam_wsd_hk1.studExamsList getStudExamsList() {
			return studExamsList;
		}

		public void setStudExamsList(com.webmethods.caf.is.wsclient.campusconnect.work.examderegistration.studexam_wsd_hk1.studExamsList studExamsList) {
			this.studExamsList = studExamsList;
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
	public com.webmethods.caf.is.wsclient.campusconnect.work.examderegistration.studexam_wsd_hk1.studExamsListResponse getResult() {
		return (com.webmethods.caf.is.wsclient.campusconnect.work.examderegistration.studexam_wsd_hk1.studExamsListResponse)result;
	}
	

		
}