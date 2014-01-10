/**
 * 
 */
package com.webmethods.caf.lf010_loadfilteredcourses;

/**
 * @author wir09cdz
 *
 */

import javax.portlet.PortletPreferences;

public class Lf010_loadfilteredcourses  extends   com.webmethods.caf.faces.bean.BaseFacesPreferencesBean {

	private com.webmethods.caf.CampusConnect campusConnect = null;
	private com.webmethods.caf.is.wsclient.campusconnect.work.courseregistration.loadfilteredcourses_wsd.LoadFilteredCourses2 loadFilteredCourses2 = null;
	private static final String[][] LOADFILTEREDCOURSES2_PROPERTY_BINDINGS = new String[][] {
		{"#{loadFilteredCourses2.authCredentials.authenticationMethod}", "1"},
		{"#{loadFilteredCourses2.authCredentials.requiresAuth}", "true"},
		{"#{loadFilteredCourses2.autoRefresh}", "true"},
		{"#{loadFilteredCourses2.parameters.loadFilteredCoursesInput.studId}", "#{Lf010_loadfilteredcoursesdefaultviewview.lf010_loadfilteredcourses.studID}"},
	};
	/**
	 * List of portlet preference names
	 */
	public static final String[] PREFERENCES_NAMES = new String[] {
		"StudID", "CourseID"
	};
	private static final String[][] COURSEIDSET_PROPERTY_BINDINGS = new String[][] {
		{"#{Lf010_loadfilteredcoursesdefaultviewview.lf010_loadfilteredcourses.courseID}", "#{result.courseId}"},
	};
	/**
	 * Create new preferences bean with list of preference names
	 */
	public Lf010_loadfilteredcourses() {
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

	public com.webmethods.caf.is.wsclient.campusconnect.work.courseregistration.loadfilteredcourses_wsd.LoadFilteredCourses2 getLoadFilteredCourses2()  {
		if (loadFilteredCourses2 == null) {
		    loadFilteredCourses2 = (com.webmethods.caf.is.wsclient.campusconnect.work.courseregistration.loadfilteredcourses_wsd.LoadFilteredCourses2)resolveExpression("#{LoadFilteredCourses2}");
		}
	
	    resolveDataBinding(LOADFILTEREDCOURSES2_PROPERTY_BINDINGS, loadFilteredCourses2, "loadFilteredCourses2", false, false);
		return loadFilteredCourses2;
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

	public String courseIDSet() {
	    resolveDataBinding(COURSEIDSET_PROPERTY_BINDINGS, this, "courseIDSet.this", true, false);
		return OUTCOME_OK;
	}
}