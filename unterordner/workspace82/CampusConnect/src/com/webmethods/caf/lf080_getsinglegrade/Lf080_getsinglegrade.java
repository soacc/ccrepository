/**
 * 
 */
package com.webmethods.caf.lf080_getsinglegrade;

/**
 * @author wir09cdz
 *
 */

import javax.portlet.PortletPreferences;

public class Lf080_getsinglegrade  extends   com.webmethods.caf.faces.bean.BaseFacesPreferencesBean {

	private com.webmethods.caf.CampusConnect campusConnect = null;
	private com.webmethods.caf.is.wsclient.campusconnect.work.studentgrades.getsinglegrade_wsd_hk1.GetSingleGrade1 getSingleGrade = null;
	/**
	 * List of portlet preference names
	 */
	public static final String[] PREFERENCES_NAMES = new String[] {
		"StudID", "CourseID"
	};
	private static final String[][] GETSINGLEGRADE_PROPERTY_BINDINGS = new String[][] {
		{"#{getSingleGrade.authCredentials.authenticationMethod}", "1"},
		{"#{getSingleGrade.authCredentials.requiresAuth}", "true"},
		{"#{getSingleGrade.autoRefresh}", "true"},
		{"#{getSingleGrade.parameters.getSingleGrade.studId}", "#{Lf080_getsinglegradedefaultviewview.lf080_getsinglegrade.studID}"},
		{"#{getSingleGrade.parameters.getSingleGrade.courseId}", "#{Lf080_getsinglegradedefaultviewview.lf080_getsinglegrade.courseID}"},
	};
	/**
	 * Create new preferences bean with list of preference names
	 */
	public Lf080_getsinglegrade() {
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

	public com.webmethods.caf.is.wsclient.campusconnect.work.studentgrades.getsinglegrade_wsd_hk1.GetSingleGrade1 getGetSingleGrade()  {
		if (getSingleGrade == null) {
		    getSingleGrade = (com.webmethods.caf.is.wsclient.campusconnect.work.studentgrades.getsinglegrade_wsd_hk1.GetSingleGrade1)resolveExpression("#{GetSingleGrade}");
		}
	
	    resolveDataBinding(GETSINGLEGRADE_PROPERTY_BINDINGS, getSingleGrade, "getSingleGrade", false, false);
		return getSingleGrade;
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
	public String getCourseID() throws Exception {
		return (String) getPreferenceValue("CourseID", String.class);
	}

	/**
	 * Invoke {@link #storePreferences} to persist these changes
	 */
	public void setCourseID(String courseID) throws Exception {
		setPreferenceValue("CourseID", courseID);
	}
}