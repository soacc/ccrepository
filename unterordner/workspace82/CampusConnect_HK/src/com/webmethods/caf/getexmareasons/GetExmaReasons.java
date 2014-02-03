/**
 * 
 */
package com.webmethods.caf.getexmareasons;

/**
 * @author wir09cdz
 *
 */

import javax.portlet.PortletPreferences;

public class GetExmaReasons  extends   com.webmethods.caf.faces.bean.BaseFacesPreferencesBean {

	public static final String[] PREFERENCES_NAMES = new String[] {};
	private com.webmethods.caf.CampusConnect_HK campusConnect_HK = null;
	private com.webmethods.caf.is.wsclient.campusconnect.work.administration.getexmareasons_wsd_mw1.GetExmaReasons2 getExmaReasons2 = null;
	private static final String[][] GETEXMAREASONS2_PROPERTY_BINDINGS = new String[][] {
		{"#{GetExmaReasons2.authCredentials.authenticationMethod}", "1"},
		{"#{GetExmaReasons2.authCredentials.requiresAuth}", "true"},
		{"#{GetExmaReasons2.autoRefresh}", "true"},
	};
	/**
	 * Create new preferences bean with list of preference names
	 */
	public GetExmaReasons() {
		super(PREFERENCES_NAMES);
	}
	
	/**
	 * Call this method in order to persist
	 * Portlet preferences
	 */
	public void storePreferences() throws Exception {
		updatePreferences();
		PortletPreferences preferences = getPreferences();
		preferences.store();
	}

	public com.webmethods.caf.CampusConnect_HK getCampusConnect_HK()  {
		if (campusConnect_HK == null) {
		    campusConnect_HK = (com.webmethods.caf.CampusConnect_HK)resolveExpression("#{CampusConnect_HK}");
		}
		return campusConnect_HK;
	}

	public com.webmethods.caf.is.wsclient.campusconnect.work.administration.getexmareasons_wsd_mw1.GetExmaReasons2 getGetExmaReasons2()  {
		if (getExmaReasons2 == null) {
		    getExmaReasons2 = (com.webmethods.caf.is.wsclient.campusconnect.work.administration.getexmareasons_wsd_mw1.GetExmaReasons2)resolveExpression("#{GetExmaReasons2}");
		}
	
	    resolveDataBinding(GETEXMAREASONS2_PROPERTY_BINDINGS, getExmaReasons2, "getExmaReasons2", false, false);
		return getExmaReasons2;
	}
}