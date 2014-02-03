/**
 * 
 */
package com.webmethods.caf.lf070_editstudent2;

/**
 * @author wir09cdz
 *
 */

import javax.portlet.PortletPreferences;

public class Lf070_editstudent2  extends   com.webmethods.caf.faces.bean.BaseFacesPreferencesBean {

	private com.webmethods.caf.CampusConnect campusConnect = null;
	private com.webmethods.caf.is.wsclient.campusconnect.work.administration.editstudent2_wsd_hk1.EditStudent21 editStudent2 = null;
	/**
	 * List of portlet preference names
	 */
	public static final String[] PREFERENCES_NAMES = new String[] {
		"StudID", "Hidden"
	};
	private static final String[][] EDITSTUDENT2_PROPERTY_BINDINGS = new String[][] {
		{"#{editStudent2.authCredentials.authenticationMethod}", "1"},
		{"#{editStudent2.authCredentials.requiresAuth}", "true"},
		{"#{editStudent2.autoRefresh}", "false"},
		{"#{editStudent2.parameters.editStudent2._STUDENTID}", "#{Lf070_editstudent2defaultviewview.lf070_editstudent2.studID}"},
	};
	/**
	 * Create new preferences bean with list of preference names
	 */
	public Lf070_editstudent2() {
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

	public com.webmethods.caf.is.wsclient.campusconnect.work.administration.editstudent2_wsd_hk1.EditStudent21 getEditStudent2()  {
		if (editStudent2 == null) {
		    editStudent2 = (com.webmethods.caf.is.wsclient.campusconnect.work.administration.editstudent2_wsd_hk1.EditStudent21)resolveExpression("#{EditStudent2}");
		}
	
	    resolveDataBinding(EDITSTUDENT2_PROPERTY_BINDINGS, editStudent2, "editStudent2", false, false);
		return editStudent2;
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

	/**
	 * The algorithm for this 'smart' preference getter is:
	 * 1) Check the Request Map (skip this step if it isn't a 'smart' preference)
	 * 2) Check the Member variable
	 * 3) Fall back to the PortletPreferences
	 */
	public String getHidden() throws Exception {
		return (String) getPreferenceValue("Hidden", String.class);
	}

	/**
	 * Invoke {@link #storePreferences} to persist these changes
	 */
	public void setHidden(String hidden) throws Exception {
		setPreferenceValue("Hidden", hidden);
	}
}