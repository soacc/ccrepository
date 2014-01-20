/**
 * 
 */
package com.webmethods.caf.lf070_showpersonaldataprof;

/**
 * @author wir09cdz
 *
 */

import javax.portlet.PortletPreferences;

public class Lf070_showpersonaldataprof  extends   com.webmethods.caf.faces.bean.BaseFacesPreferencesBean {

	private com.webmethods.caf.CampusConnect campusConnect = null;
	private com.webmethods.caf.is.wsclient.campusconnect.work.editpersonaldataprof.showpersonaldateprof_wsd.ShowPersonalDataProf1 showPersonalDataProf = null;
	/**
	 * List of portlet preference names
	 */
	public static final String[] PREFERENCES_NAMES = new String[] {
		"ProfID"
	};
	private static final String[][] SHOWPERSONALDATAPROF_PROPERTY_BINDINGS = new String[][] {
		{"#{showPersonalDataProf.authCredentials.authenticationMethod}", "1"},
		{"#{showPersonalDataProf.authCredentials.requiresAuth}", "true"},
		{"#{showPersonalDataProf.autoRefresh}", "true"},
		{"#{showPersonalDataProf.parameters.showPersonalDataProf.profId}", "#{Lf070_showpersonaldataprofdefaultviewview.lf070_showpersonaldataprof.profID}"},
	};
	/**
	 * Create new preferences bean with list of preference names
	 */
	public Lf070_showpersonaldataprof() {
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

	public com.webmethods.caf.is.wsclient.campusconnect.work.editpersonaldataprof.showpersonaldateprof_wsd.ShowPersonalDataProf1 getShowPersonalDataProf()  {
		if (showPersonalDataProf == null) {
		    showPersonalDataProf = (com.webmethods.caf.is.wsclient.campusconnect.work.editpersonaldataprof.showpersonaldateprof_wsd.ShowPersonalDataProf1)resolveExpression("#{ShowPersonalDataProf}");
		}
	
	    resolveDataBinding(SHOWPERSONALDATAPROF_PROPERTY_BINDINGS, showPersonalDataProf, "showPersonalDataProf", false, false);
		return showPersonalDataProf;
	}

	/**
	 * The algorithm for this 'smart' preference getter is:
	 * 1) Check the Request Map (skip this step if it isn't a 'smart' preference)
	 * 2) Check the Member variable
	 * 3) Fall back to the PortletPreferences
	 */
	public String getProfID() throws Exception {
		return (String) getPreferenceValue("ProfID", String.class);
	}

	/**
	 * Invoke {@link #storePreferences} to persist these changes
	 */
	public void setProfID(String profID) throws Exception {
		setPreferenceValue("ProfID", profID);
	}
}