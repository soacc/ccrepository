/**
 * 
 */
package com.webmethods.caf.setapplicantinfos;

/**
 * @author wir09cdz
 *
 */

import javax.portlet.PortletPreferences;

public class SetApplicantInfos  extends   com.webmethods.caf.faces.bean.BaseFacesPreferencesBean {

	public static final String[] PREFERENCES_NAMES = new String[] {};
	private com.webmethods.caf.CampusConnect campusConnect = null;
	private com.webmethods.caf.is.wsclient.campusconnect.work.enrollment.setapplicantinfos_wsd_hk1.SetApplicantInfos2 setApplicantInfos2 = null;
	private static final String[][] SETAPPLICANTINFOS2_PROPERTY_BINDINGS = new String[][] {
		{"#{setApplicantInfos2.authCredentials.authenticationMethod}", "1"},
		{"#{setApplicantInfos2.authCredentials.requiresAuth}", "true"},
		{"#{setApplicantInfos2.autoRefresh}", "false"},
		{"#{setApplicantInfos2.parameters.setApplicantInfos.student.enrollment.documents}", "#{SetApplicantInfosDefaultviewView.documentsProvider.array}"},
	};
	/**
	 * Create new preferences bean with list of preference names
	 */
	public SetApplicantInfos() {
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

	public com.webmethods.caf.is.wsclient.campusconnect.work.enrollment.setapplicantinfos_wsd_hk1.SetApplicantInfos2 getSetApplicantInfos2()  {
		if (setApplicantInfos2 == null) {
		    setApplicantInfos2 = (com.webmethods.caf.is.wsclient.campusconnect.work.enrollment.setapplicantinfos_wsd_hk1.SetApplicantInfos2)resolveExpression("#{SetApplicantInfos2}");
		}
	
	    resolveDataBinding(SETAPPLICANTINFOS2_PROPERTY_BINDINGS, setApplicantInfos2, "setApplicantInfos2", false, false);
		return setApplicantInfos2;
	}
}