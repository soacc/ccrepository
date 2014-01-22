/**
 * 
 */
package com.webmethods.caf.getexamfromcourse;

/**
 * @author wir09cdz
 *
 */

import javax.portlet.PortletPreferences;

public class GetExamFromCourse  extends   com.webmethods.caf.faces.bean.BaseFacesPreferencesBean {

	private com.webmethods.caf.Support support = null;
	private com.webmethods.caf.is.wsclient.campusconnect.utils.exams.getexamfromcourse_wsd_hk1.GetExamFromCourse2 getExamFromCourse2 = null;
	/**
	 * List of portlet preference names
	 */
	public static final String[] PREFERENCES_NAMES = new String[] {
		"CourseID"
	};
	private static final String[][] GETEXAMFROMCOURSE2_PROPERTY_BINDINGS = new String[][] {
		{"#{getExamFromCourse2.authCredentials.authenticationMethod}", "1"},
		{"#{getExamFromCourse2.authCredentials.requiresAuth}", "true"},
		{"#{getExamFromCourse2.autoRefresh}", "true"},
		{"#{getExamFromCourse2.parameters.getExamFromCourse.courseId}", "#{GetExamFromCourseDefaultviewView.getExamFromCourse.courseID}"},
	};
	/**
	 * Create new preferences bean with list of preference names
	 */
	public GetExamFromCourse() {
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

	public com.webmethods.caf.Support getSupport()  {
		if (support == null) {
		    support = (com.webmethods.caf.Support)resolveExpression("#{Support}");
		}
		return support;
	}

	public com.webmethods.caf.is.wsclient.campusconnect.utils.exams.getexamfromcourse_wsd_hk1.GetExamFromCourse2 getGetExamFromCourse2()  {
		if (getExamFromCourse2 == null) {
		    getExamFromCourse2 = (com.webmethods.caf.is.wsclient.campusconnect.utils.exams.getexamfromcourse_wsd_hk1.GetExamFromCourse2)resolveExpression("#{GetExamFromCourse2}");
		}
	
	    resolveDataBinding(GETEXAMFROMCOURSE2_PROPERTY_BINDINGS, getExamFromCourse2, "getExamFromCourse2", false, false);
		return getExamFromCourse2;
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