/**
 * 
 */
package com.webmethods.caf.lf030_showenrolledstuds;

/**
 * @author wir09cdz
 *
 */

import javax.portlet.PortletPreferences;

public class Lf030_showenrolledstuds  extends   com.webmethods.caf.faces.bean.BaseFacesPreferencesBean {

	public static final String[] PREFERENCES_NAMES = new String[] {};
	private com.webmethods.caf.CampusConnect campusConnect = null;
	private com.webmethods.caf.is.wsclient.campusconnect.work.enrolment.showenrolledstuds_wsd.ShowEnrolledStuds1 showEnrolledStuds = null;
	private static final String[][] SHOWENROLLEDSTUDS_PROPERTY_BINDINGS = new String[][] {
		{"#{ShowEnrolledStuds.authCredentials.authenticationMethod}", "1"},
		{"#{ShowEnrolledStuds.authCredentials.requiresAuth}", "true"},
		{"#{ShowEnrolledStuds.autoRefresh}", "true"},
	};
	/**
	 * Create new preferences bean with list of preference names
	 */
	public Lf030_showenrolledstuds() {
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

	public com.webmethods.caf.is.wsclient.campusconnect.work.enrolment.showenrolledstuds_wsd.ShowEnrolledStuds1 getShowEnrolledStuds()  {
		if (showEnrolledStuds == null) {
		    showEnrolledStuds = (com.webmethods.caf.is.wsclient.campusconnect.work.enrolment.showenrolledstuds_wsd.ShowEnrolledStuds1)resolveExpression("#{ShowEnrolledStuds}");
		}
	
	    resolveDataBinding(SHOWENROLLEDSTUDS_PROPERTY_BINDINGS, showEnrolledStuds, "showEnrolledStuds", false, false);
		return showEnrolledStuds;
	}
}