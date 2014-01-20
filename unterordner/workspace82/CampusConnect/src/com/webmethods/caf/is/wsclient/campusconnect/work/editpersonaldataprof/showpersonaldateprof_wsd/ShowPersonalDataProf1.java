package com.webmethods.caf.is.wsclient.campusconnect.work.editpersonaldataprof.showpersonaldateprof_wsd;


import com.webmethods.caf.faces.data.ws.glue.GlueWSClientContentProvider;

/**
 * Glue Web Service Client bean generated for 
 * com.webmethods.caf.is.wsclient.campusconnect.work.editpersonaldataprof.showpersonaldateprof_wsd.IshowPersonalDateProf_WSD_PortType.showPersonalDataProf.
 */
public class ShowPersonalDataProf1 extends GlueWSClientContentProvider {

	private static final long serialVersionUID = 6203636006692272128L;

	/**
	 * Default constructor
	 */
	public ShowPersonalDataProf1() {
		super(com.webmethods.caf.is.wsclient.campusconnect.work.editpersonaldataprof.showpersonaldateprof_wsd.IshowPersonalDateProf_WSD_PortType.class, // port type proxy class
			"showPersonalDataProf", // method to invoke
			new String[] { "showPersonalDataProf", }, // method parameter names
			new Class[] { com.webmethods.caf.is.wsclient.campusconnect.work.editpersonaldataprof.showpersonaldateprof_wsd.showPersonalDataProf.class, } // method parameter types
		);
		// wsdl and maps by are saved in the same package
		setWsdlUrl("classpath:showPersonalDateProf_WSD.wsdl");
		setMapUrls(new String[] { "classpath:showPersonalDateProf_WSD.map", });

		// init wsclient
		initParams();
		
		// parameters bean
		parameters = new Parameters();
		
		// complex output, just a place holder
		result = new com.webmethods.caf.is.wsclient.campusconnect.work.editpersonaldataprof.showpersonaldateprof_wsd.showPersonalDataProfResponse();
		
	}
	
	
	/**
	 * Method parameters bean
	 */
	public class Parameters  implements java.io.Serializable {

		private static final long serialVersionUID = 6060017436448561152L;

		public Parameters() {
		}
	
		private com.webmethods.caf.is.wsclient.campusconnect.work.editpersonaldataprof.showpersonaldateprof_wsd.showPersonalDataProf showPersonalDataProf  = new  com.webmethods.caf.is.wsclient.campusconnect.work.editpersonaldataprof.showpersonaldateprof_wsd.showPersonalDataProf() ;

		public com.webmethods.caf.is.wsclient.campusconnect.work.editpersonaldataprof.showpersonaldateprof_wsd.showPersonalDataProf getShowPersonalDataProf() {
			return showPersonalDataProf;
		}

		public void setShowPersonalDataProf(com.webmethods.caf.is.wsclient.campusconnect.work.editpersonaldataprof.showpersonaldateprof_wsd.showPersonalDataProf showPersonalDataProf) {
			this.showPersonalDataProf = showPersonalDataProf;
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
	public com.webmethods.caf.is.wsclient.campusconnect.work.editpersonaldataprof.showpersonaldateprof_wsd.showPersonalDataProfResponse getResult() {
		return (com.webmethods.caf.is.wsclient.campusconnect.work.editpersonaldataprof.showpersonaldateprof_wsd.showPersonalDataProfResponse)result;
	}
	

		
}