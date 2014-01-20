/**
 * 
 */
package com.webmethods.caf.lf090_showregisteredstudentsexam;

/**
 * @author wir09cdz
 *
 */

import javax.portlet.PortletPreferences;

public class Lf090_showregisteredstudentsexam  extends   com.webmethods.caf.faces.bean.BaseFacesPreferencesBean {

	public static final String[] PREFERENCES_NAMES = new String[] {};
	private com.webmethods.caf.CampusConnect campusConnect = null;
	private com.webmethods.caf.is.wsclient.campusconnect.work.gradesubmission.showregisteredstudentsexam_wsd_hk1.ShowRegisteredStudentsExam1 showRegisteredStudentsExam = null;
	private static final String[][] SHOWREGISTEREDSTUDENTSEXAM_PROPERTY_BINDINGS = new String[][] {
		{"#{ShowRegisteredStudentsExam.authCredentials.authenticationMethod}", "1"},
		{"#{ShowRegisteredStudentsExam.authCredentials.requiresAuth}", "true"},
		{"#{ShowRegisteredStudentsExam.autoRefresh}", "true"},
	};
	/**
	 * Create new preferences bean with list of preference names
	 */
	public Lf090_showregisteredstudentsexam() {
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

	public com.webmethods.caf.is.wsclient.campusconnect.work.gradesubmission.showregisteredstudentsexam_wsd_hk1.ShowRegisteredStudentsExam1 getShowRegisteredStudentsExam()  {
		if (showRegisteredStudentsExam == null) {
		    showRegisteredStudentsExam = (com.webmethods.caf.is.wsclient.campusconnect.work.gradesubmission.showregisteredstudentsexam_wsd_hk1.ShowRegisteredStudentsExam1)resolveExpression("#{ShowRegisteredStudentsExam}");
		}
	
	    resolveDataBinding(SHOWREGISTEREDSTUDENTSEXAM_PROPERTY_BINDINGS, showRegisteredStudentsExam, "showRegisteredStudentsExam", false, false);
		return showRegisteredStudentsExam;
	}
}