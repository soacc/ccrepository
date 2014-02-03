/**
 * 
 */
package com.webmethods.caf.lf010_loadstudregisteredcourses;

/**
 * @author wir09cdz
 *
 */

import javax.portlet.PortletPreferences;

public class Lf010_loadstudregisteredcourses  extends   com.webmethods.caf.faces.bean.BaseFacesPreferencesBean {

	private com.webmethods.caf.CampusConnect campusConnect = null;
	private com.webmethods.caf.is.wsclient.campusconnect.work.coursederegistration.loadstudregisteredcourses_wsd_hk1.LoadStudRegisteredCourses1 loadStudRegisteredCourses = null;
	private static final String[][] LOADSTUDREGISTEREDCOURSES_PROPERTY_BINDINGS = new String[][] {
		{"#{loadStudRegisteredCourses.authCredentials.authenticationMethod}", "1"},
		{"#{loadStudRegisteredCourses.authCredentials.requiresAuth}", "true"},
		{"#{loadStudRegisteredCourses.autoRefresh}", "true"},
		{"#{loadStudRegisteredCourses.parameters.loadStudRegisteredCourses.studId}", "#{Lf010_loadstudregisteredcoursesdefaultviewview.lf010_loadstudregisteredcourses.studID}"},
	};
	private com.webmethods.caf.is.wsclient.campusconnect.utils.courses.getcoursedetails_wsd_hk1.GetCourseDetails2 getCourseDetails2 = null;
	private com.webmethods.caf.is.wsclient.campusconnect.work.coursederegistration.deregistercourses_wsd.DeregisterCourses2 deregisterCourses2 = null;
	private static final String[][] GETCOURSEDETAILS2_PROPERTY_BINDINGS = new String[][] {
		{"#{getCourseDetails2.authCredentials.authenticationMethod}", "1"},
		{"#{getCourseDetails2.authCredentials.requiresAuth}", "true"},
		{"#{getCourseDetails2.autoRefresh}", "true"},
		{"#{getCourseDetails2.parameters.getCourseDetails.id}", "#{Lf010_loadstudregisteredcoursesdefaultviewview.lf010_loadstudregisteredcourses.courseID}"},
	};
	private static final String[][] DEREGISTERCOURSES2_PROPERTY_BINDINGS = new String[][] {
		{"#{deregisterCourses2.authCredentials.authenticationMethod}", "1"},
		{"#{deregisterCourses2.authCredentials.requiresAuth}", "true"},
		{"#{deregisterCourses2.autoRefresh}", "false"},
		{"#{deregisterCourses2.parameters.deregisterCourses.studId}", "#{Lf010_loadstudregisteredcoursesdefaultviewview.lf010_loadstudregisteredcourses.studID}"},
		{"#{deregisterCourses2.parameters.deregisterCourses.courseIds}", "#{Lf010_loadstudregisteredcoursesdefaultviewview.lf010_loadstudregisteredcourses.courseID}"},
	};
	private static final String[][] COURSEIDSET_PROPERTY_BINDINGS = new String[][] {
		{"#{Lf010_loadstudregisteredcoursesdefaultviewview.lf010_loadstudregisteredcourses.courseID}", "#{outCourse._COURSEID}"},
		{"#{Lf010_loadstudregisteredcoursesdefaultviewview.lf010_loadstudregisteredcourses.feldID}", "#{Lf010_loadstudregisteredcoursesdefaultviewview.lf010_loadstudregisteredcourses.loadStudRegisteredCourses.result.hidden}"},
	};
	/**
	 * List of portlet preference names
	 */
	public static final String[] PREFERENCES_NAMES = new String[] {
		"StudID", "CourseID", "FeldID"
	};
	private static final String[][] ACTION_PROPERTY_BINDINGS = new String[][] {
		{"#{Lf010_loadstudregisteredcoursesdefaultviewview.lf010_loadstudregisteredcourses.deregisterCourses2.refresh}", null},
		{"#{Lf010_loadstudregisteredcoursesdefaultviewview.lf010_loadstudregisteredcourses.loadStudRegisteredCourses.refresh}", null},
		{"#{Lf010_loadstudregisteredcoursesdefaultviewview.lf010_loadstudregisteredcourses.courseID}", "#{Lf010_loadstudregisteredcoursesdefaultviewview.lf010_loadstudregisteredcourses.deregisterCourses2.result.message}"},
		{"#{Lf010_loadstudregisteredcoursesdefaultviewview.lf010_loadstudregisteredcourses.feldID}", "#{Lf010_loadstudregisteredcoursesdefaultviewview.lf010_loadstudregisteredcourses.deregisterCourses2.result.hidden}"},
	};
	/**
	 * Create new preferences bean with list of preference names
	 */
	public Lf010_loadstudregisteredcourses() {
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

	public String courseIDSet() {
	    resolveDataBinding(COURSEIDSET_PROPERTY_BINDINGS, this, "courseIDSet.this", true, false);
		return OUTCOME_OK;
	}

	public com.webmethods.caf.is.wsclient.campusconnect.work.coursederegistration.loadstudregisteredcourses_wsd_hk1.LoadStudRegisteredCourses1 getLoadStudRegisteredCourses()  {
		if (loadStudRegisteredCourses == null) {
		    loadStudRegisteredCourses = (com.webmethods.caf.is.wsclient.campusconnect.work.coursederegistration.loadstudregisteredcourses_wsd_hk1.LoadStudRegisteredCourses1)resolveExpression("#{LoadStudRegisteredCourses}");
		}
	
	    resolveDataBinding(LOADSTUDREGISTEREDCOURSES_PROPERTY_BINDINGS, loadStudRegisteredCourses, "loadStudRegisteredCourses", false, false);
		return loadStudRegisteredCourses;
	}

	public com.webmethods.caf.is.wsclient.campusconnect.utils.courses.getcoursedetails_wsd_hk1.GetCourseDetails2 getGetCourseDetails2()  {
		if (getCourseDetails2 == null) {
		    getCourseDetails2 = (com.webmethods.caf.is.wsclient.campusconnect.utils.courses.getcoursedetails_wsd_hk1.GetCourseDetails2)resolveExpression("#{GetCourseDetails2}");
		}
	
	    resolveDataBinding(GETCOURSEDETAILS2_PROPERTY_BINDINGS, getCourseDetails2, "getCourseDetails2", false, false);
		return getCourseDetails2;
	}

	public com.webmethods.caf.is.wsclient.campusconnect.work.coursederegistration.deregistercourses_wsd.DeregisterCourses2 getDeregisterCourses2()  {
		if (deregisterCourses2 == null) {
		    deregisterCourses2 = (com.webmethods.caf.is.wsclient.campusconnect.work.coursederegistration.deregistercourses_wsd.DeregisterCourses2)resolveExpression("#{DeregisterCourses2}");
		}
	
	    resolveDataBinding(DEREGISTERCOURSES2_PROPERTY_BINDINGS, deregisterCourses2, "deregisterCourses2", false, false);
		return deregisterCourses2;
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
	public String getFeldID() throws Exception {
		return (String) getPreferenceValue("FeldID", String.class);
	}

	/**
	 * Invoke {@link #storePreferences} to persist these changes
	 */
	public void setFeldID(String feldID) throws Exception {
		setPreferenceValue("FeldID", feldID);
	}
}