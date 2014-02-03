package com.webmethods.caf.is.wsclient.campusconnect.work.courseregistration.registercoursestest;


import com.webmethods.caf.faces.data.ws.glue.GlueWSClientContentProvider;

/**
 * Glue Web Service Client bean generated for 
 * com.webmethods.caf.is.wsclient.campusconnect.work.courseregistration.registercoursestest.Iregistercoursestest_PortType.registerCourses.
 */
public class RegisterCourses2 extends GlueWSClientContentProvider {

	private static final long serialVersionUID = 3874129561994910720L;

	/**
	 * Default constructor
	 */
	public RegisterCourses2() {
		super(com.webmethods.caf.is.wsclient.campusconnect.work.courseregistration.registercoursestest.Iregistercoursestest_PortType.class, // port type proxy class
			"registerCourses", // method to invoke
			new String[] { "registerCoursesInput", }, // method parameter names
			new Class[] { com.webmethods.caf.is.wsclient.campusconnect.work.courseregistration.registercoursestest.registerCoursesInput.class, } // method parameter types
		);
		// wsdl and maps by are saved in the same package
		setWsdlUrl("classpath:registercoursestest.wsdl");
		setMapUrls(new String[] { "classpath:registercoursestest.map", });

		// init wsclient
		initParams();
		
		// parameters bean
		parameters = new Parameters();
		
		// complex output, just a place holder
		result = new com.webmethods.caf.is.wsclient.campusconnect.work.courseregistration.registercoursestest.registerCoursesOutput();
		
	}
	
	
	/**
	 * Method parameters bean
	 */
	public class Parameters  implements java.io.Serializable {

		private static final long serialVersionUID = 8646987005748507648L;

		public Parameters() {
		}
	
		private com.webmethods.caf.is.wsclient.campusconnect.work.courseregistration.registercoursestest.registerCoursesInput registerCoursesInput  = new  com.webmethods.caf.is.wsclient.campusconnect.work.courseregistration.registercoursestest.registerCoursesInput() ;

		public com.webmethods.caf.is.wsclient.campusconnect.work.courseregistration.registercoursestest.registerCoursesInput getRegisterCoursesInput() {
			return registerCoursesInput;
		}

		public void setRegisterCoursesInput(com.webmethods.caf.is.wsclient.campusconnect.work.courseregistration.registercoursestest.registerCoursesInput registerCoursesInput) {
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
	public com.webmethods.caf.is.wsclient.campusconnect.work.courseregistration.registercoursestest.registerCoursesOutput getResult() {
		return (com.webmethods.caf.is.wsclient.campusconnect.work.courseregistration.registercoursestest.registerCoursesOutput)result;
	}
	

		
}