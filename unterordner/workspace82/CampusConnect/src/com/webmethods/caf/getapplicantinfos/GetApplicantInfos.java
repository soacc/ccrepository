/**
 * 
 */
package com.webmethods.caf.getapplicantinfos;

/**
 * @author wir09cdz
 *
 */

import javax.portlet.PortletPreferences;

public class GetApplicantInfos  extends   com.webmethods.caf.faces.bean.BaseFacesPreferencesBean {

	public static final String[] PREFERENCES_NAMES = new String[] {};
	private com.webmethods.caf.CampusConnect campusConnect = null;
	private com.webmethods.caf.is.wsclient.campusconnect.work.enrollment.getapplicantinfos_wsd_hk1.GetApplicantInfos2 getApplicantInfos2 = null;
	private static final String[][] GETAPPLICANTINFOS2_PROPERTY_BINDINGS = new String[][] {
		{"#{GetApplicantInfos2.authCredentials.authenticationMethod}", "1"},
		{"#{GetApplicantInfos2.authCredentials.requiresAuth}", "true"},
		{"#{GetApplicantInfos2.autoRefresh}", "true"},
	};
	/**
	 * Create new preferences bean with list of preference names
	 */
	public GetApplicantInfos() {
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

	public com.webmethods.caf.is.wsclient.campusconnect.work.enrollment.getapplicantinfos_wsd_hk1.GetApplicantInfos2 getGetApplicantInfos2()  {
		if (getApplicantInfos2 == null) {
		    getApplicantInfos2 = (com.webmethods.caf.is.wsclient.campusconnect.work.enrollment.getapplicantinfos_wsd_hk1.GetApplicantInfos2)resolveExpression("#{GetApplicantInfos2}");
		}
	
	    resolveDataBinding(GETAPPLICANTINFOS2_PROPERTY_BINDINGS, getApplicantInfos2, "getApplicantInfos2", false, false);
		return getApplicantInfos2;
	}
}