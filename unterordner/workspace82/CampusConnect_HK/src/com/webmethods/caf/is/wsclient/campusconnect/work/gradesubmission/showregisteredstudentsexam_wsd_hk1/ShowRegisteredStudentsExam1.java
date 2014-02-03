package com.webmethods.caf.is.wsclient.campusconnect.work.gradesubmission.showregisteredstudentsexam_wsd_hk1;


import com.webmethods.caf.faces.data.ws.glue.GlueWSClientContentProvider;

/**
 * Glue Web Service Client bean generated for 
 * com.webmethods.caf.is.wsclient.campusconnect.work.gradesubmission.showregisteredstudentsexam_wsd_hk1.IshowRegisteredStudentsExam_WSD_HK1_PortType.showRegisteredStudentsExam.
 */
public class ShowRegisteredStudentsExam1 extends GlueWSClientContentProvider {

	private static final long serialVersionUID = 5096931802291915776L;

	/**
	 * Default constructor
	 */
	public ShowRegisteredStudentsExam1() {
		super(com.webmethods.caf.is.wsclient.campusconnect.work.gradesubmission.showregisteredstudentsexam_wsd_hk1.IshowRegisteredStudentsExam_WSD_HK1_PortType.class, // port type proxy class
			"showRegisteredStudentsExam", // method to invoke
			new String[] { "showRegisteredStudentsExam", }, // method parameter names
			new Class[] { com.webmethods.caf.is.wsclient.campusconnect.work.gradesubmission.showregisteredstudentsexam_wsd_hk1.showRegisteredStudentsExam.class, } // method parameter types
		);
		// wsdl and maps by are saved in the same package
		setWsdlUrl("classpath:showRegisteredStudentsExam_WSD_HK1.wsdl");
		setMapUrls(new String[] { "classpath:showRegisteredStudentsExam_WSD_HK1.map", });

		// init wsclient
		initParams();
		
		// parameters bean
		parameters = new Parameters();
		
		// complex output, just a place holder
		result = new com.webmethods.caf.is.wsclient.campusconnect.work.gradesubmission.showregisteredstudentsexam_wsd_hk1.showRegisteredStudentsExamResponse();
		
	}
	
	
	/**
	 * Method parameters bean
	 */
	public class Parameters  implements java.io.Serializable {

		private static final long serialVersionUID = 194506143422924800L;

		public Parameters() {
		}
	
		private com.webmethods.caf.is.wsclient.campusconnect.work.gradesubmission.showregisteredstudentsexam_wsd_hk1.showRegisteredStudentsExam showRegisteredStudentsExam  = new  com.webmethods.caf.is.wsclient.campusconnect.work.gradesubmission.showregisteredstudentsexam_wsd_hk1.showRegisteredStudentsExam() ;

		public com.webmethods.caf.is.wsclient.campusconnect.work.gradesubmission.showregisteredstudentsexam_wsd_hk1.showRegisteredStudentsExam getShowRegisteredStudentsExam() {
			return showRegisteredStudentsExam;
		}

		public void setShowRegisteredStudentsExam(com.webmethods.caf.is.wsclient.campusconnect.work.gradesubmission.showregisteredstudentsexam_wsd_hk1.showRegisteredStudentsExam showRegisteredStudentsExam) {
			this.showRegisteredStudentsExam = showRegisteredStudentsExam;
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
	public com.webmethods.caf.is.wsclient.campusconnect.work.gradesubmission.showregisteredstudentsexam_wsd_hk1.showRegisteredStudentsExamResponse getResult() {
		return (com.webmethods.caf.is.wsclient.campusconnect.work.gradesubmission.showregisteredstudentsexam_wsd_hk1.showRegisteredStudentsExamResponse)result;
	}
	

		
}