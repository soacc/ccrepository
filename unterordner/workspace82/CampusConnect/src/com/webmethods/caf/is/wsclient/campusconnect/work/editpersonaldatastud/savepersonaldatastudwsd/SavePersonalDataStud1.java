package com.webmethods.caf.is.wsclient.campusconnect.work.editpersonaldatastud.savepersonaldatastudwsd;


import com.webmethods.caf.faces.data.ws.glue.GlueWSClientContentProvider;

/**
 * Glue Web Service Client bean generated for 
 * com.webmethods.caf.is.wsclient.campusconnect.work.editpersonaldatastud.savepersonaldatastudwsd.IsavePersonalDataStudwsd_PortType.savePersonalDataStud.
 */
public class SavePersonalDataStud1 extends GlueWSClientContentProvider {

	private static final long serialVersionUID = 6362815986387993600L;

	/**
	 * Default constructor
	 */
	public SavePersonalDataStud1() {
		super(com.webmethods.caf.is.wsclient.campusconnect.work.editpersonaldatastud.savepersonaldatastudwsd.IsavePersonalDataStudwsd_PortType.class, // port type proxy class
			"savePersonalDataStud", // method to invoke
			new String[] { "savePersonalDataStud", }, // method parameter names
			new Class[] { com.webmethods.caf.is.wsclient.campusconnect.work.editpersonaldatastud.savepersonaldatastudwsd.savePersonalDataStud.class, } // method parameter types
		);
		// wsdl and maps by are saved in the same package
		setWsdlUrl("classpath:savePersonalDataStudwsd.wsdl");
		setMapUrls(new String[] { "classpath:savePersonalDataStudwsd.map", });

		// init wsclient
		initParams();
		
		// parameters bean
		parameters = new Parameters();
		
		// complex output, just a place holder
		result = new com.webmethods.caf.is.wsclient.campusconnect.work.editpersonaldatastud.savepersonaldatastudwsd.savePersonalDataStudResponse();
		
	}
	
	
	/**
	 * Method parameters bean
	 */
	public class Parameters  implements java.io.Serializable {

		private static final long serialVersionUID = 2264272998918427648L;

		public Parameters() {
		}
	
		private com.webmethods.caf.is.wsclient.campusconnect.work.editpersonaldatastud.savepersonaldatastudwsd.savePersonalDataStud savePersonalDataStud  = new  com.webmethods.caf.is.wsclient.campusconnect.work.editpersonaldatastud.savepersonaldatastudwsd.savePersonalDataStud() ;

		public com.webmethods.caf.is.wsclient.campusconnect.work.editpersonaldatastud.savepersonaldatastudwsd.savePersonalDataStud getSavePersonalDataStud() {
			return savePersonalDataStud;
		}

		public void setSavePersonalDataStud(com.webmethods.caf.is.wsclient.campusconnect.work.editpersonaldatastud.savepersonaldatastudwsd.savePersonalDataStud savePersonalDataStud) {
			this.savePersonalDataStud = savePersonalDataStud;
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
	public com.webmethods.caf.is.wsclient.campusconnect.work.editpersonaldatastud.savepersonaldatastudwsd.savePersonalDataStudResponse getResult() {
		return (com.webmethods.caf.is.wsclient.campusconnect.work.editpersonaldatastud.savepersonaldatastudwsd.savePersonalDataStudResponse)result;
	}
	

		
}