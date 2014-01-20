/**
 * 
 */
package com.webmethods.caf.lf020_studexamlist;

/**
 * @author wir09cdz
 *
 */

import javax.portlet.PortletPreferences;

public class Lf020_studexamlist  extends   com.webmethods.caf.faces.bean.BaseFacesPreferencesBean {

	private com.webmethods.caf.CampusConnect campusConnect = null;
	private com.webmethods.caf.is.wsclient.campusconnect.work.examderegistration.studexam_wsd_hk1.StudExamsList1 studExamsList = null;
	private static final String[][] STUDEXAMSLIST_PROPERTY_BINDINGS = new String[][] {
		{"#{studExamsList.authCredentials.authenticationMethod}", "1"},
		{"#{studExamsList.authCredentials.requiresAuth}", "true"},
		{"#{studExamsList.autoRefresh}", "true"},
		{"#{studExamsList.parameters.studExamsList.studId}", "#{Lf020_studexamlistdefaultviewview.lf020_studexamlist.studID}"},
	};
	private static final String[][] COURSEIDSET_PROPERTY_BINDINGS = new String[][] {
		{"#{Lf020_studexamlistdefaultviewview.lf020_studexamlist.courseID}", "#{outExam._COURSEID}"},
	};
	/**
	 * List of portlet preference names
	 */
	public static final String[] PREFERENCES_NAMES = new String[] {
		"StudID", "CourseID", "Token"
	};
	/**
	 * Create new preferences bean with list of preference names
	 */
	public Lf020_studexamlist() {
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

	public com.webmethods.caf.is.wsclient.campusconnect.work.examderegistration.studexam_wsd_hk1.StudExamsList1 getStudExamsList()  {
		if (studExamsList == null) {
		    studExamsList = (com.webmethods.caf.is.wsclient.campusconnect.work.examderegistration.studexam_wsd_hk1.StudExamsList1)resolveExpression("#{StudExamsList}");
		}
	
	    resolveDataBinding(STUDEXAMSLIST_PROPERTY_BINDINGS, studExamsList, "studExamsList", false, false);
		return studExamsList;
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
	public String getToken() throws Exception {
		return (String) getPreferenceValue("Token", String.class);
	}

	/**
	 * Invoke {@link #storePreferences} to persist these changes
	 */
	public void setToken(String token) throws Exception {
		setPreferenceValue("Token", token);
	}
}