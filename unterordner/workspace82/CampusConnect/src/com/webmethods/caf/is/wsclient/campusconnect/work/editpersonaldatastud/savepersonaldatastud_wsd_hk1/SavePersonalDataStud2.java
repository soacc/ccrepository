package com.webmethods.caf.is.wsclient.campusconnect.work.editpersonaldatastud.savepersonaldatastud_wsd_hk1;


import com.webmethods.caf.faces.data.ws.glue.GlueWSClientContentProvider;

/**
 * Glue Web Service Client bean generated for 
 * com.webmethods.caf.is.wsclient.campusconnect.work.editpersonaldatastud.savepersonaldatastud_wsd_hk1.IsavePersonalDataStud_WSD_HK1_PortType.savePersonalDataStud.
 */
public class SavePersonalDataStud2 extends GlueWSClientContentProvider {

	private static final long serialVersionUID = 6746557586292568064L;

	/**
	 * Default constructor
	 */
	public SavePersonalDataStud2() {
		super(com.webmethods.caf.is.wsclient.campusconnect.work.editpersonaldatastud.savepersonaldatastud_wsd_hk1.IsavePersonalDataStud_WSD_HK1_PortType.class, // port type proxy class
			"savePersonalDataStud", // method to invoke
			new String[] { "savePersonalDataStud", }, // method parameter names
			new Class[] { com.webmethods.caf.is.wsclient.campusconnect.work.editpersonaldatastud.savepersonaldatastud_wsd_hk1.savePersonalDataStud.class, } // method parameter types
		);
		// wsdl and maps by are saved in the same package
		setWsdlUrl("classpath:savePersonalDataStud_WSD_HK1.wsdl");
		setMapUrls(new String[] { "classpath:savePersonalDataStud_WSD_HK1.map", });

		// init wsclient
		initParams();
		
		// parameters bean
		parameters = new Parameters();
		
		// complex output, just a place holder
		result = new com.webmethods.caf.is.wsclient.campusconnect.work.editpersonaldatastud.savepersonaldatastud_wsd_hk1.savePersonalDataStudResponse();
		
	}
	
	
	/**
	 * Method parameters bean
	 */
	public class Parameters  implements java.io.Serializable {

		private static final long serialVersionUID = 5658563630922998784L;

		public Parameters() {
		}
	
		private com.webmethods.caf.is.wsclient.campusconnect.work.editpersonaldatastud.savepersonaldatastud_wsd_hk1.savePersonalDataStud savePersonalDataStud  = new  com.webmethods.caf.is.wsclient.campusconnect.work.editpersonaldatastud.savepersonaldatastud_wsd_hk1.savePersonalDataStud() ;

		public com.webmethods.caf.is.wsclient.campusconnect.work.editpersonaldatastud.savepersonaldatastud_wsd_hk1.savePersonalDataStud getSavePersonalDataStud() {
			return savePersonalDataStud;
		}

		public void setSavePersonalDataStud(com.webmethods.caf.is.wsclient.campusconnect.work.editpersonaldatastud.savepersonaldatastud_wsd_hk1.savePersonalDataStud savePersonalDataStud) {
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
	public com.webmethods.caf.is.wsclient.campusconnect.work.editpersonaldatastud.savepersonaldatastud_wsd_hk1.savePersonalDataStudResponse getResult() {
		return (com.webmethods.caf.is.wsclient.campusconnect.work.editpersonaldatastud.savepersonaldatastud_wsd_hk1.savePersonalDataStudResponse)result;
	}
	

		
}