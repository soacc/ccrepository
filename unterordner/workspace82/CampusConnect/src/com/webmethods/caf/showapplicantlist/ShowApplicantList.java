/**
 * 
 */
package com.webmethods.caf.showapplicantlist;

/**
 * @author wir09cdz
 *
 */

import javax.portlet.PortletPreferences;

public class ShowApplicantList  extends   com.webmethods.caf.faces.bean.BaseFacesPreferencesBean {

	public static final String[] PREFERENCES_NAMES = new String[] {};
	private com.webmethods.caf.CampusConnect campusConnect = null;
	private com.webmethods.caf.is.wsclient.campusconnect.work.enrollment.showapplicantlist_wsd_hk1.ShowApplicantsList1 showApplicantsList = null;
	private static final String[][] SHOWAPPLICANTSLIST_PROPERTY_BINDINGS = new String[][] {
		{"#{ShowApplicantsList.authCredentials.authenticationMethod}", "1"},
		{"#{ShowApplicantsList.authCredentials.requiresAuth}", "true"},
		{"#{ShowApplicantsList.autoRefresh}", "true"},
	};
	/**
	 * Create new preferences bean with list of preference names
	 */
	public ShowApplicantList() {
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

	public com.webmethods.caf.is.wsclient.campusconnect.work.enrollment.showapplicantlist_wsd_hk1.ShowApplicantsList1 getShowApplicantsList()  {
		if (showApplicantsList == null) {
		    showApplicantsList = (com.webmethods.caf.is.wsclient.campusconnect.work.enrollment.showapplicantlist_wsd_hk1.ShowApplicantsList1)resolveExpression("#{ShowApplicantsList}");
		}
	
	    resolveDataBinding(SHOWAPPLICANTSLIST_PROPERTY_BINDINGS, showApplicantsList, "showApplicantsList", false, false);
		return showApplicantsList;
	}
}