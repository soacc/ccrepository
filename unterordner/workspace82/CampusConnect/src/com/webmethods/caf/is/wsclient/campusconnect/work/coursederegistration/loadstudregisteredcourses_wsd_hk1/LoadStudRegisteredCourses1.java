package com.webmethods.caf.is.wsclient.campusconnect.work.coursederegistration.loadstudregisteredcourses_wsd_hk1;


import com.webmethods.caf.faces.data.ws.glue.GlueWSClientContentProvider;

/**
 * Glue Web Service Client bean generated for 
 * com.webmethods.caf.is.wsclient.campusconnect.work.coursederegistration.loadstudregisteredcourses_wsd_hk1.IloadStudRegisteredCourses_WSD_HK1_PortType.loadStudRegisteredCourses.
 */
public class LoadStudRegisteredCourses1 extends GlueWSClientContentProvider {

	private static final long serialVersionUID = 412954531758485504L;

	/**
	 * Default constructor
	 */
	public LoadStudRegisteredCourses1() {
		super(com.webmethods.caf.is.wsclient.campusconnect.work.coursederegistration.loadstudregisteredcourses_wsd_hk1.IloadStudRegisteredCourses_WSD_HK1_PortType.class, // port type proxy class
			"loadStudRegisteredCourses", // method to invoke
			new String[] { "loadStudRegisteredCourses", }, // method parameter names
			new Class[] { com.webmethods.caf.is.wsclient.campusconnect.work.coursederegistration.loadstudregisteredcourses_wsd_hk1.loadStudRegisteredCourses.class, } // method parameter types
		);
		// wsdl and maps by are saved in the same package
		setWsdlUrl("classpath:loadStudRegisteredCourses_WSD_HK1.wsdl");
		setMapUrls(new String[] { "classpath:loadStudRegisteredCourses_WSD_HK1.map", });

		// init wsclient
		initParams();
		
		// parameters bean
		parameters = new Parameters();
		
		// complex output, just a place holder
		result = new com.webmethods.caf.is.wsclient.campusconnect.work.coursederegistration.loadstudregisteredcourses_wsd_hk1.loadStudRegisteredCoursesResponse();
		
	}
	
	
	/**
	 * Method parameters bean
	 */
	public class Parameters  implements java.io.Serializable {

		private static final long serialVersionUID = 6428321587328972800L;

		public Parameters() {
		}
	
		private com.webmethods.caf.is.wsclient.campusconnect.work.coursederegistration.loadstudregisteredcourses_wsd_hk1.loadStudRegisteredCourses loadStudRegisteredCourses  = new  com.webmethods.caf.is.wsclient.campusconnect.work.coursederegistration.loadstudregisteredcourses_wsd_hk1.loadStudRegisteredCourses() ;

		public com.webmethods.caf.is.wsclient.campusconnect.work.coursederegistration.loadstudregisteredcourses_wsd_hk1.loadStudRegisteredCourses getLoadStudRegisteredCourses() {
			return loadStudRegisteredCourses;
		}

		public void setLoadStudRegisteredCourses(com.webmethods.caf.is.wsclient.campusconnect.work.coursederegistration.loadstudregisteredcourses_wsd_hk1.loadStudRegisteredCourses loadStudRegisteredCourses) {
			this.loadStudRegisteredCourses = loadStudRegisteredCourses;
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
	public com.webmethods.caf.is.wsclient.campusconnect.work.coursederegistration.loadstudregisteredcourses_wsd_hk1.loadStudRegisteredCoursesResponse getResult() {
		return (com.webmethods.caf.is.wsclient.campusconnect.work.coursederegistration.loadstudregisteredcourses_wsd_hk1.loadStudRegisteredCoursesResponse)result;
	}
	

		
}