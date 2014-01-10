package com.webmethods.caf.is.wsclient.campusconnect.work.enrolment.setstudactive_wsd;


import com.webmethods.caf.faces.data.ws.glue.GlueWSClientContentProvider;

/**
 * Glue Web Service Client bean generated for 
 * com.webmethods.caf.is.wsclient.campusconnect.work.enrolment.setstudactive_wsd.IsetStudActive_WSD_PortType.setStudActive.
 */
public class SetStudActive1 extends GlueWSClientContentProvider {

	private static final long serialVersionUID = 2739307077442341888L;

	/**
	 * Default constructor
	 */
	public SetStudActive1() {
		super(com.webmethods.caf.is.wsclient.campusconnect.work.enrolment.setstudactive_wsd.IsetStudActive_WSD_PortType.class, // port type proxy class
			"setStudActive", // method to invoke
			new String[] { "setStudActive", }, // method parameter names
			new Class[] { com.webmethods.caf.is.wsclient.campusconnect.work.enrolment.setstudactive_wsd.setStudActive.class, } // method parameter types
		);
		// wsdl and maps by are saved in the same package
		setWsdlUrl("classpath:setStudActive_WSD.wsdl");
		setMapUrls(new String[] { "classpath:setStudActive_WSD.map", });

		// init wsclient
		initParams();
		
		// parameters bean
		parameters = new Parameters();
		
		// complex output, just a place holder
		result = new com.webmethods.caf.is.wsclient.campusconnect.work.enrolment.setstudactive_wsd.setStudActiveResponse();
		
	}
	
	
	/**
	 * Method parameters bean
	 */
	public class Parameters  implements java.io.Serializable {

		private static final long serialVersionUID = 6610652280295452672L;

		public Parameters() {
		}
	
		private com.webmethods.caf.is.wsclient.campusconnect.work.enrolment.setstudactive_wsd.setStudActive setStudActive  = new  com.webmethods.caf.is.wsclient.campusconnect.work.enrolment.setstudactive_wsd.setStudActive() ;

		public com.webmethods.caf.is.wsclient.campusconnect.work.enrolment.setstudactive_wsd.setStudActive getSetStudActive() {
			return setStudActive;
		}

		public void setSetStudActive(com.webmethods.caf.is.wsclient.campusconnect.work.enrolment.setstudactive_wsd.setStudActive setStudActive) {
			this.setStudActive = setStudActive;
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
	public com.webmethods.caf.is.wsclient.campusconnect.work.enrolment.setstudactive_wsd.setStudActiveResponse getResult() {
		return (com.webmethods.caf.is.wsclient.campusconnect.work.enrolment.setstudactive_wsd.setStudActiveResponse)result;
	}
	

		
}