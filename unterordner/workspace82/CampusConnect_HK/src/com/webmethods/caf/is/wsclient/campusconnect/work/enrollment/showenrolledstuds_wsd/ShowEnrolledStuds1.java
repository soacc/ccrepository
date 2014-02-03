package com.webmethods.caf.is.wsclient.campusconnect.work.enrollment.showenrolledstuds_wsd;


import com.webmethods.caf.faces.data.ws.glue.GlueWSClientContentProvider;

/**
 * Glue Web Service Client bean generated for 
 * com.webmethods.caf.is.wsclient.campusconnect.work.enrollment.showenrolledstuds_wsd.IshowEnrolledStuds_WSD_PortType.showEnrolledStuds.
 */
public class ShowEnrolledStuds1 extends GlueWSClientContentProvider {

	private static final long serialVersionUID = 3269523294145747968L;

	/**
	 * Default constructor
	 */
	public ShowEnrolledStuds1() {
		super(com.webmethods.caf.is.wsclient.campusconnect.work.enrollment.showenrolledstuds_wsd.IshowEnrolledStuds_WSD_PortType.class, // port type proxy class
			"showEnrolledStuds", // method to invoke
			new String[] { "showEnrolledStuds", }, // method parameter names
			new Class[] { com.webmethods.caf.is.wsclient.campusconnect.work.enrollment.showenrolledstuds_wsd.showEnrolledStuds.class, } // method parameter types
		);
		// wsdl and maps by are saved in the same package
		setWsdlUrl("classpath:showEnrolledStuds_WSD.wsdl");
		setMapUrls(new String[] { "classpath:showEnrolledStuds_WSD.map", });

		// init wsclient
		initParams();
		
		// parameters bean
		parameters = new Parameters();
		
	}
	
	
	/**
	 * Method parameters bean
	 */
	public class Parameters  implements java.io.Serializable {

		private static final long serialVersionUID = 3902874760309972992L;

		public Parameters() {
		}
	
		private com.webmethods.caf.is.wsclient.campusconnect.work.enrollment.showenrolledstuds_wsd.showEnrolledStuds showEnrolledStuds  = new  com.webmethods.caf.is.wsclient.campusconnect.work.enrollment.showenrolledstuds_wsd.showEnrolledStuds() ;

		public com.webmethods.caf.is.wsclient.campusconnect.work.enrollment.showenrolledstuds_wsd.showEnrolledStuds getShowEnrolledStuds() {
			return showEnrolledStuds;
		}

		public void setShowEnrolledStuds(com.webmethods.caf.is.wsclient.campusconnect.work.enrollment.showenrolledstuds_wsd.showEnrolledStuds showEnrolledStuds) {
			this.showEnrolledStuds = showEnrolledStuds;
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
	public com.webmethods.caf.is.wsclient.campusconnect.work.enrollment.showenrolledstuds_wsd.studDetails[] getResult() {
		return (com.webmethods.caf.is.wsclient.campusconnect.work.enrollment.showenrolledstuds_wsd.studDetails[])result;
	}
	

		
}