package com.webmethods.caf.is.wsclient.campusconnect.work.enrolment.savestudinfos_wsd;


import com.webmethods.caf.faces.data.ws.glue.GlueWSClientContentProvider;

/**
 * Glue Web Service Client bean generated for 
 * com.webmethods.caf.is.wsclient.campusconnect.work.enrolment.savestudinfos_wsd.IsaveStudInfos_WSD_PortType.saveStudInfos.
 */
public class SaveStudInfos1 extends GlueWSClientContentProvider {

	private static final long serialVersionUID = 7648946087184014336L;

	/**
	 * Default constructor
	 */
	public SaveStudInfos1() {
		super(com.webmethods.caf.is.wsclient.campusconnect.work.enrolment.savestudinfos_wsd.IsaveStudInfos_WSD_PortType.class, // port type proxy class
			"saveStudInfos", // method to invoke
			new String[] { "saveStudInfos", }, // method parameter names
			new Class[] { com.webmethods.caf.is.wsclient.campusconnect.work.enrolment.savestudinfos_wsd.saveStudInfos.class, } // method parameter types
		);
		// wsdl and maps by are saved in the same package
		setWsdlUrl("classpath:saveStudInfos_WSD.wsdl");
		setMapUrls(new String[] { "classpath:saveStudInfos_WSD.map", });

		// init wsclient
		initParams();
		
		// parameters bean
		parameters = new Parameters();
		
		// complex output, just a place holder
		result = new com.webmethods.caf.is.wsclient.campusconnect.work.enrolment.savestudinfos_wsd.saveStudInfosResponse();
		
	}
	
	
	/**
	 * Method parameters bean
	 */
	public class Parameters  implements java.io.Serializable {

		private static final long serialVersionUID = 5700179893332133888L;

		public Parameters() {
		}
	
		private com.webmethods.caf.is.wsclient.campusconnect.work.enrolment.savestudinfos_wsd.saveStudInfos saveStudInfos  = new  com.webmethods.caf.is.wsclient.campusconnect.work.enrolment.savestudinfos_wsd.saveStudInfos() ;

		public com.webmethods.caf.is.wsclient.campusconnect.work.enrolment.savestudinfos_wsd.saveStudInfos getSaveStudInfos() {
			return saveStudInfos;
		}

		public void setSaveStudInfos(com.webmethods.caf.is.wsclient.campusconnect.work.enrolment.savestudinfos_wsd.saveStudInfos saveStudInfos) {
			this.saveStudInfos = saveStudInfos;
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
	public com.webmethods.caf.is.wsclient.campusconnect.work.enrolment.savestudinfos_wsd.saveStudInfosResponse getResult() {
		return (com.webmethods.caf.is.wsclient.campusconnect.work.enrolment.savestudinfos_wsd.saveStudInfosResponse)result;
	}
	

		
}