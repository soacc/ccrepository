package com.webmethods.caf.is.wsclient.campusconnect.utils.courses.listcoursessingleprof_wsd_hk1;


import com.webmethods.caf.faces.data.ws.glue.GlueWSClientContentProvider;

/**
 * Glue Web Service Client bean generated for 
 * com.webmethods.caf.is.wsclient.campusconnect.utils.courses.listcoursessingleprof_wsd_hk1.IlistCoursesSingleProf_WSD_HK1_PortType.listCoursesSingleProf.
 */
public class ListCoursesSingleProf2 extends GlueWSClientContentProvider {

	private static final long serialVersionUID = 6137119458063724544L;

	/**
	 * Default constructor
	 */
	public ListCoursesSingleProf2() {
		super(com.webmethods.caf.is.wsclient.campusconnect.utils.courses.listcoursessingleprof_wsd_hk1.IlistCoursesSingleProf_WSD_HK1_PortType.class, // port type proxy class
			"listCoursesSingleProf", // method to invoke
			new String[] { "listCoursesSingleProf", }, // method parameter names
			new Class[] { com.webmethods.caf.is.wsclient.campusconnect.utils.courses.listcoursessingleprof_wsd_hk1.listCoursesSingleProf.class, } // method parameter types
		);
		// wsdl and maps by are saved in the same package
		setWsdlUrl("classpath:listCoursesSingleProf_WSD_HK1.wsdl");
		setMapUrls(new String[] { "classpath:listCoursesSingleProf_WSD_HK1.map", });

		// init wsclient
		initParams();
		
		// parameters bean
		parameters = new Parameters();
		
		// complex output, just a place holder
		result = new com.webmethods.caf.is.wsclient.campusconnect.utils.courses.listcoursessingleprof_wsd_hk1.listCoursesSingleProfResponse();
		
	}
	
	
	/**
	 * Method parameters bean
	 */
	public class Parameters  implements java.io.Serializable {

		private static final long serialVersionUID = 3902976762110787584L;

		public Parameters() {
		}
	
		private com.webmethods.caf.is.wsclient.campusconnect.utils.courses.listcoursessingleprof_wsd_hk1.listCoursesSingleProf listCoursesSingleProf  = new  com.webmethods.caf.is.wsclient.campusconnect.utils.courses.listcoursessingleprof_wsd_hk1.listCoursesSingleProf() ;

		public com.webmethods.caf.is.wsclient.campusconnect.utils.courses.listcoursessingleprof_wsd_hk1.listCoursesSingleProf getListCoursesSingleProf() {
			return listCoursesSingleProf;
		}

		public void setListCoursesSingleProf(com.webmethods.caf.is.wsclient.campusconnect.utils.courses.listcoursessingleprof_wsd_hk1.listCoursesSingleProf listCoursesSingleProf) {
			this.listCoursesSingleProf = listCoursesSingleProf;
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
	public com.webmethods.caf.is.wsclient.campusconnect.utils.courses.listcoursessingleprof_wsd_hk1.listCoursesSingleProfResponse getResult() {
		return (com.webmethods.caf.is.wsclient.campusconnect.utils.courses.listcoursessingleprof_wsd_hk1.listCoursesSingleProfResponse)result;
	}
	

		
}