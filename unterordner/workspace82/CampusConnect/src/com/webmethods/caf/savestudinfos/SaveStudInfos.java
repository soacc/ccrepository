/**
 * 
 */
package com.webmethods.caf.savestudinfos;

/**
 * @author wir09cdz
 *
 */

import javax.portlet.PortletPreferences;

public class SaveStudInfos  extends   com.webmethods.caf.faces.bean.BaseFacesPreferencesBean {

	public static final String[] PREFERENCES_NAMES = new String[] {};
	private com.webmethods.caf.CampusConnect campusConnect = null;
	private com.webmethods.caf.is.wsclient.campusconnect.work.enrollment.savestudinfos_wsd_hk2.SaveStudInfos3 saveStudInfos3 = null;
	private static final String[][] SAVESTUDINFOS3_PROPERTY_BINDINGS = new String[][] {
		{"#{saveStudInfos3.authCredentials.authenticationMethod}", "1"},
		{"#{saveStudInfos3.authCredentials.requiresAuth}", "true"},
		{"#{saveStudInfos3.autoRefresh}", "true"},
		{"#{saveStudInfos3.parameters.saveStudInfos.studDetails.documents}", "#{SaveStudInfosDefaultviewView.documentsProvider2.array}"},
	};
	/**
	 * Create new preferences bean with list of preference names
	 */
	public SaveStudInfos() {
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

	public com.webmethods.caf.is.wsclient.campusconnect.work.enrollment.savestudinfos_wsd_hk2.SaveStudInfos3 getSaveStudInfos3()  {
		if (saveStudInfos3 == null) {
		    saveStudInfos3 = (com.webmethods.caf.is.wsclient.campusconnect.work.enrollment.savestudinfos_wsd_hk2.SaveStudInfos3)resolveExpression("#{SaveStudInfos3}");
		}
	
	    resolveDataBinding(SAVESTUDINFOS3_PROPERTY_BINDINGS, saveStudInfos3, "saveStudInfos3", false, false);
		return saveStudInfos3;
	}
}