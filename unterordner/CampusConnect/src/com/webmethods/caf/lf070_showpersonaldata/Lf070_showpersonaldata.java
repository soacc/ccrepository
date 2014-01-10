/**
 * 
 */
package com.webmethods.caf.lf070_showpersonaldata;

/**
 * @author wir09cdz
 *
 */

import javax.portlet.PortletPreferences;

public class Lf070_showpersonaldata  extends   com.webmethods.caf.faces.bean.BaseFacesPreferencesBean {

	private com.webmethods.caf.CampusConnect campusConnect = null;
	private com.webmethods.caf.is.wsclient.campusconnect.work.personaldata.showpersonaldata_wsd.ShowPersonalData1 showPersonalData = null;
	private static final String[][] SHOWPERSONALDATA_PROPERTY_BINDINGS = new String[][] {
		{"#{showPersonalData.authCredentials.authenticationMethod}", "1"},
		{"#{showPersonalData.authCredentials.requiresAuth}", "true"},
		{"#{showPersonalData.autoRefresh}", "true"},
		{"#{showPersonalData.parameters.showPersonalData.studentId}", "#{Lf070_showpersonaldatadefaultviewview.lf070_showpersonaldata.studID}"},
	};
	/**
	 * List of portlet preference names
	 */
	public static final String[] PREFERENCES_NAMES = new String[] {
		"StudID", "output"
	};
	/**
	 * Create new preferences bean with list of preference names
	 */
	public Lf070_showpersonaldata() {
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

	public com.webmethods.caf.is.wsclient.campusconnect.work.personaldata.showpersonaldata_wsd.ShowPersonalData1 getShowPersonalData()  {
		if (showPersonalData == null) {
		    showPersonalData = (com.webmethods.caf.is.wsclient.campusconnect.work.personaldata.showpersonaldata_wsd.ShowPersonalData1)resolveExpression("#{ShowPersonalData}");
		}
	
	    resolveDataBinding(SHOWPERSONALDATA_PROPERTY_BINDINGS, showPersonalData, "showPersonalData", false, false);
		return showPersonalData;
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

	/**
	 * The algorithm for this 'smart' preference getter is:
	 * 1) Check the Request Map (skip this step if it isn't a 'smart' preference)
	 * 2) Check the Member variable
	 * 3) Fall back to the PortletPreferences
	 */
	public String getOutput() throws Exception {
		return (String) getPreferenceValue("output", String.class);
	}

	/**
	 * Invoke {@link #storePreferences} to persist these changes
	 */
	public void setOutput(String output) throws Exception {
		setPreferenceValue("output", output);
	}
}