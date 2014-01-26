package com.webmethods.caf.is.wsclient.campusconnect.work.enrollment.getapplicantinfos_wsd_hk1;


import com.webmethods.caf.faces.data.ws.glue.GlueWSClientContentProvider;

/**
 * Glue Web Service Client bean generated for 
 * com.webmethods.caf.is.wsclient.campusconnect.work.enrollment.getapplicantinfos_wsd_hk1.IgetApplicantInfos_WSD_HK1_PortType.getApplicantInfos.
 */
public class GetApplicantInfos2 extends GlueWSClientContentProvider {

	private static final long serialVersionUID = 424030191265060864L;

	/**
	 * Default constructor
	 */
	public GetApplicantInfos2() {
		super(com.webmethods.caf.is.wsclient.campusconnect.work.enrollment.getapplicantinfos_wsd_hk1.IgetApplicantInfos_WSD_HK1_PortType.class, // port type proxy class
			"getApplicantInfos", // method to invoke
			new String[] { "getApplicantInfos", }, // method parameter names
			new Class[] { com.webmethods.caf.is.wsclient.campusconnect.work.enrollment.getapplicantinfos_wsd_hk1.getApplicantInfos.class, } // method parameter types
		);
		// wsdl and maps by are saved in the same package
		setWsdlUrl("classpath:getApplicantInfos_WSD_HK1.wsdl");
		setMapUrls(new String[] { "classpath:getApplicantInfos_WSD_HK1.map", });

		// init wsclient
		initParams();
		
		// parameters bean
		parameters = new Parameters();
		
		// complex output, just a place holder
		result = new com.webmethods.caf.is.wsclient.campusconnect.work.enrollment.getapplicantinfos_wsd_hk1.getApplicantInfosResponse();
		
	}
	
	
	/**
	 * Method parameters bean
	 */
	public class Parameters  implements java.io.Serializable {

		private static final long serialVersionUID = 4511989113554839552L;

		public Parameters() {
		}
	
		private com.webmethods.caf.is.wsclient.campusconnect.work.enrollment.getapplicantinfos_wsd_hk1.getApplicantInfos getApplicantInfos  = new  com.webmethods.caf.is.wsclient.campusconnect.work.enrollment.getapplicantinfos_wsd_hk1.getApplicantInfos() ;

		public com.webmethods.caf.is.wsclient.campusconnect.work.enrollment.getapplicantinfos_wsd_hk1.getApplicantInfos getGetApplicantInfos() {
			return getApplicantInfos;
		}

		public void setGetApplicantInfos(com.webmethods.caf.is.wsclient.campusconnect.work.enrollment.getapplicantinfos_wsd_hk1.getApplicantInfos getApplicantInfos) {
			this.getApplicantInfos = getApplicantInfos;
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
	public com.webmethods.caf.is.wsclient.campusconnect.work.enrollment.getapplicantinfos_wsd_hk1.getApplicantInfosResponse getResult() {
		return (com.webmethods.caf.is.wsclient.campusconnect.work.enrollment.getapplicantinfos_wsd_hk1.getApplicantInfosResponse)result;
	}
	

		
}