/**
 * 
 */
package com.webmethods.caf.lf070_savepersonaldata;

/**
 * @author wir09cdz
 *
 */

import javax.portlet.PortletPreferences;

public class Lf070_savepersonaldata  extends   com.webmethods.caf.faces.bean.BaseFacesPreferencesBean {

	private com.webmethods.caf.CampusConnect campusConnect = null;
	private com.webmethods.caf.is.wsclient.campusconnect.work.editpersonaldatastud.savepersonaldatastudwsd.SavePersonalDataStud1 savePersonalDataStud = null;
	/**
	 * List of portlet preference names
	 */
	public static final String[] PREFERENCES_NAMES = new String[] {
		"StudID"
	};
	private static final String[][] SAVEPERSONALDATASTUD_PROPERTY_BINDINGS = new String[][] {
		{"#{savePersonalDataStud.authCredentials.authenticationMethod}", "1"},
		{"#{savePersonalDataStud.authCredentials.requiresAuth}", "true"},
		{"#{savePersonalDataStud.autoRefresh}", "false"},
		{"#{savePersonalDataStud.parameters.savePersonalDataStud.studInfo.studId}", "#{Lf070_savepersonaldatadefaultviewview.lf070_savepersonaldata.studID}"},
	};
	/**
	 * Create new preferences bean with list of preference names
	 */
	public Lf070_savepersonaldata() {
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

	public com.webmethods.caf.is.wsclient.campusconnect.work.editpersonaldatastud.savepersonaldatastudwsd.SavePersonalDataStud1 getSavePersonalDataStud()  {
		if (savePersonalDataStud == null) {
		    savePersonalDataStud = (com.webmethods.caf.is.wsclient.campusconnect.work.editpersonaldatastud.savepersonaldatastudwsd.SavePersonalDataStud1)resolveExpression("#{SavePersonalDataStud}");
		}
	
	    resolveDataBinding(SAVEPERSONALDATASTUD_PROPERTY_BINDINGS, savePersonalDataStud, "savePersonalDataStud", false, false);
		return savePersonalDataStud;
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