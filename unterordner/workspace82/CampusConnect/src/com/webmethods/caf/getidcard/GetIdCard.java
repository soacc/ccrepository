/**
 * 
 */
package com.webmethods.caf.getidcard;

/**
 * @author wir09cdz
 *
 */

import javax.portlet.PortletPreferences;

public class GetIdCard  extends   com.webmethods.caf.faces.bean.BaseFacesPreferencesBean {

	public static final String[] PREFERENCES_NAMES = new String[] {};
	private com.webmethods.caf.CampusConnect campusConnect = null;
	private com.webmethods.caf.is.wsclient.campusconnect.work.enrollment.getidcard_wsd_hk1.GetIdCard2 getIdCard2 = null;
	private static final String[][] GETIDCARD2_PROPERTY_BINDINGS = new String[][] {
		{"#{GetIdCard2.authCredentials.authenticationMethod}", "1"},
		{"#{GetIdCard2.authCredentials.requiresAuth}", "true"},
		{"#{GetIdCard2.autoRefresh}", "true"},
	};
	/**
	 * Create new preferences bean with list of preference names
	 */
	public GetIdCard() {
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

	public com.webmethods.caf.CampusConnect getCampusConnect()  {
		if (campusConnect == null) {
		    campusConnect = (com.webmethods.caf.CampusConnect)resolveExpression("#{CampusConnect}");
		}
		return campusConnect;
	}

	public com.webmethods.caf.is.wsclient.campusconnect.work.enrollment.getidcard_wsd_hk1.GetIdCard2 getGetIdCard2()  {
		if (getIdCard2 == null) {
		    getIdCard2 = (com.webmethods.caf.is.wsclient.campusconnect.work.enrollment.getidcard_wsd_hk1.GetIdCard2)resolveExpression("#{GetIdCard2}");
		}
	
	    resolveDataBinding(GETIDCARD2_PROPERTY_BINDINGS, getIdCard2, "getIdCard2", false, false);
		return getIdCard2;
	}
}