/**
 * 
 */
package com.webmethods.caf.lf020_deregisterexam;

/**
 * @author wir09cdz
 *
 */

import javax.portlet.PortletPreferences;

public class Lf020_deregisterexam  extends   com.webmethods.caf.faces.bean.BaseFacesPreferencesBean {

	private com.webmethods.caf.CampusConnect campusConnect = null;
	private com.webmethods.caf.is.wsclient.campusconnect.work.examderegistration.deregisterexam_wsd.DeregisterExam1 deregisterExam = null;
	/**
	 * List of portlet preference names
	 */
	public static final String[] PREFERENCES_NAMES = new String[] {
		"StudID"
	};
	private static final String[][] DEREGISTEREXAM_PROPERTY_BINDINGS = new String[][] {
		{"#{deregisterExam.authCredentials.authenticationMethod}", "1"},
		{"#{deregisterExam.authCredentials.requiresAuth}", "true"},
		{"#{deregisterExam.autoRefresh}", "true"},
		{"#{deregisterExam.parameters.deregisterExam.studId}", "#{Lf020_deregisterexamdefaultviewview.lf020_deregisterexam.studID}"},
	};
	/**
	 * Create new preferences bean with list of preference names
	 */
	public Lf020_deregisterexam() {
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

	public com.webmethods.caf.is.wsclient.campusconnect.work.examderegistration.deregisterexam_wsd.DeregisterExam1 getDeregisterExam()  {
		if (deregisterExam == null) {
		    deregisterExam = (com.webmethods.caf.is.wsclient.campusconnect.work.examderegistration.deregisterexam_wsd.DeregisterExam1)resolveExpression("#{DeregisterExam}");
		}
	
	    resolveDataBinding(DEREGISTEREXAM_PROPERTY_BINDINGS, deregisterExam, "deregisterExam", false, false);
		return deregisterExam;
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
}