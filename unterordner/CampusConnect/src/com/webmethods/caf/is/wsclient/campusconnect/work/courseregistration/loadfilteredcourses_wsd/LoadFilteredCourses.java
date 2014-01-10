package com.webmethods.caf.is.wsclient.campusconnect.work.courseregistration.loadfilteredcourses_wsd;


import com.webmethods.caf.faces.data.ws.glue.GlueWSClientContentProvider;

/**
 * Glue Web Service Client bean generated for 
 * com.webmethods.caf.is.wsclient.campusconnect.work.courseregistration.loadfilteredcourses_wsd.IloadFilteredCourses_WSD_PortType.loadFilteredCourses.
 */
public class LoadFilteredCourses extends GlueWSClientContentProvider {

	private static final long serialVersionUID = 6741149072545549312L;

	/**
	 * Default constructor
	 */
	public LoadFilteredCourses() {
		super(com.webmethods.caf.is.wsclient.campusconnect.work.courseregistration.loadfilteredcourses_wsd.IloadFilteredCourses_WSD_PortType.class, // port type proxy class
			"loadFilteredCourses", // method to invoke
			new String[] { "loadFilteredCoursesInput", }, // method parameter names
			new Class[] { com.webmethods.caf.is.wsclient.campusconnect.work.courseregistration.loadfilteredcourses_wsd.loadFilteredCoursesInput.class, } // method parameter types
		);
		// wsdl and maps by are saved in the same package
		setWsdlUrl("classpath:loadFilteredCourses_WSD.wsdl");
		setMapUrls(new String[] { "classpath:loadFilteredCourses_WSD.map", });

		// init wsclient
		initParams();
		
		// parameters bean
		parameters = new Parameters();
		
	}
	
	
	/**
	 * Method parameters bean
	 */
	public class Parameters  implements java.io.Serializable {

		private static final long serialVersionUID = 4781250346166237184L;

		public Parameters() {
		}
	
		private com.webmethods.caf.is.wsclient.campusconnect.work.courseregistration.loadfilteredcourses_wsd.loadFilteredCoursesInput loadFilteredCoursesInput  = new  com.webmethods.caf.is.wsclient.campusconnect.work.courseregistration.loadfilteredcourses_wsd.loadFilteredCoursesInput() ;

		public com.webmethods.caf.is.wsclient.campusconnect.work.courseregistration.loadfilteredcourses_wsd.loadFilteredCoursesInput getLoadFilteredCoursesInput() {
			return loadFilteredCoursesInput;
		}

		public void setLoadFilteredCoursesInput(com.webmethods.caf.is.wsclient.campusconnect.work.courseregistration.loadfilteredcourses_wsd.loadFilteredCoursesInput loadFilteredCoursesInput) {
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
	public com.webmethods.caf.is.wsclient.campusconnect.work.courseregistration.loadfilteredcourses_wsd.fCL[] getResult() {
		return (com.webmethods.caf.is.wsclient.campusconnect.work.courseregistration.loadfilteredcourses_wsd.fCL[])result;
	}
	

		
}