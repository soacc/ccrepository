/**
 * 
 */
package com.webmethods.caf.lf080_getallgrades;

/**
 * @author wir09cdz
 *
 */

import javax.portlet.PortletPreferences;

public class Lf080_getallgrades  extends   com.webmethods.caf.faces.bean.BaseFacesPreferencesBean {

	private com.webmethods.caf.CampusConnect campusConnect = null;
	private com.webmethods.caf.is.wsclient.campusconnect.work.studentgrades.getallgrades_wsd_hk1.GetAllGrades1 getAllGrades = null;
	/**
	 * List of portlet preference names
	 */
	public static final String[] PREFERENCES_NAMES = new String[] {
		"StudID"
	};
	private static final String[][] GETALLGRADES_PROPERTY_BINDINGS = new String[][] {
		{"#{getAllGrades.authCredentials.authenticationMethod}", "1"},
		{"#{getAllGrades.authCredentials.requiresAuth}", "true"},
		{"#{getAllGrades.autoRefresh}", "true"},
		{"#{getAllGrades.parameters.getAllGrades.studId}", "#{Lf080_getallgradesdefaultviewview.lf080_getallgrades.studID}"},
	};
	/**
	 * Create new preferences bean with list of preference names
	 */
	public Lf080_getallgrades() {
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

	public com.webmethods.caf.is.wsclient.campusconnect.work.studentgrades.getallgrades_wsd_hk1.GetAllGrades1 getGetAllGrades()  {
		if (getAllGrades == null) {
		    getAllGrades = (com.webmethods.caf.is.wsclient.campusconnect.work.studentgrades.getallgrades_wsd_hk1.GetAllGrades1)resolveExpression("#{GetAllGrades}");
		}
	
	    resolveDataBinding(GETALLGRADES_PROPERTY_BINDINGS, getAllGrades, "getAllGrades", false, false);
		return getAllGrades;
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