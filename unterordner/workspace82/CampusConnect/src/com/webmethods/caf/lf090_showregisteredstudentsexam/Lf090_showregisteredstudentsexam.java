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

	private com.webmethods.caf.CampusConnect campusConnect = null;
	private com.webmethods.caf.is.wsclient.campusconnect.work.gradesubmission.showregisteredstudentsexam_wsd_hk1.ShowRegisteredStudentsExam3 showRegisteredStudentsExam3 = null;
	private static final String[][] SHOWREGISTEREDSTUDENTSEXAM3_PROPERTY_BINDINGS = new String[][] {
		{"#{showRegisteredStudentsExam3.authCredentials.authenticationMethod}", "1"},
		{"#{showRegisteredStudentsExam3.authCredentials.requiresAuth}", "true"},
		{"#{showRegisteredStudentsExam3.autoRefresh}", "false"},
	};
	/**
	 * List of portlet preference names
	 */
	public static final String[] PREFERENCES_NAMES = new String[] {
		"CourseID", "StudID"
	};
	private static final String[][] STUDIDSET_PROPERTY_BINDINGS = new String[][] {
		{"#{Lf090_showregisteredstudentsexamdefaultviewview.lf090_showregisteredstudentsexam.studID}", "#{student._STUDENTID}"},
		{"#{Lf090_showregisteredstudentsexamdefaultviewview.lf090_showregisteredstudentsexam.courseID}", "#{Lf090_showregisteredstudentsexamdefaultviewview.lf090_showregisteredstudentsexam.showRegisteredStudentsExam3.parameters.showRegisteredStudentsExam.examId}"},
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

	public com.webmethods.caf.is.wsclient.campusconnect.work.gradesubmission.showregisteredstudentsexam_wsd_hk1.ShowRegisteredStudentsExam3 getShowRegisteredStudentsExam3()  {
		if (showRegisteredStudentsExam3 == null) {
		    showRegisteredStudentsExam3 = (com.webmethods.caf.is.wsclient.campusconnect.work.gradesubmission.showregisteredstudentsexam_wsd_hk1.ShowRegisteredStudentsExam3)resolveExpression("#{ShowRegisteredStudentsExam3}");
		}
	
	    resolveDataBinding(SHOWREGISTEREDSTUDENTSEXAM3_PROPERTY_BINDINGS, showRegisteredStudentsExam3, "showRegisteredStudentsExam3", false, false);
		return showRegisteredStudentsExam3;
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

	public String studIdSet() {
	    resolveDataBinding(STUDIDSET_PROPERTY_BINDINGS, this, "studIdSet.this", true, false);
		return OUTCOME_OK;
	}
}