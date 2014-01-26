/**
 * 
 */
package com.webmethods.caf.lf010_registercourses;

/**
 * @author wir09cdz
 *
 */

import javax.portlet.PortletPreferences;

public class Lf010_registercourses  extends   com.webmethods.caf.faces.bean.BaseFacesPreferencesBean {

	private com.webmethods.caf.CampusConnect campusConnect = null;
	/**
	 * List of portlet preference names
	 */
	public static final String[] PREFERENCES_NAMES = new String[] {
		"StudID", "CourseID"
	};
	private com.webmethods.caf.is.wsclient.campusconnect.work.courseregistration.registercourses_wsd_hk2.RegisterCourses registerCourses = null;
	private static final String[][] REGISTERCOURSES_PROPERTY_BINDINGS = new String[][] {
		{"#{registerCourses.authCredentials.authenticationMethod}", "1"},
		{"#{registerCourses.authCredentials.requiresAuth}", "true"},
		{"#{registerCourses.autoRefresh}", "false"},
		{"#{registerCourses.parameters.registerCoursesInput.inputCourses}", "#{Lf010_registercoursesdefaultviewview.lf010_registercourses.courseID}"},
		{"#{registerCourses.parameters.registerCoursesInput.studId}", "#{Lf010_registercoursesdefaultviewview.lf010_registercourses.studID}"},
	};
	/**
	 * Create new preferences bean with list of preference names
	 */
	public Lf010_registercourses() {
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

	public com.webmethods.caf.is.wsclient.campusconnect.work.courseregistration.registercourses_wsd_hk2.RegisterCourses getRegisterCourses()  {
		if (registerCourses == null) {
		    registerCourses = (com.webmethods.caf.is.wsclient.campusconnect.work.courseregistration.registercourses_wsd_hk2.RegisterCourses)resolveExpression("#{RegisterCourses}");
		}
	
	    resolveDataBinding(REGISTERCOURSES_PROPERTY_BINDINGS, registerCourses, "registerCourses", false, false);
		return registerCourses;
	}
}