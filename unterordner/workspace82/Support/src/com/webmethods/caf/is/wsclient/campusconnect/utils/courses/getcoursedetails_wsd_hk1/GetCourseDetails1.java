package com.webmethods.caf.is.wsclient.campusconnect.utils.courses.getcoursedetails_wsd_hk1;


import com.webmethods.caf.faces.data.ws.glue.GlueWSClientContentProvider;

/**
 * Glue Web Service Client bean generated for 
 * com.webmethods.caf.is.wsclient.campusconnect.utils.courses.getcoursedetails_wsd_hk1.IgetCourseDetails_WSD_HK1_PortType.getCourseDetails.
 */
public class GetCourseDetails1 extends GlueWSClientContentProvider {

	private static final long serialVersionUID = 2252248413315009536L;

	/**
	 * Default constructor
	 */
	public GetCourseDetails1() {
		super(com.webmethods.caf.is.wsclient.campusconnect.utils.courses.getcoursedetails_wsd_hk1.IgetCourseDetails_WSD_HK1_PortType.class, // port type proxy class
			"getCourseDetails", // method to invoke
			new String[] { "getCourseDetails", }, // method parameter names
			new Class[] { com.webmethods.caf.is.wsclient.campusconnect.utils.courses.getcoursedetails_wsd_hk1.getCourseDetails.class, } // method parameter types
		);
		// wsdl and maps by are saved in the same package
		setWsdlUrl("classpath:getCourseDetails_WSD_HK1.wsdl");
		setMapUrls(new String[] { "classpath:getCourseDetails_WSD_HK1.map", });

		// init wsclient
		initParams();
		
		// parameters bean
		parameters = new Parameters();
		
		// complex output, just a place holder
		result = new com.webmethods.caf.is.wsclient.campusconnect.utils.courses.getcoursedetails_wsd_hk1.getCourseDetailsResponse();
		
	}
	
	
	/**
	 * Method parameters bean
	 */
	public class Parameters  implements java.io.Serializable {

		private static final long serialVersionUID = 4468633169556722688L;

		public Parameters() {
		}
	
		private com.webmethods.caf.is.wsclient.campusconnect.utils.courses.getcoursedetails_wsd_hk1.getCourseDetails getCourseDetails  = new  com.webmethods.caf.is.wsclient.campusconnect.utils.courses.getcoursedetails_wsd_hk1.getCourseDetails() ;

		public com.webmethods.caf.is.wsclient.campusconnect.utils.courses.getcoursedetails_wsd_hk1.getCourseDetails getGetCourseDetails() {
			return getCourseDetails;
		}

		public void setGetCourseDetails(com.webmethods.caf.is.wsclient.campusconnect.utils.courses.getcoursedetails_wsd_hk1.getCourseDetails getCourseDetails) {
			this.getCourseDetails = getCourseDetails;
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
	public com.webmethods.caf.is.wsclient.campusconnect.utils.courses.getcoursedetails_wsd_hk1.getCourseDetailsResponse getResult() {
		return (com.webmethods.caf.is.wsclient.campusconnect.utils.courses.getcoursedetails_wsd_hk1.getCourseDetailsResponse)result;
	}
	

		
}