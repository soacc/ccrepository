package com.webmethods.caf.is.wsclient.campusconnect.work.editpersonaldatastud.showpersonaldatastud_wsd;


import com.webmethods.caf.faces.data.ws.glue.GlueWSClientContentProvider;

/**
 * Glue Web Service Client bean generated for 
 * com.webmethods.caf.is.wsclient.campusconnect.work.editpersonaldatastud.showpersonaldatastud_wsd.IshowPersonalDataStud_WSD_PortType.showPersonalDataStud.
 */
public class ShowPersonalDataStud1 extends GlueWSClientContentProvider {

	private static final long serialVersionUID = 3091695177939710976L;

	/**
	 * Default constructor
	 */
	public ShowPersonalDataStud1() {
		super(com.webmethods.caf.is.wsclient.campusconnect.work.editpersonaldatastud.showpersonaldatastud_wsd.IshowPersonalDataStud_WSD_PortType.class, // port type proxy class
			"showPersonalDataStud", // method to invoke
			new String[] { "showPersonalDataStud", }, // method parameter names
			new Class[] { com.webmethods.caf.is.wsclient.campusconnect.work.editpersonaldatastud.showpersonaldatastud_wsd.showPersonalDataStud.class, } // method parameter types
		);
		// wsdl and maps by are saved in the same package
		setWsdlUrl("classpath:showPersonalDataStud_WSD.wsdl");
		setMapUrls(new String[] { "classpath:showPersonalDataStud_WSD.map", });

		// init wsclient
		initParams();
		
		// parameters bean
		parameters = new Parameters();
		
		// complex output, just a place holder
		result = new com.webmethods.caf.is.wsclient.campusconnect.work.editpersonaldatastud.showpersonaldatastud_wsd.showPersonalDataStudResponse();
		
	}
	
	
	/**
	 * Method parameters bean
	 */
	public class Parameters  implements java.io.Serializable {

		private static final long serialVersionUID = 6843339134858746880L;

		public Parameters() {
		}
	
		private com.webmethods.caf.is.wsclient.campusconnect.work.editpersonaldatastud.showpersonaldatastud_wsd.showPersonalDataStud showPersonalDataStud  = new  com.webmethods.caf.is.wsclient.campusconnect.work.editpersonaldatastud.showpersonaldatastud_wsd.showPersonalDataStud() ;

		public com.webmethods.caf.is.wsclient.campusconnect.work.editpersonaldatastud.showpersonaldatastud_wsd.showPersonalDataStud getShowPersonalDataStud() {
			return showPersonalDataStud;
		}

		public void setShowPersonalDataStud(com.webmethods.caf.is.wsclient.campusconnect.work.editpersonaldatastud.showpersonaldatastud_wsd.showPersonalDataStud showPersonalDataStud) {
			this.showPersonalDataStud = showPersonalDataStud;
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
	public com.webmethods.caf.is.wsclient.campusconnect.work.editpersonaldatastud.showpersonaldatastud_wsd.showPersonalDataStudResponse getResult() {
		return (com.webmethods.caf.is.wsclient.campusconnect.work.editpersonaldatastud.showpersonaldatastud_wsd.showPersonalDataStudResponse)result;
	}
	

		
}