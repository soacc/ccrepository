/**
 * 
 */
package com.webmethods.caf.examderegtest;

/**
 * @author wir09cdz
 *
 */

import javax.portlet.PortletPreferences;

public class Examderegtest  extends   com.webmethods.caf.faces.bean.BaseFacesPreferencesBean {

	public static final String[] PREFERENCES_NAMES = new String[] {};
	private com.webmethods.caf.Support support = null;
	private com.webmethods.caf.is.wsclient.campusconnect.work.examderegistration.deregisterexam_wsd_hk1.DeregisterExam1 deregisterExam = null;
	private static final String[][] DEREGISTEREXAM_PROPERTY_BINDINGS = new String[][] {
		{"#{DeregisterExam.authCredentials.authenticationMethod}", "1"},
		{"#{DeregisterExam.authCredentials.requiresAuth}", "true"},
		{"#{DeregisterExam.autoRefresh}", "true"},
	};
	/**
	 * Create new preferences bean with list of preference names
	 */
	public Examderegtest() {
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

	public com.webmethods.caf.is.wsclient.campusconnect.work.examderegistration.deregisterexam_wsd_hk1.DeregisterExam1 getDeregisterExam()  {
		if (deregisterExam == null) {
		    deregisterExam = (com.webmethods.caf.is.wsclient.campusconnect.work.examderegistration.deregisterexam_wsd_hk1.DeregisterExam1)resolveExpression("#{DeregisterExam}");
		}
	
	    resolveDataBinding(DEREGISTEREXAM_PROPERTY_BINDINGS, deregisterExam, "deregisterExam", false, false);
		return deregisterExam;
	}
}