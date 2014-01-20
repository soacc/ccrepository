package com.webmethods.caf.is.wsclient.campusconnect.work.gradesubmission.submitgrade_wsd_hk1;


import com.webmethods.caf.faces.data.ws.glue.GlueWSClientContentProvider;

/**
 * Glue Web Service Client bean generated for 
 * com.webmethods.caf.is.wsclient.campusconnect.work.gradesubmission.submitgrade_wsd_hk1.IsubmitGrade_WSD_HK1_PortType.submitGrade.
 */
public class SubmitGrade extends GlueWSClientContentProvider {

	private static final long serialVersionUID = 8072458578115194880L;

	/**
	 * Default constructor
	 */
	public SubmitGrade() {
		super(com.webmethods.caf.is.wsclient.campusconnect.work.gradesubmission.submitgrade_wsd_hk1.IsubmitGrade_WSD_HK1_PortType.class, // port type proxy class
			"submitGrade", // method to invoke
			new String[] { "submitGrade",  "result", }, // method parameter names
			new Class[] { com.webmethods.caf.is.wsclient.campusconnect.work.gradesubmission.submitgrade_wsd_hk1.StudentsGrade[].class,  electric.util.async.Async.class, } // method parameter types
		);
		// wsdl and maps by are saved in the same package
		setWsdlUrl("classpath:submitGrade_WSD_HK1.wsdl");
		setMapUrls(new String[] { "classpath:submitGrade_WSD_HK1.map", });

		// init wsclient
		initParams();
		
		// parameters bean
		parameters = new Parameters();
		
	}
	
	
	/**
	 * Method parameters bean
	 */
	public class Parameters  implements java.io.Serializable {

		private static final long serialVersionUID = 53377466597550080L;

		public Parameters() {
		}
	
		private com.webmethods.caf.is.wsclient.campusconnect.work.gradesubmission.submitgrade_wsd_hk1.StudentsGrade[] submitGrade ;

		public com.webmethods.caf.is.wsclient.campusconnect.work.gradesubmission.submitgrade_wsd_hk1.StudentsGrade[] getSubmitGrade() {
			return submitGrade;
		}

		public void setSubmitGrade(com.webmethods.caf.is.wsclient.campusconnect.work.gradesubmission.submitgrade_wsd_hk1.StudentsGrade[] submitGrade) {
			this.submitGrade = submitGrade;
		} 	
		
	}
	
	
	
	/**
	 * Return method invocation parameters bean
	 */
	public Parameters getParameters() {
		return (Parameters)parameters;
	}	
	


	

		
}