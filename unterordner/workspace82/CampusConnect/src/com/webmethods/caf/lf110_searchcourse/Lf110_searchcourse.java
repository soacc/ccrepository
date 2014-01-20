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
	private com.webmethods.caf.is.wsclient.campusconnect.work.searchcourse.searchcourse_wsd_5.SearchCourse3 searchCourse3 = null;
	private static final String[][] SEARCHCOURSE3_PROPERTY_BINDINGS = new String[][] {
		{"#{searchCourse3.authCredentials.authenticationMethod}", "1"},
		{"#{searchCourse3.authCredentials.requiresAuth}", "true"},
		{"#{searchCourse3.autoRefresh}", "false"},
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

	public com.webmethods.caf.is.wsclient.campusconnect.work.searchcourse.searchcourse_wsd_5.SearchCourse3 getSearchCourse3()  {
		if (searchCourse3 == null) {
		    searchCourse3 = (com.webmethods.caf.is.wsclient.campusconnect.work.searchcourse.searchcourse_wsd_5.SearchCourse3)resolveExpression("#{SearchCourse3}");
		}
	
	    resolveDataBinding(SEARCHCOURSE3_PROPERTY_BINDINGS, searchCourse3, "searchCourse3", false, false);
		return searchCourse3;
	}
}