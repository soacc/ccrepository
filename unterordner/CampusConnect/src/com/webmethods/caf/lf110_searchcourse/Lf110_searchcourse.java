/**
 * 
 */
package com.webmethods.caf.lf110_searchcourse;

/**
 * @author wir09cdz
 *
 */

import javax.portlet.PortletPreferences;

public class Lf110_searchcourse  extends   com.webmethods.caf.faces.bean.BaseFacesPreferencesBean {

	public static final String[] PREFERENCES_NAMES = new String[] {};
	private com.webmethods.caf.CampusConnect campusConnect = null;
	private com.webmethods.caf.is.wsclient.campusconnect.work.searchcourse.searchcourse_wsd.SearchCourse1 searchCourse = null;
	private static final String[][] SEARCHCOURSE_PROPERTY_BINDINGS = new String[][] {
		{"#{searchCourse.authCredentials.authenticationMethod}", "1"},
		{"#{searchCourse.authCredentials.requiresAuth}", "true"},
		{"#{searchCourse.autoRefresh}", "false"},
	};
	/**
	 * Create new preferences bean with list of preference names
	 */
	public Lf110_searchcourse() {
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

	public com.webmethods.caf.is.wsclient.campusconnect.work.searchcourse.searchcourse_wsd.SearchCourse1 getSearchCourse()  {
		if (searchCourse == null) {
		    searchCourse = (com.webmethods.caf.is.wsclient.campusconnect.work.searchcourse.searchcourse_wsd.SearchCourse1)resolveExpression("#{SearchCourse}");
		}
	
	    resolveDataBinding(SEARCHCOURSE_PROPERTY_BINDINGS, searchCourse, "searchCourse", false, false);
		return searchCourse;
	}
}