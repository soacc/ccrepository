package com.webmethods.caf.is.wsclient.campusconnect.utils.exams.getexamfromcourse_wsd_hk1;


import com.webmethods.caf.faces.data.ws.glue.GlueWSClientContentProvider;

/**
 * Glue Web Service Client bean generated for 
 * com.webmethods.caf.is.wsclient.campusconnect.utils.exams.getexamfromcourse_wsd_hk1.IgetExamFromCourse_WSD_HK1_PortType.getExamFromCourse.
 */
public class GetExamFromCourse3 extends GlueWSClientContentProvider {

	private static final long serialVersionUID = 435055603921575936L;

	/**
	 * Default constructor
	 */
	public GetExamFromCourse3() {
		super(com.webmethods.caf.is.wsclient.campusconnect.utils.exams.getexamfromcourse_wsd_hk1.IgetExamFromCourse_WSD_HK1_PortType.class, // port type proxy class
			"getExamFromCourse", // method to invoke
			new String[] { "getExamFromCourse", }, // method parameter names
			new Class[] { com.webmethods.caf.is.wsclient.campusconnect.utils.exams.getexamfromcourse_wsd_hk1.getExamFromCourse.class, } // method parameter types
		);
		// wsdl and maps by are saved in the same package
		setWsdlUrl("classpath:getExamFromCourse_WSD_HK1.wsdl");
		setMapUrls(new String[] { "classpath:getExamFromCourse_WSD_HK1.map", });

		// init wsclient
		initParams();
		
		// parameters bean
		parameters = new Parameters();
		
		// complex output, just a place holder
		result = new com.webmethods.caf.is.wsclient.campusconnect.utils.exams.getexamfromcourse_wsd_hk1.getExamFromCourseResponse();
		
	}
	
	
	/**
	 * Method parameters bean
	 */
	public class Parameters  implements java.io.Serializable {

		private static final long serialVersionUID = 1096291917196274688L;

		public Parameters() {
		}
	
		private com.webmethods.caf.is.wsclient.campusconnect.utils.exams.getexamfromcourse_wsd_hk1.getExamFromCourse getExamFromCourse  = new  com.webmethods.caf.is.wsclient.campusconnect.utils.exams.getexamfromcourse_wsd_hk1.getExamFromCourse() ;

		public com.webmethods.caf.is.wsclient.campusconnect.utils.exams.getexamfromcourse_wsd_hk1.getExamFromCourse getGetExamFromCourse() {
			return getExamFromCourse;
		}

		public void setGetExamFromCourse(com.webmethods.caf.is.wsclient.campusconnect.utils.exams.getexamfromcourse_wsd_hk1.getExamFromCourse getExamFromCourse) {
			this.getExamFromCourse = getExamFromCourse;
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
	public com.webmethods.caf.is.wsclient.campusconnect.utils.exams.getexamfromcourse_wsd_hk1.getExamFromCourseResponse getResult() {
		return (com.webmethods.caf.is.wsclient.campusconnect.utils.exams.getexamfromcourse_wsd_hk1.getExamFromCourseResponse)result;
	}
	

		
}