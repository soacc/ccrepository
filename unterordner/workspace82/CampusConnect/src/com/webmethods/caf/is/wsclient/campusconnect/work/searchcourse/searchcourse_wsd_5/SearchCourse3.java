package com.webmethods.caf.is.wsclient.campusconnect.work.searchcourse.searchcourse_wsd_5;


import com.webmethods.caf.faces.data.ws.glue.GlueWSClientContentProvider;

/**
 * Glue Web Service Client bean generated for 
 * com.webmethods.caf.is.wsclient.campusconnect.work.searchcourse.searchcourse_wsd_5.IsearchCourse_WSD_5_PortType.searchCourse.
 */
public class SearchCourse3 extends GlueWSClientContentProvider {

	private static final long serialVersionUID = 4795109843393299456L;

	/**
	 * Default constructor
	 */
	public SearchCourse3() {
		super(com.webmethods.caf.is.wsclient.campusconnect.work.searchcourse.searchcourse_wsd_5.IsearchCourse_WSD_5_PortType.class, // port type proxy class
			"searchCourse", // method to invoke
			new String[] { "searchCourse", }, // method parameter names
			new Class[] { com.webmethods.caf.is.wsclient.campusconnect.work.searchcourse.searchcourse_wsd_5.searchCourse.class, } // method parameter types
		);
		// wsdl and maps by are saved in the same package
		setWsdlUrl("classpath:searchCourse_WSD_5.wsdl");
		setMapUrls(new String[] { "classpath:searchCourse_WSD_5.map", });

		// init wsclient
		initParams();
		
		// parameters bean
		parameters = new Parameters();
		
		// complex output, just a place holder
		result = new com.webmethods.caf.is.wsclient.campusconnect.work.searchcourse.searchcourse_wsd_5.searchCourseResponse();
		
	}
	
	
	/**
	 * Method parameters bean
	 */
	public class Parameters  implements java.io.Serializable {

		private static final long serialVersionUID = 9077033738236429312L;

		public Parameters() {
		}
	
		private com.webmethods.caf.is.wsclient.campusconnect.work.searchcourse.searchcourse_wsd_5.searchCourse searchCourse  = new  com.webmethods.caf.is.wsclient.campusconnect.work.searchcourse.searchcourse_wsd_5.searchCourse() ;

		public com.webmethods.caf.is.wsclient.campusconnect.work.searchcourse.searchcourse_wsd_5.searchCourse getSearchCourse() {
			return searchCourse;
		}

		public void setSearchCourse(com.webmethods.caf.is.wsclient.campusconnect.work.searchcourse.searchcourse_wsd_5.searchCourse searchCourse) {
			this.searchCourse = searchCourse;
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
	public com.webmethods.caf.is.wsclient.campusconnect.work.searchcourse.searchcourse_wsd_5.searchCourseResponse getResult() {
		return (com.webmethods.caf.is.wsclient.campusconnect.work.searchcourse.searchcourse_wsd_5.searchCourseResponse)result;
	}
	

		
}