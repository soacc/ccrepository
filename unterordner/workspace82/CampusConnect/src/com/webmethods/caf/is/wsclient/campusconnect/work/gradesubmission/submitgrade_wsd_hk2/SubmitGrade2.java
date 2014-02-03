package com.webmethods.caf.is.wsclient.campusconnect.work.gradesubmission.submitgrade_wsd_hk2;


import com.webmethods.caf.faces.data.ws.glue.GlueWSClientContentProvider;

/**
 * Glue Web Service Client bean generated for 
 * com.webmethods.caf.is.wsclient.campusconnect.work.gradesubmission.submitgrade_wsd_hk2.IsubmitGrade_WSD_HK2_PortType.submitGrade.
 */
public class SubmitGrade2 extends GlueWSClientContentProvider {

	private static final long serialVersionUID = 1334315508613736448L;

	/**
	 * Default constructor
	 */
	public SubmitGrade2() {
		super(com.webmethods.caf.is.wsclient.campusconnect.work.gradesubmission.submitgrade_wsd_hk2.IsubmitGrade_WSD_HK2_PortType.class, // port type proxy class
			"submitGrade", // method to invoke
			new String[] { "submitGrade",  "result", }, // method parameter names
			new Class[] { com.webmethods.caf.is.wsclient.campusconnect.work.gradesubmission.submitgrade_wsd_hk2.StudentsGrade[].class,  electric.util.async.Async.class, } // method parameter types
		);
		// wsdl and maps by are saved in the same package
		setWsdlUrl("classpath:submitGrade_WSD_HK2.wsdl");
		setMapUrls(new String[] { "classpath:submitGrade_WSD_HK2.map", });

		// init wsclient
		initParams();
		
		// parameters bean
		parameters = new Parameters();
		
	}
	
	
	/**
	 * Method parameters bean
	 */
	public class Parameters  implements java.io.Serializable {

		private static final long serialVersionUID = 6754416452205651968L;

		public Parameters() {
		}
	
		private com.webmethods.caf.is.wsclient.campusconnect.work.gradesubmission.submitgrade_wsd_hk2.StudentsGrade[] submitGrade ;

		public com.webmethods.caf.is.wsclient.campusconnect.work.gradesubmission.submitgrade_wsd_hk2.StudentsGrade[] getSubmitGrade() {
			return submitGrade;
		}

		public void setSubmitGrade(com.webmethods.caf.is.wsclient.campusconnect.work.gradesubmission.submitgrade_wsd_hk2.StudentsGrade[] submitGrade) {
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