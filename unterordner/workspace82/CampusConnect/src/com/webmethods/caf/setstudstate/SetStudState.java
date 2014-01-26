/**
 * 
 */
package com.webmethods.caf.setstudstate;

/**
 * @author wir09cdz
 *
 */

import javax.portlet.PortletPreferences;

public class SetStudState  extends   com.webmethods.caf.faces.bean.BaseFacesPreferencesBean {

	public static final String[] PREFERENCES_NAMES = new String[] {};
	private com.webmethods.caf.CampusConnect campusConnect = null;
	private com.webmethods.caf.is.wsclient.campusconnect.work.enrollment.setstudstate_wsd_hk1.SetStudState2 setStudState2 = null;
	private static final String[][] SETSTUDSTATE2_PROPERTY_BINDINGS = new String[][] {
		{"#{setStudState2.authCredentials.authenticationMethod}", "1"},
		{"#{setStudState2.authCredentials.requiresAuth}", "true"},
		{"#{setStudState2.autoRefresh}", "false"},
	};
	/**
	 * Create new preferences bean with list of preference names
	 */
	public SetStudState() {
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

	public com.webmethods.caf.is.wsclient.campusconnect.work.enrollment.setstudstate_wsd_hk1.SetStudState2 getSetStudState2()  {
		if (setStudState2 == null) {
		    setStudState2 = (com.webmethods.caf.is.wsclient.campusconnect.work.enrollment.setstudstate_wsd_hk1.SetStudState2)resolveExpression("#{SetStudState2}");
		}
	
	    resolveDataBinding(SETSTUDSTATE2_PROPERTY_BINDINGS, setStudState2, "setStudState2", false, false);
		return setStudState2;
	}
}