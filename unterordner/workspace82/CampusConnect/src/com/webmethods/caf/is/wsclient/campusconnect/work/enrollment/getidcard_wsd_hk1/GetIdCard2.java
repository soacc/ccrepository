package com.webmethods.caf.is.wsclient.campusconnect.work.enrollment.getidcard_wsd_hk1;


import com.webmethods.caf.faces.data.ws.glue.GlueWSClientContentProvider;

/**
 * Glue Web Service Client bean generated for 
 * com.webmethods.caf.is.wsclient.campusconnect.work.enrollment.getidcard_wsd_hk1.IgetIdCard_WSD_HK1_PortType.getIdCard.
 */
public class GetIdCard2 extends GlueWSClientContentProvider {

	private static final long serialVersionUID = 2717823269028069376L;

	/**
	 * Default constructor
	 */
	public GetIdCard2() {
		super(com.webmethods.caf.is.wsclient.campusconnect.work.enrollment.getidcard_wsd_hk1.IgetIdCard_WSD_HK1_PortType.class, // port type proxy class
			"getIdCard", // method to invoke
			new String[] { "getIdCard", }, // method parameter names
			new Class[] { com.webmethods.caf.is.wsclient.campusconnect.work.enrollment.getidcard_wsd_hk1.getIdCard.class, } // method parameter types
		);
		// wsdl and maps by are saved in the same package
		setWsdlUrl("classpath:getIdCard_WSD_HK1.wsdl");
		setMapUrls(new String[] { "classpath:getIdCard_WSD_HK1.map", });

		// init wsclient
		initParams();
		
		// parameters bean
		parameters = new Parameters();
		
		// complex output, just a place holder
		result = new com.webmethods.caf.is.wsclient.campusconnect.work.enrollment.getidcard_wsd_hk1.getIdCardResponse();
		
	}
	
	
	/**
	 * Method parameters bean
	 */
	public class Parameters  implements java.io.Serializable {

		private static final long serialVersionUID = 2054650392825351168L;

		public Parameters() {
		}
	
		private com.webmethods.caf.is.wsclient.campusconnect.work.enrollment.getidcard_wsd_hk1.getIdCard getIdCard  = new  com.webmethods.caf.is.wsclient.campusconnect.work.enrollment.getidcard_wsd_hk1.getIdCard() ;

		public com.webmethods.caf.is.wsclient.campusconnect.work.enrollment.getidcard_wsd_hk1.getIdCard getGetIdCard() {
			return getIdCard;
		}

		public void setGetIdCard(com.webmethods.caf.is.wsclient.campusconnect.work.enrollment.getidcard_wsd_hk1.getIdCard getIdCard) {
			this.getIdCard = getIdCard;
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
	public com.webmethods.caf.is.wsclient.campusconnect.work.enrollment.getidcard_wsd_hk1.getIdCardResponse getResult() {
		return (com.webmethods.caf.is.wsclient.campusconnect.work.enrollment.getidcard_wsd_hk1.getIdCardResponse)result;
	}
	

		
}