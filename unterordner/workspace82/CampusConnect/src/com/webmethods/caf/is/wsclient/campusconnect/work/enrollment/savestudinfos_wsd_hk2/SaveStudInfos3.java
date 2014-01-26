package com.webmethods.caf.is.wsclient.campusconnect.work.enrollment.savestudinfos_wsd_hk2;


import com.webmethods.caf.faces.data.ws.glue.GlueWSClientContentProvider;

/**
 * Glue Web Service Client bean generated for 
 * com.webmethods.caf.is.wsclient.campusconnect.work.enrollment.savestudinfos_wsd_hk2.IsaveStudInfos_WSD_HK2_PortType.saveStudInfos.
 */
public class SaveStudInfos3 extends GlueWSClientContentProvider {

	private static final long serialVersionUID = 4434452122454302720L;

	/**
	 * Default constructor
	 */
	public SaveStudInfos3() {
		super(com.webmethods.caf.is.wsclient.campusconnect.work.enrollment.savestudinfos_wsd_hk2.IsaveStudInfos_WSD_HK2_PortType.class, // port type proxy class
			"saveStudInfos", // method to invoke
			new String[] { "saveStudInfos", }, // method parameter names
			new Class[] { com.webmethods.caf.is.wsclient.campusconnect.work.enrollment.savestudinfos_wsd_hk2.saveStudInfos.class, } // method parameter types
		);
		// wsdl and maps by are saved in the same package
		setWsdlUrl("classpath:saveStudInfos_WSD_HK2.wsdl");
		setMapUrls(new String[] { "classpath:saveStudInfos_WSD_HK2.map", });

		// init wsclient
		initParams();
		
		// parameters bean
		parameters = new Parameters();
		
		// complex output, just a place holder
		result = new com.webmethods.caf.is.wsclient.campusconnect.work.enrollment.savestudinfos_wsd_hk2.saveStudInfosResponse();
		
	}
	
	
	/**
	 * Method parameters bean
	 */
	public class Parameters  implements java.io.Serializable {

		private static final long serialVersionUID = 5151931782568984576L;

		public Parameters() {
		}
	
		private com.webmethods.caf.is.wsclient.campusconnect.work.enrollment.savestudinfos_wsd_hk2.saveStudInfos saveStudInfos  = new  com.webmethods.caf.is.wsclient.campusconnect.work.enrollment.savestudinfos_wsd_hk2.saveStudInfos() ;

		public com.webmethods.caf.is.wsclient.campusconnect.work.enrollment.savestudinfos_wsd_hk2.saveStudInfos getSaveStudInfos() {
			return saveStudInfos;
		}

		public void setSaveStudInfos(com.webmethods.caf.is.wsclient.campusconnect.work.enrollment.savestudinfos_wsd_hk2.saveStudInfos saveStudInfos) {
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
	public com.webmethods.caf.is.wsclient.campusconnect.work.enrollment.savestudinfos_wsd_hk2.saveStudInfosResponse getResult() {
		return (com.webmethods.caf.is.wsclient.campusconnect.work.enrollment.savestudinfos_wsd_hk2.saveStudInfosResponse)result;
	}
	

		
}