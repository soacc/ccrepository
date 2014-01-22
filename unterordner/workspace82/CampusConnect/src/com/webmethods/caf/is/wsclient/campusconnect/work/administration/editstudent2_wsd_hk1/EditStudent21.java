package com.webmethods.caf.is.wsclient.campusconnect.work.administration.editstudent2_wsd_hk1;


import com.webmethods.caf.faces.data.ws.glue.GlueWSClientContentProvider;

/**
 * Glue Web Service Client bean generated for 
 * com.webmethods.caf.is.wsclient.campusconnect.work.administration.editstudent2_wsd_hk1.IeditStudent2_WSD_HK1_PortType.editStudent2.
 */
public class EditStudent21 extends GlueWSClientContentProvider {

	private static final long serialVersionUID = 7290402272668238848L;

	/**
	 * Default constructor
	 */
	public EditStudent21() {
		super(com.webmethods.caf.is.wsclient.campusconnect.work.administration.editstudent2_wsd_hk1.IeditStudent2_WSD_HK1_PortType.class, // port type proxy class
			"editStudent2", // method to invoke
			new String[] { "editStudent2", }, // method parameter names
			new Class[] { com.webmethods.caf.is.wsclient.campusconnect.work.administration.editstudent2_wsd_hk1.editStudent2.class, } // method parameter types
		);
		// wsdl and maps by are saved in the same package
		setWsdlUrl("classpath:editStudent2_WSD_HK1.wsdl");
		setMapUrls(new String[] { "classpath:editStudent2_WSD_HK1.map", });

		// init wsclient
		initParams();
		
		// parameters bean
		parameters = new Parameters();
		
		// complex output, just a place holder
		result = new com.webmethods.caf.is.wsclient.campusconnect.work.administration.editstudent2_wsd_hk1.editStudent2Response();
		
	}
	
	
	/**
	 * Method parameters bean
	 */
	public class Parameters  implements java.io.Serializable {

		private static final long serialVersionUID = 3554964318024076288L;

		public Parameters() {
		}
	
		private com.webmethods.caf.is.wsclient.campusconnect.work.administration.editstudent2_wsd_hk1.editStudent2 editStudent2  = new  com.webmethods.caf.is.wsclient.campusconnect.work.administration.editstudent2_wsd_hk1.editStudent2() ;

		public com.webmethods.caf.is.wsclient.campusconnect.work.administration.editstudent2_wsd_hk1.editStudent2 getEditStudent2() {
			return editStudent2;
		}

		public void setEditStudent2(com.webmethods.caf.is.wsclient.campusconnect.work.administration.editstudent2_wsd_hk1.editStudent2 editStudent2) {
			this.editStudent2 = editStudent2;
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
	public com.webmethods.caf.is.wsclient.campusconnect.work.administration.editstudent2_wsd_hk1.editStudent2Response getResult() {
		return (com.webmethods.caf.is.wsclient.campusconnect.work.administration.editstudent2_wsd_hk1.editStudent2Response)result;
	}
	

		
}