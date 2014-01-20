/**
 * 
 */
package com.webmethods.caf.loadstudregisteredcourses_bugtest;

/**
 * @author wir09cdz
 *
 */

import javax.portlet.PortletPreferences;

public class LoadStudRegisteredCourses_Bugtest  extends   com.webmethods.caf.faces.bean.BaseFacesPreferencesBean {

	public static final String[] PREFERENCES_NAMES = new String[] {};
	private com.webmethods.caf.Support support = null;
	private com.webmethods.caf.is.wsclient.campusconnect.work.coursederegistration.loadstudregisteredcourses_wsd_bugtest1.LoadStudRegisteredCourses1 loadStudRegisteredCourses = null;
	private static final String[][] LOADSTUDREGISTEREDCOURSES_PROPERTY_BINDINGS = new String[][] {
		{"#{LoadStudRegisteredCourses.authCredentials.authenticationMethod}", "1"},
		{"#{LoadStudRegisteredCourses.authCredentials.requiresAuth}", "true"},
		{"#{LoadStudRegisteredCourses.autoRefresh}", "true"},
	};
	/**
	 * Create new preferences bean with list of preference names
	 */
	public LoadStudRegisteredCourses_Bugtest() {
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

	public com.webmethods.caf.is.wsclient.campusconnect.work.coursederegistration.loadstudregisteredcourses_wsd_bugtest1.LoadStudRegisteredCourses1 getLoadStudRegisteredCourses()  {
		if (loadStudRegisteredCourses == null) {
		    loadStudRegisteredCourses = (com.webmethods.caf.is.wsclient.campusconnect.work.coursederegistration.loadstudregisteredcourses_wsd_bugtest1.LoadStudRegisteredCourses1)resolveExpression("#{LoadStudRegisteredCourses}");
		}
	
	    resolveDataBinding(LOADSTUDREGISTEREDCOURSES_PROPERTY_BINDINGS, loadStudRegisteredCourses, "loadStudRegisteredCourses", false, false);
		return loadStudRegisteredCourses;
	}
}