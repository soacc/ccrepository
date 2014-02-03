package com.webmethods.caf.is.wsclient.campusconnect.work.administration.getexmareasons_wsd_mw1;


import com.webmethods.caf.faces.data.ws.glue.GlueWSClientContentProvider;

/**
 * Glue Web Service Client bean generated for 
 * com.webmethods.caf.is.wsclient.campusconnect.work.administration.getexmareasons_wsd_mw1.IgetExmaReasons_WSD_MW1_PortType.getExmaReasons.
 */
public class GetExmaReasons2 extends GlueWSClientContentProvider {

	private static final long serialVersionUID = 7944592765517647872L;

	/**
	 * Default constructor
	 */
	public GetExmaReasons2() {
		super(com.webmethods.caf.is.wsclient.campusconnect.work.administration.getexmareasons_wsd_mw1.IgetExmaReasons_WSD_MW1_PortType.class, // port type proxy class
			"getExmaReasons", // method to invoke
			new String[] { "getExmaReasons", }, // method parameter names
			new Class[] { com.webmethods.caf.is.wsclient.campusconnect.work.administration.getexmareasons_wsd_mw1.getExmaReasons.class, } // method parameter types
		);
		// wsdl and maps by are saved in the same package
		setWsdlUrl("classpath:getExmaReasons_WSD_MW1.wsdl");
		setMapUrls(new String[] { "classpath:getExmaReasons_WSD_MW1.map", });

		// init wsclient
		initParams();
		
		// parameters bean
		parameters = new Parameters();
		
		// complex output, just a place holder
		result = new com.webmethods.caf.is.wsclient.campusconnect.work.administration.getexmareasons_wsd_mw1.getExmaReasonsResponse();
		
	}
	
	
	/**
	 * Method parameters bean
	 */
	public class Parameters  implements java.io.Serializable {

		private static final long serialVersionUID = 3116843331184068608L;

		public Parameters() {
		}
	
		private com.webmethods.caf.is.wsclient.campusconnect.work.administration.getexmareasons_wsd_mw1.getExmaReasons getExmaReasons  = new  com.webmethods.caf.is.wsclient.campusconnect.work.administration.getexmareasons_wsd_mw1.getExmaReasons() ;

		public com.webmethods.caf.is.wsclient.campusconnect.work.administration.getexmareasons_wsd_mw1.getExmaReasons getGetExmaReasons() {
			return getExmaReasons;
		}

		public void setGetExmaReasons(com.webmethods.caf.is.wsclient.campusconnect.work.administration.getexmareasons_wsd_mw1.getExmaReasons getExmaReasons) {
			this.getExmaReasons = getExmaReasons;
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
	public com.webmethods.caf.is.wsclient.campusconnect.work.administration.getexmareasons_wsd_mw1.getExmaReasonsResponse getResult() {
		return (com.webmethods.caf.is.wsclient.campusconnect.work.administration.getexmareasons_wsd_mw1.getExmaReasonsResponse)result;
	}
	

		
}