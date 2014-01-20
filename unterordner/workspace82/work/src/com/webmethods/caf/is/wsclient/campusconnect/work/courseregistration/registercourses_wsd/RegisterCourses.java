package com.webmethods.caf.is.wsclient.campusconnect.work.courseregistration.registercourses_wsd;


import com.webmethods.caf.faces.data.ws.glue.GlueWSClientContentProvider;

/**
 * Glue Web Service Client bean generated for 
 * com.webmethods.caf.is.wsclient.campusconnect.work.courseregistration.registercourses_wsd.IregisterCourses_WSD_PortType.registerCourses.
 */
public class RegisterCourses extends GlueWSClientContentProvider {

	private static final long serialVersionUID = 3238764454597849088L;

	/**
	 * Default constructor
	 */
	public RegisterCourses() {
		super(com.webmethods.caf.is.wsclient.campusconnect.work.courseregistration.registercourses_wsd.IregisterCourses_WSD_PortType.class, // port type proxy class
			"registerCourses", // method to invoke
			new String[] { "registerCoursesInput", }, // method parameter names
			new Class[] { com.webmethods.caf.is.wsclient.campusconnect.work.courseregistration.registercourses_wsd.registerCoursesInput.class, } // method parameter types
		);
		// wsdl and maps by are saved in the same package
		setWsdlUrl("classpath:registerCourses_WSD.wsdl");
		setMapUrls(new String[] { "classpath:registerCourses_WSD.map", });

		// init wsclient
		initParams();
		
		// parameters bean
		parameters = new Parameters();
		
	}
	
	
	/**
	 * Method parameters bean
	 */
	public class Parameters  implements java.io.Serializable {

		private static final long serialVersionUID = 6095395395825776640L;

		public Parameters() {
		}
	
		private com.webmethods.caf.is.wsclient.campusconnect.work.courseregistration.registercourses_wsd.registerCoursesInput registerCoursesInput  = new  com.webmethods.caf.is.wsclient.campusconnect.work.courseregistration.registercourses_wsd.registerCoursesInput() ;

		public com.webmethods.caf.is.wsclient.campusconnect.work.courseregistration.registercourses_wsd.registerCoursesInput getRegisterCoursesInput() {
			return registerCoursesInput;
		}

		public void setRegisterCoursesInput(com.webmethods.caf.is.wsclient.campusconnect.work.courseregistration.registercourses_wsd.registerCoursesInput registerCoursesInput) {
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
	public com.webmethods.caf.is.wsclient.campusconnect.work.courseregistration.registercourses_wsd.registeredCourses[] getResult() {
		return (com.webmethods.caf.is.wsclient.campusconnect.work.courseregistration.registercourses_wsd.registeredCourses[])result;
	}
	

		
}