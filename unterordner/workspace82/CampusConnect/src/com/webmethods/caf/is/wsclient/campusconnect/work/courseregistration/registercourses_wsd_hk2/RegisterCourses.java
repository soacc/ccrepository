package com.webmethods.caf.is.wsclient.campusconnect.work.courseregistration.registercourses_wsd_hk2;


import com.webmethods.caf.faces.data.ws.glue.GlueWSClientContentProvider;

/**
 * Glue Web Service Client bean generated for 
 * com.webmethods.caf.is.wsclient.campusconnect.work.courseregistration.registercourses_wsd_hk2.IregisterCourses_WSD_HK2_PortType.registerCourses.
 */
public class RegisterCourses extends GlueWSClientContentProvider {

	private static final long serialVersionUID = 3007353854201460736L;

	/**
	 * Default constructor
	 */
	public RegisterCourses() {
		super(com.webmethods.caf.is.wsclient.campusconnect.work.courseregistration.registercourses_wsd_hk2.IregisterCourses_WSD_HK2_PortType.class, // port type proxy class
			"registerCourses", // method to invoke
			new String[] { "registerCoursesInput", }, // method parameter names
			new Class[] { com.webmethods.caf.is.wsclient.campusconnect.work.courseregistration.registercourses_wsd_hk2.registerCoursesInput.class, } // method parameter types
		);
		// wsdl and maps by are saved in the same package
		setWsdlUrl("classpath:registerCourses_WSD_HK2.wsdl");
		setMapUrls(new String[] { "classpath:registerCourses_WSD_HK2.map", });

		// init wsclient
		initParams();
		
		// parameters bean
		parameters = new Parameters();
		
		// complex output, just a place holder
		result = new com.webmethods.caf.is.wsclient.campusconnect.work.courseregistration.registercourses_wsd_hk2.registerCoursesOutput();
		
	}
	
	
	/**
	 * Method parameters bean
	 */
	public class Parameters  implements java.io.Serializable {

		private static final long serialVersionUID = 3984971344873593856L;

		public Parameters() {
		}
	
		private com.webmethods.caf.is.wsclient.campusconnect.work.courseregistration.registercourses_wsd_hk2.registerCoursesInput registerCoursesInput  = new  com.webmethods.caf.is.wsclient.campusconnect.work.courseregistration.registercourses_wsd_hk2.registerCoursesInput() ;

		public com.webmethods.caf.is.wsclient.campusconnect.work.courseregistration.registercourses_wsd_hk2.registerCoursesInput getRegisterCoursesInput() {
			return registerCoursesInput;
		}

		public void setRegisterCoursesInput(com.webmethods.caf.is.wsclient.campusconnect.work.courseregistration.registercourses_wsd_hk2.registerCoursesInput registerCoursesInput) {
			this.registerCoursesInput = registerCoursesInput;
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
	public com.webmethods.caf.is.wsclient.campusconnect.work.courseregistration.registercourses_wsd_hk2.registerCoursesOutput getResult() {
		return (com.webmethods.caf.is.wsclient.campusconnect.work.courseregistration.registercourses_wsd_hk2.registerCoursesOutput)result;
	}
	

		
}