/**
 * 
 */
package com.webmethods.caf.lf030_setstudactive;

/**
 * @author wir09cdz
 *
 */

import javax.portlet.PortletPreferences;

public class Lf030_setstudactive  extends   com.webmethods.caf.faces.bean.BaseFacesPreferencesBean {

	private com.webmethods.caf.CampusConnect campusConnect = null;
	private com.webmethods.caf.is.wsclient.campusconnect.work.enrolment.setstudactive_wsd.SetStudActive1 setStudActive = null;
	private static final String[][] SETSTUDACTIVE_PROPERTY_BINDINGS = new String[][] {
		{"#{SetStudActive.authCredentials.authenticationMethod}", "1"},
		{"#{SetStudActive.authCredentials.requiresAuth}", "true"},
		{"#{SetStudActive.autoRefresh}", "true"},
	};
	/**
	 * List of portlet preference names
	 */
	public static final String[] PREFERENCES_NAMES = new String[] {
		"StudID"
	};
	/**
	 * Create new preferences bean with list of preference names
	 */
	public Lf030_setstudactive() {
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

	public com.webmethods.caf.is.wsclient.campusconnect.work.enrolment.setstudactive_wsd.SetStudActive1 getSetStudActive()  {
		if (setStudActive == null) {
		    setStudActive = (com.webmethods.caf.is.wsclient.campusconnect.work.enrolment.setstudactive_wsd.SetStudActive1)resolveExpression("#{SetStudActive}");
		}
	
	    resolveDataBinding(SETSTUDACTIVE_PROPERTY_BINDINGS, setStudActive, "setStudActive", false, false);
		return setStudActive;
	}

	/**
	 * The algorithm for this 'smart' preference getter is:
	 * 1) Check the Request Map (skip this step if it isn't a 'smart' preference)
	 * 2) Check the Member variable
	 * 3) Fall back to the PortletPreferences
	 */
	public String getStudID() throws Exception {
		return (String) getPreferenceValue("StudID", String.class);
	}

	/**
	 * Invoke {@link #storePreferences} to persist these changes
	 */
	public void setStudID(String studID) throws Exception {
		setPreferenceValue("StudID", studID);
	}
}