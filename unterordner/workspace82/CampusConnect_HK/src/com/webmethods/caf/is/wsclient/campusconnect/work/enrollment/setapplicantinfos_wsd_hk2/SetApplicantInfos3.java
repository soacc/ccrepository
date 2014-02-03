package com.webmethods.caf.is.wsclient.campusconnect.work.enrollment.setapplicantinfos_wsd_hk2;


import com.webmethods.caf.faces.data.ws.glue.GlueWSClientContentProvider;

/**
 * Glue Web Service Client bean generated for 
 * com.webmethods.caf.is.wsclient.campusconnect.work.enrollment.setapplicantinfos_wsd_hk2.IsetApplicantInfos_WSD_HK2_PortType.setApplicantInfos.
 */
public class SetApplicantInfos3 extends GlueWSClientContentProvider {

	private static final long serialVersionUID = 3300292236204706816L;

	/**
	 * Default constructor
	 */
	public SetApplicantInfos3() {
		super(com.webmethods.caf.is.wsclient.campusconnect.work.enrollment.setapplicantinfos_wsd_hk2.IsetApplicantInfos_WSD_HK2_PortType.class, // port type proxy class
			"setApplicantInfos", // method to invoke
			new String[] { "setApplicantInfos", }, // method parameter names
			new Class[] { com.webmethods.caf.is.wsclient.campusconnect.work.enrollment.setapplicantinfos_wsd_hk2.setApplicantInfos.class, } // method parameter types
		);
		// wsdl and maps by are saved in the same package
		setWsdlUrl("classpath:setApplicantInfos_WSD_HK2.wsdl");
		setMapUrls(new String[] { "classpath:setApplicantInfos_WSD_HK2.map", });

		// init wsclient
		initParams();
		
		// parameters bean
		parameters = new Parameters();
		
		// complex output, just a place holder
		result = new com.webmethods.caf.is.wsclient.campusconnect.work.enrollment.setapplicantinfos_wsd_hk2.setApplicantInfosResponse();
		
	}
	
	
	/**
	 * Method parameters bean
	 */
	public class Parameters  implements java.io.Serializable {

		private static final long serialVersionUID = 7139609238542028800L;

		public Parameters() {
		}
	
		private com.webmethods.caf.is.wsclient.campusconnect.work.enrollment.setapplicantinfos_wsd_hk2.setApplicantInfos setApplicantInfos  = new  com.webmethods.caf.is.wsclient.campusconnect.work.enrollment.setapplicantinfos_wsd_hk2.setApplicantInfos() ;

		public com.webmethods.caf.is.wsclient.campusconnect.work.enrollment.setapplicantinfos_wsd_hk2.setApplicantInfos getSetApplicantInfos() {
			return setApplicantInfos;
		}

		public void setSetApplicantInfos(com.webmethods.caf.is.wsclient.campusconnect.work.enrollment.setapplicantinfos_wsd_hk2.setApplicantInfos setApplicantInfos) {
			this.setApplicantInfos = setApplicantInfos;
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
	public com.webmethods.caf.is.wsclient.campusconnect.work.enrollment.setapplicantinfos_wsd_hk2.setApplicantInfosResponse getResult() {
		return (com.webmethods.caf.is.wsclient.campusconnect.work.enrollment.setapplicantinfos_wsd_hk2.setApplicantInfosResponse)result;
	}
	

		
}