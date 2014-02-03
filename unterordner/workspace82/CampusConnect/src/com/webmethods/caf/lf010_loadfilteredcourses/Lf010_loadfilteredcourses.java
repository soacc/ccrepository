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
	private com.webmethods.caf.is.wsclient.campusconnect.work.courseregistration.loadfilteredcourses_wsd_hk1.LoadFilteredCourses8 loadFilteredCourses8 = null;
	/**
	 * List of portlet preference names
	 */
	public static final String[] PREFERENCES_NAMES = new String[] {
		"StudID", "CourseID", "FeldID"
	};
	private static final String[][] LOADFILTEREDCOURSES8_PROPERTY_BINDINGS = new String[][] {
		{"#{loadFilteredCourses8.authCredentials.authenticationMethod}", "1"},
		{"#{loadFilteredCourses8.authCredentials.requiresAuth}", "true"},
		{"#{loadFilteredCourses8.parameters.loadFilteredCoursesInput.studId}", "#{Lf010_loadfilteredcoursesdefaultviewview.lf010_loadfilteredcourses.studID}"},
		{"#{loadFilteredCourses8.autoRefresh}", "true"},
		{"#{loadFilteredCourses8.parameters.loadFilteredCoursesInput.hidden}", "#{Lf010_loadfilteredcoursesdefaultviewview.lf010_loadfilteredcourses.feldID}"},
	};
	private com.webmethods.caf.is.wsclient.campusconnect.work.courseregistration.registercoursestest.RegisterCourses2 registerCourses2 = null;
	private static final String[][] REGISTERCOURSES2_PROPERTY_BINDINGS = new String[][] {
		{"#{registerCourses2.authCredentials.authenticationMethod}", "1"},
		{"#{registerCourses2.authCredentials.requiresAuth}", "true"},
		{"#{registerCourses2.autoRefresh}", "false"},
		{"#{registerCourses2.parameters.registerCoursesInput.inputCourses}", "#{Lf010_loadfilteredcoursesdefaultviewview.lf010_loadfilteredcourses.courseID}"},
		{"#{registerCourses2.parameters.registerCoursesInput.studId}", "#{Lf010_loadfilteredcoursesdefaultviewview.lf010_loadfilteredcourses.studID}"},
	};
	private com.webmethods.caf.is.wsclient.campusconnect.utils.courses.getcoursedetails_wsd_hk1.GetCourseDetails1 getCourseDetails = null;
	private static final String[][] GETCOURSEDETAILS_PROPERTY_BINDINGS = new String[][] {
		{"#{getCourseDetails.authCredentials.authenticationMethod}", "1"},
		{"#{getCourseDetails.authCredentials.requiresAuth}", "true"},
		{"#{getCourseDetails.autoRefresh}", "true"},
		{"#{getCourseDetails.parameters.getCourseDetails.id}", "#{Lf010_loadfilteredcoursesdefaultviewview.lf010_loadfilteredcourses.courseID}"},
	};
	private static final String[][] ACTION_PROPERTY_BINDINGS = new String[][] {
		{"#{Lf010_loadfilteredcoursesdefaultviewview.lf010_loadfilteredcourses.registerCourses2.refresh}", null},
		{"#{Lf010_loadfilteredcoursesdefaultviewview.lf010_loadfilteredcourses.loadFilteredCourses8.refresh}", null},
		{"#{Lf010_loadfilteredcoursesdefaultviewview.lf010_loadfilteredcourses.courseID}", "#{Lf010_loadfilteredcoursesdefaultviewview.lf010_loadfilteredcourses.registerCourses2.result.hidden}"},
		{"#{Lf010_loadfilteredcoursesdefaultviewview.lf010_loadfilteredcourses.feldID}", "#{Lf010_loadfilteredcoursesdefaultviewview.lf010_loadfilteredcourses.registerCourses2.result.hidden}"},
	};
	private static final String[][] COURSEIDSET_PROPERTY_BINDINGS = new String[][] {
		{"#{Lf010_loadfilteredcoursesdefaultviewview.lf010_loadfilteredcourses.courseID}", "#{outputCourse._COURSEID}"},
		{"#{Lf010_loadfilteredcoursesdefaultviewview.lf010_loadfilteredcourses.feldID}", "#{Lf010_loadfilteredcoursesdefaultviewview.lf010_loadfilteredcourses.loadFilteredCourses8.result.hidden}"},
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

	public com.webmethods.caf.is.wsclient.campusconnect.work.courseregistration.loadfilteredcourses_wsd_hk1.LoadFilteredCourses8 getLoadFilteredCourses8()  {
		if (loadFilteredCourses8 == null) {
		    loadFilteredCourses8 = (com.webmethods.caf.is.wsclient.campusconnect.work.courseregistration.loadfilteredcourses_wsd_hk1.LoadFilteredCourses8)resolveExpression("#{LoadFilteredCourses8}");
		}
	
	    resolveDataBinding(LOADFILTEREDCOURSES8_PROPERTY_BINDINGS, loadFilteredCourses8, "loadFilteredCourses8", false, false);
		return loadFilteredCourses8;
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

	public String courseIdSet() {
	    resolveDataBinding(COURSEIDSET_PROPERTY_BINDINGS, this, "courseIdSet.this", true, false);
		return OUTCOME_OK;
	}

	/**
	 * The algorithm for this 'smart' preference getter is:
	 * 1) Check the Request Map (skip this step if it isn't a 'smart' preference)
	 * 2) Check the Member variable
	 * 3) Fall back to the PortletPreferences
	 */
	public String getFeldID() throws Exception {
		return (String) getPreferenceValue("FeldID", String.class);
	}

	/**
	 * Invoke {@link #storePreferences} to persist these changes
	 */
	public void setFeldID(String feldID) throws Exception {
		setPreferenceValue("FeldID", feldID);
	}

	public com.webmethods.caf.is.wsclient.campusconnect.work.courseregistration.registercoursestest.RegisterCourses2 getRegisterCourses2()  {
		if (registerCourses2 == null) {
		    registerCourses2 = (com.webmethods.caf.is.wsclient.campusconnect.work.courseregistration.registercoursestest.RegisterCourses2)resolveExpression("#{RegisterCourses2}");
		}
	
	    resolveDataBinding(REGISTERCOURSES2_PROPERTY_BINDINGS, registerCourses2, "registerCourses2", false, false);
		return registerCourses2;
	}

	public String action() {
	    resolveDataBinding(ACTION_PROPERTY_BINDINGS, this, "action.this", true, false);
		return OUTCOME_OK;
	}

	public com.webmethods.caf.is.wsclient.campusconnect.utils.courses.getcoursedetails_wsd_hk1.GetCourseDetails1 getGetCourseDetails()  {
		if (getCourseDetails == null) {
		    getCourseDetails = (com.webmethods.caf.is.wsclient.campusconnect.utils.courses.getcoursedetails_wsd_hk1.GetCourseDetails1)resolveExpression("#{GetCourseDetails}");
		}
	
	    resolveDataBinding(GETCOURSEDETAILS_PROPERTY_BINDINGS, getCourseDetails, "getCourseDetails", false, false);
		return getCourseDetails;
	}
}