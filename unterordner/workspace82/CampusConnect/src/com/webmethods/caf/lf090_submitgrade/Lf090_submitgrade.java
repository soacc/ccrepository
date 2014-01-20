/**
 * 
 */
package com.webmethods.caf.lf090_submitgrade;

/**
 * @author wir09cdz
 *
 */

import javax.portlet.PortletPreferences;

public class Lf090_submitgrade  extends   com.webmethods.caf.faces.bean.BaseFacesPreferencesBean {

	public static final String[] PREFERENCES_NAMES = new String[] {};
	private com.webmethods.caf.CampusConnect campusConnect = null;
	private com.webmethods.caf.is.wsclient.campusconnect.work.gradesubmission.submitgrade_wsd_hk1.SubmitGrade2 submitGrade2 = null;
	private static final String[][] SUBMITGRADE2_PROPERTY_BINDINGS = new String[][] {
		{"#{SubmitGrade2.authCredentials.authenticationMethod}", "1"},
		{"#{SubmitGrade2.authCredentials.requiresAuth}", "true"},
		{"#{SubmitGrade2.autoRefresh}", "true"},
	};
	/**
	 * Create new preferences bean with list of preference names
	 */
	public Lf090_submitgrade() {
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

	public com.webmethods.caf.is.wsclient.campusconnect.work.gradesubmission.submitgrade_wsd_hk1.SubmitGrade2 getSubmitGrade2()  {
		if (submitGrade2 == null) {
		    submitGrade2 = (com.webmethods.caf.is.wsclient.campusconnect.work.gradesubmission.submitgrade_wsd_hk1.SubmitGrade2)resolveExpression("#{SubmitGrade2}");
		}
	
	    resolveDataBinding(SUBMITGRADE2_PROPERTY_BINDINGS, submitGrade2, "submitGrade2", false, false);
		return submitGrade2;
	}
}