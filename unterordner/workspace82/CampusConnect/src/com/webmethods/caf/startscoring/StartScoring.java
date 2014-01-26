/**
 * 
 */
package com.webmethods.caf.startscoring;

/**
 * @author wir09cdz
 *
 */

import javax.portlet.PortletPreferences;

public class StartScoring  extends   com.webmethods.caf.faces.bean.BaseFacesPreferencesBean {

	public static final String[] PREFERENCES_NAMES = new String[] {};
	private com.webmethods.caf.CampusConnect campusConnect = null;
	private com.webmethods.caf.is.wsclient.campusconnect.work.enrollment.startscoring_wsd_hk1.StartScoring2 startScoring2 = null;
	private static final String[][] STARTSCORING2_PROPERTY_BINDINGS = new String[][] {
		{"#{startScoring2.authCredentials.authenticationMethod}", "1"},
		{"#{startScoring2.authCredentials.requiresAuth}", "true"},
		{"#{startScoring2.autoRefresh}", "false"},
	};
	/**
	 * Create new preferences bean with list of preference names
	 */
	public StartScoring() {
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

	public com.webmethods.caf.is.wsclient.campusconnect.work.enrollment.startscoring_wsd_hk1.StartScoring2 getStartScoring2()  {
		if (startScoring2 == null) {
		    startScoring2 = (com.webmethods.caf.is.wsclient.campusconnect.work.enrollment.startscoring_wsd_hk1.StartScoring2)resolveExpression("#{StartScoring2}");
		}
	
	    resolveDataBinding(STARTSCORING2_PROPERTY_BINDINGS, startScoring2, "startScoring2", false, false);
		return startScoring2;
	}
}