package com.webmethods.caf.is.wsclient.campusconnect.utils.courses.getcoursedetails;


import com.webmethods.caf.faces.data.ws.glue.GlueWSClientContentProvider;

/**
 * Glue Web Service Client bean generated for 
 * com.webmethods.caf.is.wsclient.campusconnect.utils.courses.getcoursedetails.ICampusConnect_utils_coursesPortType.getCourseDetails.
 */
public class GetCourseDetails extends GlueWSClientContentProvider {

	private static final long serialVersionUID = 8298236360534488064L;

	/**
	 * Default constructor
	 */
	public GetCourseDetails() {
		super(com.webmethods.caf.is.wsclient.campusconnect.utils.courses.getcoursedetails.ICampusConnect_utils_coursesPortType.class, // port type proxy class
			"getCourseDetails", // method to invoke
			new String[] { "id", }, // method parameter names
			new Class[] { java.lang.String.class, } // method parameter types
		);
		// wsdl and maps by are saved in the same package
		setWsdlUrl("classpath:getCourseDetails.wsdl");
		setMapUrls(new String[] { "classpath:CampusConnect_utils_coursesService.map", });

		// init wsclient
		initParams();
		
		// parameters bean
		parameters = new Parameters();
		
		// complex output, just a place holder
		result = new com.webmethods.caf.is.wsclient.campusconnect.utils.courses.getcoursedetails.__course();
		
	}
	
	
	/**
	 * Method parameters bean
	 */
	public class Parameters  implements java.io.Serializable {

		private static final long serialVersionUID = 9090553385777364992L;

		public Parameters() {
		}
	
		private java.lang.String id ;

		public java.lang.String getId() {
			return id;
		}

		public void setId(java.lang.String id) {
			this.id = id;
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
	public com.webmethods.caf.is.wsclient.campusconnect.utils.courses.getcoursedetails.__course getResult() {
		return (com.webmethods.caf.is.wsclient.campusconnect.utils.courses.getcoursedetails.__course)result;
	}
	

		
}