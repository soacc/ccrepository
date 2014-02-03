package com.webmethods.caf.is.wsclient.campusconnect.work.coursederegistration.deregistercourses_wsd;


import com.webmethods.caf.faces.data.ws.glue.GlueWSClientContentProvider;

/**
 * Glue Web Service Client bean generated for 
 * com.webmethods.caf.is.wsclient.campusconnect.work.coursederegistration.deregistercourses_wsd.IderegisterCourses_WSD_PortType.deregisterCourses.
 */
public class DeregisterCourses1 extends GlueWSClientContentProvider {

	private static final long serialVersionUID = 6437164600299720704L;

	/**
	 * Default constructor
	 */
	public DeregisterCourses1() {
		super(com.webmethods.caf.is.wsclient.campusconnect.work.coursederegistration.deregistercourses_wsd.IderegisterCourses_WSD_PortType.class, // port type proxy class
			"deregisterCourses", // method to invoke
			new String[] { "deregisterCourses", }, // method parameter names
			new Class[] { com.webmethods.caf.is.wsclient.campusconnect.work.coursederegistration.deregistercourses_wsd.deregisterCourses.class, } // method parameter types
		);
		// wsdl and maps by are saved in the same package
		setWsdlUrl("classpath:deregisterCourses_WSD.wsdl");
		setMapUrls(new String[] { "classpath:deregisterCourses_WSD.map", });

		// init wsclient
		initParams();
		
		// parameters bean
		parameters = new Parameters();
		
		// complex output, just a place holder
		result = new com.webmethods.caf.is.wsclient.campusconnect.work.coursederegistration.deregistercourses_wsd.deregisterCoursesResponse();
		
	}
	
	
	/**
	 * Method parameters bean
	 */
	public class Parameters  implements java.io.Serializable {

		private static final long serialVersionUID = 4628957228760298496L;

		public Parameters() {
		}
	
		private com.webmethods.caf.is.wsclient.campusconnect.work.coursederegistration.deregistercourses_wsd.deregisterCourses deregisterCourses  = new  com.webmethods.caf.is.wsclient.campusconnect.work.coursederegistration.deregistercourses_wsd.deregisterCourses() ;

		public com.webmethods.caf.is.wsclient.campusconnect.work.coursederegistration.deregistercourses_wsd.deregisterCourses getDeregisterCourses() {
			return deregisterCourses;
		}

		public void setDeregisterCourses(com.webmethods.caf.is.wsclient.campusconnect.work.coursederegistration.deregistercourses_wsd.deregisterCourses deregisterCourses) {
			this.deregisterCourses = deregisterCourses;
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
	public com.webmethods.caf.is.wsclient.campusconnect.work.coursederegistration.deregistercourses_wsd.deregisterCoursesResponse getResult() {
		return (com.webmethods.caf.is.wsclient.campusconnect.work.coursederegistration.deregistercourses_wsd.deregisterCoursesResponse)result;
	}
	

		
}