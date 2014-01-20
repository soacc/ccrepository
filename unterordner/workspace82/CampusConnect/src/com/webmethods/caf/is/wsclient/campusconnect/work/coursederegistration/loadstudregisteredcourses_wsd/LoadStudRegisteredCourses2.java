package com.webmethods.caf.is.wsclient.campusconnect.work.coursederegistration.loadstudregisteredcourses_wsd;


import com.webmethods.caf.faces.data.ws.glue.GlueWSClientContentProvider;

/**
 * Glue Web Service Client bean generated for 
 * com.webmethods.caf.is.wsclient.campusconnect.work.coursederegistration.loadstudregisteredcourses_wsd.IloadStudRegisteredCourses_WSD_PortType.loadStudRegisteredCourses.
 */
public class LoadStudRegisteredCourses2 extends GlueWSClientContentProvider {

	private static final long serialVersionUID = 3600248609271123968L;

	/**
	 * Default constructor
	 */
	public LoadStudRegisteredCourses2() {
		super(com.webmethods.caf.is.wsclient.campusconnect.work.coursederegistration.loadstudregisteredcourses_wsd.IloadStudRegisteredCourses_WSD_PortType.class, // port type proxy class
			"loadStudRegisteredCourses", // method to invoke
			new String[] { "loadStudRegisteredCourses", }, // method parameter names
			new Class[] { com.webmethods.caf.is.wsclient.campusconnect.work.coursederegistration.loadstudregisteredcourses_wsd.loadStudRegisteredCourses.class, } // method parameter types
		);
		// wsdl and maps by are saved in the same package
		setWsdlUrl("classpath:loadStudRegisteredCourses_WSD.wsdl");
		setMapUrls(new String[] { "classpath:loadStudRegisteredCourses_WSD.map", });

		// init wsclient
		initParams();
		
		// parameters bean
		parameters = new Parameters();
		
	}
	
	
	/**
	 * Method parameters bean
	 */
	public class Parameters  implements java.io.Serializable {

		private static final long serialVersionUID = 5459624289491595264L;

		public Parameters() {
		}
	
		private com.webmethods.caf.is.wsclient.campusconnect.work.coursederegistration.loadstudregisteredcourses_wsd.loadStudRegisteredCourses loadStudRegisteredCourses  = new  com.webmethods.caf.is.wsclient.campusconnect.work.coursederegistration.loadstudregisteredcourses_wsd.loadStudRegisteredCourses() ;

		public com.webmethods.caf.is.wsclient.campusconnect.work.coursederegistration.loadstudregisteredcourses_wsd.loadStudRegisteredCourses getLoadStudRegisteredCourses() {
			return loadStudRegisteredCourses;
		}

		public void setLoadStudRegisteredCourses(com.webmethods.caf.is.wsclient.campusconnect.work.coursederegistration.loadstudregisteredcourses_wsd.loadStudRegisteredCourses loadStudRegisteredCourses) {
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
	public com.webmethods.caf.is.wsclient.campusconnect.work.coursederegistration.loadstudregisteredcourses_wsd.shortCourseInfo[] getResult() {
		return (com.webmethods.caf.is.wsclient.campusconnect.work.coursederegistration.loadstudregisteredcourses_wsd.shortCourseInfo[])result;
	}
	

		
}