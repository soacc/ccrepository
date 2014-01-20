/**
 * 
 */
package com.webmethods.caf.lf070_showpersonaldatastud;

/**
 * @author wir09cdz
 *
 */

import javax.portlet.PortletPreferences;

public class Lf070_showpersonaldatastud  extends   com.webmethods.caf.faces.bean.BaseFacesPreferencesBean {

	private com.webmethods.caf.CampusConnect campusConnect = null;
	private com.webmethods.caf.is.wsclient.campusconnect.work.editpersonaldatastud.showpersonaldatastud_wsd.ShowPersonalDataStud1 showPersonalDataStud = null;
	/**
	 * List of portlet preference names
	 */
	public static final String[] PREFERENCES_NAMES = new String[] {
		"StudID"
	};
	private static final String[][] SHOWPERSONALDATASTUD_PROPERTY_BINDINGS = new String[][] {
		{"#{showPersonalDataStud.authCredentials.authenticationMethod}", "1"},
		{"#{showPersonalDataStud.authCredentials.requiresAuth}", "true"},
		{"#{showPersonalDataStud.autoRefresh}", "true"},
		{"#{showPersonalDataStud.parameters.showPersonalDataStud.studId}", "#{Lf070_showpersonaldatastuddefaultviewview.lf070_showpersonaldatastud.studID}"},
	};
	/**
	 * Create new preferences bean with list of preference names
	 */
	public Lf070_showpersonaldatastud() {
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

	public com.webmethods.caf.is.wsclient.campusconnect.work.editpersonaldatastud.showpersonaldatastud_wsd.ShowPersonalDataStud1 getShowPersonalDataStud()  {
		if (showPersonalDataStud == null) {
		    showPersonalDataStud = (com.webmethods.caf.is.wsclient.campusconnect.work.editpersonaldatastud.showpersonaldatastud_wsd.ShowPersonalDataStud1)resolveExpression("#{ShowPersonalDataStud}");
		}
	
	    resolveDataBinding(SHOWPERSONALDATASTUD_PROPERTY_BINDINGS, showPersonalDataStud, "showPersonalDataStud", false, false);
		return showPersonalDataStud;
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