package com.webmethods.caf.is.wsclient.campusconnect.work.enrollment.startscoring_wsd_hk1;


import com.webmethods.caf.faces.data.ws.glue.GlueWSClientContentProvider;

/**
 * Glue Web Service Client bean generated for 
 * com.webmethods.caf.is.wsclient.campusconnect.work.enrollment.startscoring_wsd_hk1.IstartScoring_WSD_HK1_PortType.startScoring.
 */
public class StartScoring2 extends GlueWSClientContentProvider {

	private static final long serialVersionUID = 2807745299153551360L;

	/**
	 * Default constructor
	 */
	public StartScoring2() {
		super(com.webmethods.caf.is.wsclient.campusconnect.work.enrollment.startscoring_wsd_hk1.IstartScoring_WSD_HK1_PortType.class, // port type proxy class
			"startScoring", // method to invoke
			new String[] { "startScoring",  "result", }, // method parameter names
			new Class[] { com.webmethods.caf.is.wsclient.campusconnect.work.enrollment.startscoring_wsd_hk1.startScoring.class,  electric.util.async.Async.class, } // method parameter types
		);
		// wsdl and maps by are saved in the same package
		setWsdlUrl("classpath:startScoring_WSD_HK1.wsdl");
		setMapUrls(new String[] { "classpath:startScoring_WSD_HK1.map", });

		// init wsclient
		initParams();
		
		// parameters bean
		parameters = new Parameters();
		
	}
	
	
	/**
	 * Method parameters bean
	 */
	public class Parameters  implements java.io.Serializable {

		private static final long serialVersionUID = 6261219566985974784L;

		public Parameters() {
		}
	
		private com.webmethods.caf.is.wsclient.campusconnect.work.enrollment.startscoring_wsd_hk1.startScoring startScoring  = new  com.webmethods.caf.is.wsclient.campusconnect.work.enrollment.startscoring_wsd_hk1.startScoring() ;

		public com.webmethods.caf.is.wsclient.campusconnect.work.enrollment.startscoring_wsd_hk1.startScoring getStartScoring() {
			return startScoring;
		}

		public void setStartScoring(com.webmethods.caf.is.wsclient.campusconnect.work.enrollment.startscoring_wsd_hk1.startScoring startScoring) {
			this.startScoring = startScoring;
		} 	
		
	}
	
	
	
	/**
	 * Return method invocation parameters bean
	 */
	public Parameters getParameters() {
		return (Parameters)parameters;
	}	
	


	

		
}