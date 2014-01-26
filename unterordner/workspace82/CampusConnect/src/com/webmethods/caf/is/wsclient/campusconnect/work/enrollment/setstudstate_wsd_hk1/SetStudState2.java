package com.webmethods.caf.is.wsclient.campusconnect.work.enrollment.setstudstate_wsd_hk1;


import com.webmethods.caf.faces.data.ws.glue.GlueWSClientContentProvider;

/**
 * Glue Web Service Client bean generated for 
 * com.webmethods.caf.is.wsclient.campusconnect.work.enrollment.setstudstate_wsd_hk1.IsetStudState_WSD_HK1_PortType.setStudState.
 */
public class SetStudState2 extends GlueWSClientContentProvider {

	private static final long serialVersionUID = 5768443071173270528L;

	/**
	 * Default constructor
	 */
	public SetStudState2() {
		super(com.webmethods.caf.is.wsclient.campusconnect.work.enrollment.setstudstate_wsd_hk1.IsetStudState_WSD_HK1_PortType.class, // port type proxy class
			"setStudState", // method to invoke
			new String[] { "setStudState", }, // method parameter names
			new Class[] { com.webmethods.caf.is.wsclient.campusconnect.work.enrollment.setstudstate_wsd_hk1.setStudState.class, } // method parameter types
		);
		// wsdl and maps by are saved in the same package
		setWsdlUrl("classpath:setStudState_WSD_HK1.wsdl");
		setMapUrls(new String[] { "classpath:setStudState_WSD_HK1.map", });

		// init wsclient
		initParams();
		
		// parameters bean
		parameters = new Parameters();
		
		// complex output, just a place holder
		result = new com.webmethods.caf.is.wsclient.campusconnect.work.enrollment.setstudstate_wsd_hk1.setStudStateResponse();
		
	}
	
	
	/**
	 * Method parameters bean
	 */
	public class Parameters  implements java.io.Serializable {

		private static final long serialVersionUID = 8036596537130288128L;

		public Parameters() {
		}
	
		private com.webmethods.caf.is.wsclient.campusconnect.work.enrollment.setstudstate_wsd_hk1.setStudState setStudState  = new  com.webmethods.caf.is.wsclient.campusconnect.work.enrollment.setstudstate_wsd_hk1.setStudState() ;

		public com.webmethods.caf.is.wsclient.campusconnect.work.enrollment.setstudstate_wsd_hk1.setStudState getSetStudState() {
			return setStudState;
		}

		public void setSetStudState(com.webmethods.caf.is.wsclient.campusconnect.work.enrollment.setstudstate_wsd_hk1.setStudState setStudState) {
			this.setStudState = setStudState;
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
	public com.webmethods.caf.is.wsclient.campusconnect.work.enrollment.setstudstate_wsd_hk1.setStudStateResponse getResult() {
		return (com.webmethods.caf.is.wsclient.campusconnect.work.enrollment.setstudstate_wsd_hk1.setStudStateResponse)result;
	}
	

		
}