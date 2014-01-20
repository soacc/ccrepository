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

	private com.webmethods.caf.Work work = null;
	private com.webmethods.caf.is.wsclient.campusconnect.work.courseregistration.loadfilteredcourses_wsd.LoadFilteredCourses loadFilteredCourses = null;
	private static final String[][] LOADFILTEREDCOURSES_PROPERTY_BINDINGS = new String[][] {
		{"#{LoadFilteredCourses.authCredentials.authenticationMethod}", "1"},
		{"#{LoadFilteredCourses.authCredentials.requiresAuth}", "true"},
		{"#{LoadFilteredCourses.autoRefresh}", "true"},
	};
	private static final String[][] SETCOURSES_PROPERTY_BINDINGS = new String[][] {
	};
	/**
	 * List of portlet preference names
	 */
	public static final String[] PREFERENCES_NAMES = new String[] {
		"Course"
	};
	private static final String[][] ACTION_PROPERTY_BINDINGS = new String[][] {
		{"#{Lf010_loadfilteredcoursesdefaultviewview.lf010_loadfilteredcourses.course}", "#{result.courseId}"},
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

	public com.webmethods.caf.Work getWork()  {
		if (work == null) {
		    work = (com.webmethods.caf.Work)resolveExpression("#{Work}");
		}
		return work;
	}

	public com.webmethods.caf.is.wsclient.campusconnect.work.courseregistration.loadfilteredcourses_wsd.LoadFilteredCourses getLoadFilteredCourses()  {
		if (loadFilteredCourses == null) {
		    loadFilteredCourses = (com.webmethods.caf.is.wsclient.campusconnect.work.courseregistration.loadfilteredcourses_wsd.LoadFilteredCourses)resolveExpression("#{LoadFilteredCourses}");
		}
	
	    resolveDataBinding(LOADFILTEREDCOURSES_PROPERTY_BINDINGS, loadFilteredCourses, "loadFilteredCourses", false, false);
		return loadFilteredCourses;
	}

	public String action() {
	    resolveDataBinding(ACTION_PROPERTY_BINDINGS, this, "action.this", true, false);
		return OUTCOME_OK;
	}

	/**
	 * The algorithm for this 'smart' preference getter is:
	 * 1) Check the Request Map (skip this step if it isn't a 'smart' preference)
	 * 2) Check the Member variable
	 * 3) Fall back to the PortletPreferences
	 */
	public String getCourse() throws Exception {
		return (String) getPreferenceValue("Course", String.class);
	}

	/**
	 * Invoke {@link #storePreferences} to persist these changes
	 */
	public void setCourse(String course) throws Exception {
		setPreferenceValue("Course", course);
	}
}