package com.webmethods.caf.is.wsclient.campusconnect.work.searchcourse.searchcourse_wsd;


import com.webmethods.caf.faces.data.ws.glue.GlueWSClientContentProvider;

/**
 * Glue Web Service Client bean generated for 
 * com.webmethods.caf.is.wsclient.campusconnect.work.searchcourse.searchcourse_wsd.IsearchCourse_WSD_PortType.searchCourse.
 */
public class SearchCourse1 extends GlueWSClientContentProvider {

	private static final long serialVersionUID = 3786145753765420032L;

	/**
	 * Default constructor
	 */
	public SearchCourse1() {
		super(com.webmethods.caf.is.wsclient.campusconnect.work.searchcourse.searchcourse_wsd.IsearchCourse_WSD_PortType.class, // port type proxy class
			"searchCourse", // method to invoke
			new String[] { "searchCourse", }, // method parameter names
			new Class[] { com.webmethods.caf.is.wsclient.campusconnect.work.searchcourse.searchcourse_wsd.searchCourse.class, } // method parameter types
		);
		// wsdl and maps by are saved in the same package
		setWsdlUrl("classpath:searchCourse_WSD.wsdl");
		setMapUrls(new String[] { "classpath:searchCourse_WSD.map", });

		// init wsclient
		initParams();
		
		// parameters bean
		parameters = new Parameters();
		
	}
	
	
	/**
	 * Method parameters bean
	 */
	public class Parameters  implements java.io.Serializable {

		private static final long serialVersionUID = 7022048890696836096L;

		public Parameters() {
		}
	
		private com.webmethods.caf.is.wsclient.campusconnect.work.searchcourse.searchcourse_wsd.searchCourse searchCourse  = new  com.webmethods.caf.is.wsclient.campusconnect.work.searchcourse.searchcourse_wsd.searchCourse() ;

		public com.webmethods.caf.is.wsclient.campusconnect.work.searchcourse.searchcourse_wsd.searchCourse getSearchCourse() {
			return searchCourse;
		}

		public void setSearchCourse(com.webmethods.caf.is.wsclient.campusconnect.work.searchcourse.searchcourse_wsd.searchCourse searchCourse) {
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
	public com.webmethods.caf.is.wsclient.campusconnect.work.searchcourse.searchcourse_wsd.courses[] getResult() {
		return (com.webmethods.caf.is.wsclient.campusconnect.work.searchcourse.searchcourse_wsd.courses[])result;
	}
	

		
}