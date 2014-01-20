/**
 * 
 */
package com.webmethods.caf.lf070_savepersonaldatastud;

/**
 * @author wir09cdz
 *
 */

import javax.portlet.PortletPreferences;

public class Lf070_savepersonaldatastud  extends   com.webmethods.caf.faces.bean.BaseFacesPreferencesBean {

	private com.webmethods.caf.CampusConnect campusConnect = null;
	private com.webmethods.caf.is.wsclient.campusconnect.work.editpersonaldatastud.savepersonaldatastud_wsd_hk1.SavePersonalDataStud2 savePersonalDataStud2 = null;
	/**
	 * List of portlet preference names
	 */
	public static final String[] PREFERENCES_NAMES = new String[] {
		"StudID"
	};
	private static final String[][] SAVEPERSONALDATASTUD2_PROPERTY_BINDINGS = new String[][] {
		{"#{savePersonalDataStud2.authCredentials.authenticationMethod}", "1"},
		{"#{savePersonalDataStud2.authCredentials.requiresAuth}", "true"},
		{"#{savePersonalDataStud2.autoRefresh}", "true"},
		{"#{savePersonalDataStud2.parameters.savePersonalDataStud.studInfo.studId}", "#{Lf070_savepersonaldatastuddefaultviewview.lf070_savepersonaldatastud.studID}"},
	};
	/**
	 * Create new preferences bean with list of preference names
	 */
	public Lf070_savepersonaldatastud() {
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

	public com.webmethods.caf.is.wsclient.campusconnect.work.editpersonaldatastud.savepersonaldatastud_wsd_hk1.SavePersonalDataStud2 getSavePersonalDataStud2()  {
		if (savePersonalDataStud2 == null) {
		    savePersonalDataStud2 = (com.webmethods.caf.is.wsclient.campusconnect.work.editpersonaldatastud.savepersonaldatastud_wsd_hk1.SavePersonalDataStud2)resolveExpression("#{SavePersonalDataStud2}");
		}
	
	    resolveDataBinding(SAVEPERSONALDATASTUD2_PROPERTY_BINDINGS, savePersonalDataStud2, "savePersonalDataStud2", false, false);
		return savePersonalDataStud2;
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