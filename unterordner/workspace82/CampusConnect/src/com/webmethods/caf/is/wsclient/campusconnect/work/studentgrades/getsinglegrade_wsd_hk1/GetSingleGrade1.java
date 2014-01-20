package com.webmethods.caf.is.wsclient.campusconnect.work.studentgrades.getsinglegrade_wsd_hk1;


import com.webmethods.caf.faces.data.ws.glue.GlueWSClientContentProvider;

/**
 * Glue Web Service Client bean generated for 
 * com.webmethods.caf.is.wsclient.campusconnect.work.studentgrades.getsinglegrade_wsd_hk1.IgetSingleGrade_WSD_HK1_PortType.getSingleGrade.
 */
public class GetSingleGrade1 extends GlueWSClientContentProvider {

	private static final long serialVersionUID = 1340413495803418624L;

	/**
	 * Default constructor
	 */
	public GetSingleGrade1() {
		super(com.webmethods.caf.is.wsclient.campusconnect.work.studentgrades.getsinglegrade_wsd_hk1.IgetSingleGrade_WSD_HK1_PortType.class, // port type proxy class
			"getSingleGrade", // method to invoke
			new String[] { "getSingleGrade", }, // method parameter names
			new Class[] { com.webmethods.caf.is.wsclient.campusconnect.work.studentgrades.getsinglegrade_wsd_hk1.getSingleGrade.class, } // method parameter types
		);
		// wsdl and maps by are saved in the same package
		setWsdlUrl("classpath:getSingleGrade_WSD_HK1.wsdl");
		setMapUrls(new String[] { "classpath:getSingleGrade_WSD_HK1.map", });

		// init wsclient
		initParams();
		
		// parameters bean
		parameters = new Parameters();
		
		// complex output, just a place holder
		result = new com.webmethods.caf.is.wsclient.campusconnect.work.studentgrades.getsinglegrade_wsd_hk1.getSingleGradeResponse();
		
	}
	
	
	/**
	 * Method parameters bean
	 */
	public class Parameters  implements java.io.Serializable {

		private static final long serialVersionUID = 8680521905452332032L;

		public Parameters() {
		}
	
		private com.webmethods.caf.is.wsclient.campusconnect.work.studentgrades.getsinglegrade_wsd_hk1.getSingleGrade getSingleGrade  = new  com.webmethods.caf.is.wsclient.campusconnect.work.studentgrades.getsinglegrade_wsd_hk1.getSingleGrade() ;

		public com.webmethods.caf.is.wsclient.campusconnect.work.studentgrades.getsinglegrade_wsd_hk1.getSingleGrade getGetSingleGrade() {
			return getSingleGrade;
		}

		public void setGetSingleGrade(com.webmethods.caf.is.wsclient.campusconnect.work.studentgrades.getsinglegrade_wsd_hk1.getSingleGrade getSingleGrade) {
			this.getSingleGrade = getSingleGrade;
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
	public com.webmethods.caf.is.wsclient.campusconnect.work.studentgrades.getsinglegrade_wsd_hk1.getSingleGradeResponse getResult() {
		return (com.webmethods.caf.is.wsclient.campusconnect.work.studentgrades.getsinglegrade_wsd_hk1.getSingleGradeResponse)result;
	}
	

		
}