/**
 * 
 */
package com.webmethods.caf.showenrolledstudents;

/**
 * @author wir09cdz
 *
 */

import javax.portlet.PortletPreferences;

public class ShowEnrolledStudents  extends   com.webmethods.caf.faces.bean.BaseFacesPreferencesBean {

	private com.webmethods.caf.CampusConnect campusConnect = null;
	private com.webmethods.caf.is.wsclient.campusconnect.work.enrollment.showenrolledstuds_wsd.ShowEnrolledStuds2 showEnrolledStuds2 = null;
	private static final String[][] SHOWENROLLEDSTUDS2_PROPERTY_BINDINGS = new String[][] {
		{"#{ShowEnrolledStuds2.authCredentials.authenticationMethod}", "1"},
		{"#{ShowEnrolledStuds2.authCredentials.requiresAuth}", "true"},
		{"#{ShowEnrolledStuds2.autoRefresh}", "true"},
	};
	private static final String[][] SETSTUDID_PROPERTY_BINDINGS = new String[][] {
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
	public ShowEnrolledStudents() {
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

	public com.webmethods.caf.is.wsclient.campusconnect.work.enrollment.showenrolledstuds_wsd.ShowEnrolledStuds2 getShowEnrolledStuds2()  {
		if (showEnrolledStuds2 == null) {
		    showEnrolledStuds2 = (com.webmethods.caf.is.wsclient.campusconnect.work.enrollment.showenrolledstuds_wsd.ShowEnrolledStuds2)resolveExpression("#{ShowEnrolledStuds2}");
		}
	
	    resolveDataBinding(SHOWENROLLEDSTUDS2_PROPERTY_BINDINGS, showEnrolledStuds2, "showEnrolledStuds2", false, false);
		return showEnrolledStuds2;
	}

	public String setStudId() {
	    resolveDataBinding(SETSTUDID_PROPERTY_BINDINGS, this, "setStudId.this", true, false);
		return OUTCOME_OK;
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