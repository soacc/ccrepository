package com.webmethods.caf.is.wsclient.campusconnect.work.courseregistration.loadfilteredcourses_wsd_hk1;


import com.webmethods.caf.faces.data.ws.glue.GlueWSClientContentProvider;

/**
 * Glue Web Service Client bean generated for 
 * com.webmethods.caf.is.wsclient.campusconnect.work.courseregistration.loadfilteredcourses_wsd_hk1.IloadFilteredCourses_WSD_HK1_PortType.loadFilteredCourses.
 */
public class LoadFilteredCourses8 extends GlueWSClientContentProvider {

	private static final long serialVersionUID = 3446651513336204288L;

	/**
	 * Default constructor
	 */
	public LoadFilteredCourses8() {
		super(com.webmethods.caf.is.wsclient.campusconnect.work.courseregistration.loadfilteredcourses_wsd_hk1.IloadFilteredCourses_WSD_HK1_PortType.class, // port type proxy class
			"loadFilteredCourses", // method to invoke
			new String[] { "loadFilteredCoursesInput", }, // method parameter names
			new Class[] { com.webmethods.caf.is.wsclient.campusconnect.work.courseregistration.loadfilteredcourses_wsd_hk1.loadFilteredCoursesInput.class, } // method parameter types
		);
		// wsdl and maps by are saved in the same package
		setWsdlUrl("classpath:loadFilteredCourses_WSD_HK1.wsdl");
		setMapUrls(new String[] { "classpath:loadFilteredCourses_WSD_HK1.map", });

		// init wsclient
		initParams();
		
		// parameters bean
		parameters = new Parameters();
		
		// complex output, just a place holder
		result = new com.webmethods.caf.is.wsclient.campusconnect.work.courseregistration.loadfilteredcourses_wsd_hk1.loadFilteredCoursesOutput();
		
	}
	
	
	/**
	 * Method parameters bean
	 */
	public class Parameters  implements java.io.Serializable {

		private static final long serialVersionUID = 7855767936302837760L;

		public Parameters() {
		}
	
		private com.webmethods.caf.is.wsclient.campusconnect.work.courseregistration.loadfilteredcourses_wsd_hk1.loadFilteredCoursesInput loadFilteredCoursesInput  = new  com.webmethods.caf.is.wsclient.campusconnect.work.courseregistration.loadfilteredcourses_wsd_hk1.loadFilteredCoursesInput() ;

		public com.webmethods.caf.is.wsclient.campusconnect.work.courseregistration.loadfilteredcourses_wsd_hk1.loadFilteredCoursesInput getLoadFilteredCoursesInput() {
			return loadFilteredCoursesInput;
		}

		public void setLoadFilteredCoursesInput(com.webmethods.caf.is.wsclient.campusconnect.work.courseregistration.loadfilteredcourses_wsd_hk1.loadFilteredCoursesInput loadFilteredCoursesInput) {
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
	public com.webmethods.caf.is.wsclient.campusconnect.work.courseregistration.loadfilteredcourses_wsd_hk1.loadFilteredCoursesOutput getResult() {
		return (com.webmethods.caf.is.wsclient.campusconnect.work.courseregistration.loadfilteredcourses_wsd_hk1.loadFilteredCoursesOutput)result;
	}
	

		
}