package com.webmethods.caf.is.wsclient.campusconnect.work.eating.showeating_wsd_hk1;


import com.webmethods.caf.faces.data.ws.glue.GlueWSClientContentProvider;

/**
 * Glue Web Service Client bean generated for 
 * com.webmethods.caf.is.wsclient.campusconnect.work.eating.showeating_wsd_hk1.IshowEating_WSD_HK1_PortType.showEating.
 */
public class ShowEating1 extends GlueWSClientContentProvider {

	private static final long serialVersionUID = 8107433942506981376L;

	/**
	 * Default constructor
	 */
	public ShowEating1() {
		super(com.webmethods.caf.is.wsclient.campusconnect.work.eating.showeating_wsd_hk1.IshowEating_WSD_HK1_PortType.class, // port type proxy class
			"showEating", // method to invoke
			new String[] { "showEating", }, // method parameter names
			new Class[] { com.webmethods.caf.is.wsclient.campusconnect.work.eating.showeating_wsd_hk1.showEating.class, } // method parameter types
		);
		// wsdl and maps by are saved in the same package
		setWsdlUrl("classpath:showEating_WSD_HK1.wsdl");
		setMapUrls(new String[] { "classpath:showEating_WSD_HK1.map", });

		// init wsclient
		initParams();
		
		// parameters bean
		parameters = new Parameters();
		
		// complex output, just a place holder
		result = new com.webmethods.caf.is.wsclient.campusconnect.work.eating.showeating_wsd_hk1.showEatingResponse();
		
	}
	
	
	/**
	 * Method parameters bean
	 */
	public class Parameters  implements java.io.Serializable {

		private static final long serialVersionUID = 2152332709036952576L;

		public Parameters() {
		}
	
		private com.webmethods.caf.is.wsclient.campusconnect.work.eating.showeating_wsd_hk1.showEating showEating  = new  com.webmethods.caf.is.wsclient.campusconnect.work.eating.showeating_wsd_hk1.showEating() ;

		public com.webmethods.caf.is.wsclient.campusconnect.work.eating.showeating_wsd_hk1.showEating getShowEating() {
			return showEating;
		}

		public void setShowEating(com.webmethods.caf.is.wsclient.campusconnect.work.eating.showeating_wsd_hk1.showEating showEating) {
			this.showEating = showEating;
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
	public com.webmethods.caf.is.wsclient.campusconnect.work.eating.showeating_wsd_hk1.showEatingResponse getResult() {
		return (com.webmethods.caf.is.wsclient.campusconnect.work.eating.showeating_wsd_hk1.showEatingResponse)result;
	}
	

		
}