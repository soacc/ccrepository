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

	private com.webmethods.caf.CampusConnect campusConnect = null;
	private static final String[][] SHOWREGISTEREDSTUDENTSEXAM2_PROPERTY_BINDINGS = new String[][] {
		{"#{showRegisteredStudentsExam2.authCredentials.authenticationMethod}", "1"},
		{"#{showRegisteredStudentsExam2.authCredentials.requiresAuth}", "true"},
		{"#{showRegisteredStudentsExam2.autoRefresh}", "false"},
	};
	/**
	 * List of portlet preference names
	 */
	public static final String[] PREFERENCES_NAMES = new String[] {
		"CourseID", "StudID"
	};
	private com.webmethods.caf.is.wsclient.campusconnect.work.gradesubmission.submitgrade_wsd_hk2.SubmitGrade2 submitGrade2 = null;
	private static final String[][] SUBMITGRADE2_PROPERTY_BINDINGS = new String[][] {
		{"#{submitGrade2.authCredentials.authenticationMethod}", "1"},
		{"#{submitGrade2.authCredentials.requiresAuth}", "true"},
		{"#{submitGrade2.autoRefresh}", "false"},
		{"#{submitGrade2.parameters.submitGrade.submitGrade.studentId}", "#{Lf090_submitgradedefaultviewview.lf090_submitgrade.studID}"},
		{"#{submitGrade2.parameters.submitGrade.submitGrade.courseId}", "#{Lf090_submitgradedefaultviewview.lf090_submitgrade.courseID}"},
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

	public com.webmethods.caf.is.wsclient.campusconnect.work.gradesubmission.submitgrade_wsd_hk2.SubmitGrade2 getSubmitGrade2()  {
		if (submitGrade2 == null) {
		    submitGrade2 = (com.webmethods.caf.is.wsclient.campusconnect.work.gradesubmission.submitgrade_wsd_hk2.SubmitGrade2)resolveExpression("#{SubmitGrade2}");
		}
	
	    resolveDataBinding(SUBMITGRADE2_PROPERTY_BINDINGS, submitGrade2, "submitGrade2", false, false);
		return submitGrade2;
	}
}