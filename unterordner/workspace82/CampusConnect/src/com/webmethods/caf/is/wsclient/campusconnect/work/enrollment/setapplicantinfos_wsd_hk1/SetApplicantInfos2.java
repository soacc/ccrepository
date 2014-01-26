package com.webmethods.caf.is.wsclient.campusconnect.work.enrollment.setapplicantinfos_wsd_hk1;


import com.webmethods.caf.faces.data.ws.glue.GlueWSClientContentProvider;

/**
 * Glue Web Service Client bean generated for 
 * com.webmethods.caf.is.wsclient.campusconnect.work.enrollment.setapplicantinfos_wsd_hk1.IsetApplicantInfos_WSD_HK1_PortType.setApplicantInfos.
 */
public class SetApplicantInfos2 extends GlueWSClientContentProvider {

	private static final long serialVersionUID = 3851200565474222080L;

	/**
	 * Default constructor
	 */
	public SetApplicantInfos2() {
		super(com.webmethods.caf.is.wsclient.campusconnect.work.enrollment.setapplicantinfos_wsd_hk1.IsetApplicantInfos_WSD_HK1_PortType.class, // port type proxy class
			"setApplicantInfos", // method to invoke
			new String[] { "setApplicantInfos",  "result", }, // method parameter names
			new Class[] { com.webmethods.caf.is.wsclient.campusconnect.work.enrollment.setapplicantinfos_wsd_hk1.setApplicantInfos.class,  electric.util.async.Async.class, } // method parameter types
		);
		// wsdl and maps by are saved in the same package
		setWsdlUrl("classpath:setApplicantInfos_WSD_HK1.wsdl");
		setMapUrls(new String[] { "classpath:setApplicantInfos_WSD_HK1.map", });

		// init wsclient
		initParams();
		
		// parameters bean
		parameters = new Parameters();
		
	}
	
	
	/**
	 * Method parameters bean
	 */
	public class Parameters  implements java.io.Serializable {

		private static final long serialVersionUID = 8990051766484541440L;

		public Parameters() {
		}
	
		private com.webmethods.caf.is.wsclient.campusconnect.work.enrollment.setapplicantinfos_wsd_hk1.setApplicantInfos setApplicantInfos  = new  com.webmethods.caf.is.wsclient.campusconnect.work.enrollment.setapplicantinfos_wsd_hk1.setApplicantInfos() ;

		public com.webmethods.caf.is.wsclient.campusconnect.work.enrollment.setapplicantinfos_wsd_hk1.setApplicantInfos getSetApplicantInfos() {
			return setApplicantInfos;
		}

		public void setSetApplicantInfos(com.webmethods.caf.is.wsclient.campusconnect.work.enrollment.setapplicantinfos_wsd_hk1.setApplicantInfos setApplicantInfos) {
			this.setApplicantInfos = setApplicantInfos;
		} 	
		
	}
	
	
	
	/**
	 * Return method invocation parameters bean
	 */
	public Parameters getParameters() {
		return (Parameters)parameters;
	}	
	


	

		
}