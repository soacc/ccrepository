package com.webmethods.caf.is.wsclient.campusconnect.work.searchcourse.new_wsd111111111111111;


import com.webmethods.caf.faces.data.ws.glue.GlueWSClientContentProvider;

/**
 * Glue Web Service Client bean generated for 
 * com.webmethods.caf.is.wsclient.campusconnect.work.searchcourse.new_wsd111111111111111.Inew_wsd111111111111111_PortType.searchCourse.
 */
public class SearchCourse1 extends GlueWSClientContentProvider {

	private static final long serialVersionUID = 2576432768815293440L;

	/**
	 * Default constructor
	 */
	public SearchCourse1() {
		super(com.webmethods.caf.is.wsclient.campusconnect.work.searchcourse.new_wsd111111111111111.Inew_wsd111111111111111_PortType.class, // port type proxy class
			"searchCourse", // method to invoke
			new String[] { "searchCourse", }, // method parameter names
			new Class[] { com.webmethods.caf.is.wsclient.campusconnect.work.searchcourse.new_wsd111111111111111.searchCourse.class, } // method parameter types
		);
		// wsdl and maps by are saved in the same package
		setWsdlUrl("classpath:new_wsd111111111111111.wsdl");
		setMapUrls(new String[] { "classpath:new_wsd111111111111111.map", });

		// init wsclient
		initParams();
		
		// parameters bean
		parameters = new Parameters();
		
		// complex output, just a place holder
		result = new com.webmethods.caf.is.wsclient.campusconnect.work.searchcourse.new_wsd111111111111111.searchCourseResponse();
		
	}
	
	
	/**
	 * Method parameters bean
	 */
	public class Parameters  implements java.io.Serializable {

		private static final long serialVersionUID = 3587270685938225152L;

		public Parameters() {
		}
	
		private com.webmethods.caf.is.wsclient.campusconnect.work.searchcourse.new_wsd111111111111111.searchCourse searchCourse  = new  com.webmethods.caf.is.wsclient.campusconnect.work.searchcourse.new_wsd111111111111111.searchCourse() ;

		public com.webmethods.caf.is.wsclient.campusconnect.work.searchcourse.new_wsd111111111111111.searchCourse getSearchCourse() {
			return searchCourse;
		}

		public void setSearchCourse(com.webmethods.caf.is.wsclient.campusconnect.work.searchcourse.new_wsd111111111111111.searchCourse searchCourse) {
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
	public com.webmethods.caf.is.wsclient.campusconnect.work.searchcourse.new_wsd111111111111111.searchCourseResponse getResult() {
		return (com.webmethods.caf.is.wsclient.campusconnect.work.searchcourse.new_wsd111111111111111.searchCourseResponse)result;
	}
	

		
}