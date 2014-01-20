package com.webmethods.caf.is.wsclient.campusconnect.work.personaldata.showpersonaldata_wsd;


import com.webmethods.caf.faces.data.ws.glue.GlueWSClientContentProvider;

/**
 * Glue Web Service Client bean generated for 
 * com.webmethods.caf.is.wsclient.campusconnect.work.personaldata.showpersonaldata_wsd.IshowPersonalData_WSD_PortType.showPersonalData.
 */
public class ShowPersonalData1 extends GlueWSClientContentProvider {

	private static final long serialVersionUID = 8662208481898582016L;

	/**
	 * Default constructor
	 */
	public ShowPersonalData1() {
		super(com.webmethods.caf.is.wsclient.campusconnect.work.personaldata.showpersonaldata_wsd.IshowPersonalData_WSD_PortType.class, // port type proxy class
			"showPersonalData", // method to invoke
			new String[] { "showPersonalData", }, // method parameter names
			new Class[] { com.webmethods.caf.is.wsclient.campusconnect.work.personaldata.showpersonaldata_wsd.showPersonalData.class, } // method parameter types
		);
		// wsdl and maps by are saved in the same package
		setWsdlUrl("classpath:showPersonalData_WSD.wsdl");
		setMapUrls(new String[] { "classpath:showPersonalData_WSD.map", });

		// init wsclient
		initParams();
		
		// parameters bean
		parameters = new Parameters();
		
		// complex output, just a place holder
		result = new com.webmethods.caf.is.wsclient.campusconnect.work.personaldata.showpersonaldata_wsd.showPersonalDataResponse();
		
	}
	
	
	/**
	 * Method parameters bean
	 */
	public class Parameters  implements java.io.Serializable {

		private static final long serialVersionUID = 7912853974515799040L;

		public Parameters() {
		}
	
		private com.webmethods.caf.is.wsclient.campusconnect.work.personaldata.showpersonaldata_wsd.showPersonalData showPersonalData  = new  com.webmethods.caf.is.wsclient.campusconnect.work.personaldata.showpersonaldata_wsd.showPersonalData() ;

		public com.webmethods.caf.is.wsclient.campusconnect.work.personaldata.showpersonaldata_wsd.showPersonalData getShowPersonalData() {
			return showPersonalData;
		}

		public void setShowPersonalData(com.webmethods.caf.is.wsclient.campusconnect.work.personaldata.showpersonaldata_wsd.showPersonalData showPersonalData) {
			this.showPersonalData = showPersonalData;
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
	public com.webmethods.caf.is.wsclient.campusconnect.work.personaldata.showpersonaldata_wsd.showPersonalDataResponse getResult() {
		return (com.webmethods.caf.is.wsclient.campusconnect.work.personaldata.showpersonaldata_wsd.showPersonalDataResponse)result;
	}
	

		
}