package com.webmethods.caf.is.wsclient.campusconnect.work.courseregistration.loadfilteredcourses_wsd_3;


import com.webmethods.caf.faces.data.ws.glue.GlueWSClientContentProvider;

/**
 * Glue Web Service Client bean generated for 
 * com.webmethods.caf.is.wsclient.campusconnect.work.courseregistration.loadfilteredcourses_wsd_3.IloadFilteredCourses_WSD_3_PortType.loadFilteredCourses.
 */
public class LoadFilteredCourses6 extends GlueWSClientContentProvider {

	private static final long serialVersionUID = 7507242256924555264L;

	/**
	 * Default constructor
	 */
	public LoadFilteredCourses6() {
		super(com.webmethods.caf.is.wsclient.campusconnect.work.courseregistration.loadfilteredcourses_wsd_3.IloadFilteredCourses_WSD_3_PortType.class, // port type proxy class
			"loadFilteredCourses", // method to invoke
			new String[] { "loadFilteredCoursesInput", }, // method parameter names
			new Class[] { com.webmethods.caf.is.wsclient.campusconnect.work.courseregistration.loadfilteredcourses_wsd_3.loadFilteredCoursesInput.class, } // method parameter types
		);
		// wsdl and maps by are saved in the same package
		setWsdlUrl("classpath:loadFilteredCourses_WSD_3.wsdl");
		setMapUrls(new String[] { "classpath:loadFilteredCourses_WSD_3.map", });

		// init wsclient
		initParams();
		
		// parameters bean
		parameters = new Parameters();
		
		// complex output, just a place holder
		result = new com.webmethods.caf.is.wsclient.campusconnect.work.courseregistration.loadfilteredcourses_wsd_3.loadFilteredCoursesOutput();
		
	}
	
	
	/**
	 * Method parameters bean
	 */
	public class Parameters  implements java.io.Serializable {

		private static final long serialVersionUID = 1516614836366414848L;

		public Parameters() {
		}
	
		private com.webmethods.caf.is.wsclient.campusconnect.work.courseregistration.loadfilteredcourses_wsd_3.loadFilteredCoursesInput loadFilteredCoursesInput  = new  com.webmethods.caf.is.wsclient.campusconnect.work.courseregistration.loadfilteredcourses_wsd_3.loadFilteredCoursesInput() ;

		public com.webmethods.caf.is.wsclient.campusconnect.work.courseregistration.loadfilteredcourses_wsd_3.loadFilteredCoursesInput getLoadFilteredCoursesInput() {
			return loadFilteredCoursesInput;
		}

		public void setLoadFilteredCoursesInput(com.webmethods.caf.is.wsclient.campusconnect.work.courseregistration.loadfilteredcourses_wsd_3.loadFilteredCoursesInput loadFilteredCoursesInput) {
			this.loadFilteredCoursesInput = loadFilteredCoursesInput;
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
	public com.webmethods.caf.is.wsclient.campusconnect.work.courseregistration.loadfilteredcourses_wsd_3.loadFilteredCoursesOutput getResult() {
		return (com.webmethods.caf.is.wsclient.campusconnect.work.courseregistration.loadfilteredcourses_wsd_3.loadFilteredCoursesOutput)result;
	}
	

		
}