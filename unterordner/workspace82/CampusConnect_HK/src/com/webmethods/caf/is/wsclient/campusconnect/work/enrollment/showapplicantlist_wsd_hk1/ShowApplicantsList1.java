package com.webmethods.caf.is.wsclient.campusconnect.work.enrollment.showapplicantlist_wsd_hk1;


import com.webmethods.caf.faces.data.ws.glue.GlueWSClientContentProvider;

/**
 * Glue Web Service Client bean generated for 
 * com.webmethods.caf.is.wsclient.campusconnect.work.enrollment.showapplicantlist_wsd_hk1.IshowApplicantList_WSD_HK1_PortType.showApplicantsList.
 */
public class ShowApplicantsList1 extends GlueWSClientContentProvider {

	private static final long serialVersionUID = 6766369394111084544L;

	/**
	 * Default constructor
	 */
	public ShowApplicantsList1() {
		super(com.webmethods.caf.is.wsclient.campusconnect.work.enrollment.showapplicantlist_wsd_hk1.IshowApplicantList_WSD_HK1_PortType.class, // port type proxy class
			"showApplicantsList", // method to invoke
			new String[] { "showApplicantsList", }, // method parameter names
			new Class[] { com.webmethods.caf.is.wsclient.campusconnect.work.enrollment.showapplicantlist_wsd_hk1.showApplicantsList.class, } // method parameter types
		);
		// wsdl and maps by are saved in the same package
		setWsdlUrl("classpath:showApplicantList_WSD_HK1.wsdl");
		setMapUrls(new String[] { "classpath:showApplicantList_WSD_HK1.map", });

		// init wsclient
		initParams();
		
		// parameters bean
		parameters = new Parameters();
		
		// complex output, just a place holder
		result = new com.webmethods.caf.is.wsclient.campusconnect.work.enrollment.showapplicantlist_wsd_hk1.showApplicantsListResponse();
		
	}
	
	
	/**
	 * Method parameters bean
	 */
	public class Parameters  implements java.io.Serializable {

		private static final long serialVersionUID = 8532240518106796032L;

		public Parameters() {
		}
	
		private com.webmethods.caf.is.wsclient.campusconnect.work.enrollment.showapplicantlist_wsd_hk1.showApplicantsList showApplicantsList  = new  com.webmethods.caf.is.wsclient.campusconnect.work.enrollment.showapplicantlist_wsd_hk1.showApplicantsList() ;

		public com.webmethods.caf.is.wsclient.campusconnect.work.enrollment.showapplicantlist_wsd_hk1.showApplicantsList getShowApplicantsList() {
			return showApplicantsList;
		}

		public void setShowApplicantsList(com.webmethods.caf.is.wsclient.campusconnect.work.enrollment.showapplicantlist_wsd_hk1.showApplicantsList showApplicantsList) {
			this.showApplicantsList = showApplicantsList;
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
	public com.webmethods.caf.is.wsclient.campusconnect.work.enrollment.showapplicantlist_wsd_hk1.showApplicantsListResponse getResult() {
		return (com.webmethods.caf.is.wsclient.campusconnect.work.enrollment.showapplicantlist_wsd_hk1.showApplicantsListResponse)result;
	}
	

		
}