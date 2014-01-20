/**
 * 
 */
package com.webmethods.caf.lf020_registerexam;

/**
 * @author wir09cdz
 *
 */

import javax.portlet.PortletPreferences;

public class Lf020_registerexam  extends   com.webmethods.caf.faces.bean.BaseFacesPreferencesBean {

	private com.webmethods.caf.CampusConnect campusConnect = null;
	private com.webmethods.caf.is.wsclient.campusconnect.work.examregistration.registerexam_wsd.RegisterExam1 registerExam = null;
	/**
	 * List of portlet preference names
	 */
	public static final String[] PREFERENCES_NAMES = new String[] {
		"StudID", "ExamID", "Token"
	};
	private static final String[][] REGISTEREXAM_PROPERTY_BINDINGS = new String[][] {
		{"#{registerExam.authCredentials.authenticationMethod}", "1"},
		{"#{registerExam.authCredentials.requiresAuth}", "true"},
		{"#{registerExam.autoRefresh}", "false"},
		{"#{registerExam.parameters.registerExam.studId}", "#{Lf020_registerexam.studID}"},
		{"#{registerExam.parameters.registerExam.courseId}", "#{Lf020_registerexamdefaultviewview.lf020_registerexam.examID}"},
	};
	/**
	 * Create new preferences bean with list of preference names
	 */
	public Lf020_registerexam() {
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

	public com.webmethods.caf.is.wsclient.campusconnect.work.examregistration.registerexam_wsd.RegisterExam1 getRegisterExam()  {
		if (registerExam == null) {
		    registerExam = (com.webmethods.caf.is.wsclient.campusconnect.work.examregistration.registerexam_wsd.RegisterExam1)resolveExpression("#{RegisterExam}");
		}
	
	    resolveDataBinding(REGISTEREXAM_PROPERTY_BINDINGS, registerExam, "registerExam", false, false);
		return registerExam;
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
	public String getExamID() throws Exception {
		return (String) getPreferenceValue("ExamID", String.class);
	}

	/**
	 * Invoke {@link #storePreferences} to persist these changes
	 */
	public void setExamID(String examID) throws Exception {
		setPreferenceValue("ExamID", examID);
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