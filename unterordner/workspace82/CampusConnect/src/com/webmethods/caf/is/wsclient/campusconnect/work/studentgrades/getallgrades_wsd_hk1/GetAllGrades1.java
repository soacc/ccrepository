package com.webmethods.caf.is.wsclient.campusconnect.work.studentgrades.getallgrades_wsd_hk1;


import com.webmethods.caf.faces.data.ws.glue.GlueWSClientContentProvider;

/**
 * Glue Web Service Client bean generated for 
 * com.webmethods.caf.is.wsclient.campusconnect.work.studentgrades.getallgrades_wsd_hk1.IgetAllGrades_WSD_HK1_PortType.getAllGrades.
 */
public class GetAllGrades1 extends GlueWSClientContentProvider {

	private static final long serialVersionUID = 1792193602514284544L;

	/**
	 * Default constructor
	 */
	public GetAllGrades1() {
		super(com.webmethods.caf.is.wsclient.campusconnect.work.studentgrades.getallgrades_wsd_hk1.IgetAllGrades_WSD_HK1_PortType.class, // port type proxy class
			"getAllGrades", // method to invoke
			new String[] { "getAllGrades", }, // method parameter names
			new Class[] { com.webmethods.caf.is.wsclient.campusconnect.work.studentgrades.getallgrades_wsd_hk1.getAllGrades.class, } // method parameter types
		);
		// wsdl and maps by are saved in the same package
		setWsdlUrl("classpath:getAllGrades_WSD_HK1.wsdl");
		setMapUrls(new String[] { "classpath:getAllGrades_WSD_HK1.map", });

		// init wsclient
		initParams();
		
		// parameters bean
		parameters = new Parameters();
		
	}
	
	
	/**
	 * Method parameters bean
	 */
	public class Parameters  implements java.io.Serializable {

		private static final long serialVersionUID = 8771551722687276032L;

		public Parameters() {
		}
	
		private com.webmethods.caf.is.wsclient.campusconnect.work.studentgrades.getallgrades_wsd_hk1.getAllGrades getAllGrades  = new  com.webmethods.caf.is.wsclient.campusconnect.work.studentgrades.getallgrades_wsd_hk1.getAllGrades() ;

		public com.webmethods.caf.is.wsclient.campusconnect.work.studentgrades.getallgrades_wsd_hk1.getAllGrades getGetAllGrades() {
			return getAllGrades;
		}

		public void setGetAllGrades(com.webmethods.caf.is.wsclient.campusconnect.work.studentgrades.getallgrades_wsd_hk1.getAllGrades getAllGrades) {
			this.getAllGrades = getAllGrades;
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
	public com.webmethods.caf.is.wsclient.campusconnect.work.studentgrades.getallgrades_wsd_hk1.outputGrades[] getResult() {
		return (com.webmethods.caf.is.wsclient.campusconnect.work.studentgrades.getallgrades_wsd_hk1.outputGrades[])result;
	}
	

		
}