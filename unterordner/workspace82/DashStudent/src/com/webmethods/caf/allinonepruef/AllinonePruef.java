/**
 * 
 */
package com.webmethods.caf.allinonepruef;

/**
 * @author wir09cdz
 *
 */

import javax.portlet.PortletPreferences;

public class AllinonePruef  extends   com.webmethods.caf.faces.bean.BaseFacesPreferencesBean {

	public static final String[] PREFERENCES_NAMES = new String[] {};
	private com.webmethods.caf.DashStudent dashStudent = null;
	
	/**
	 * Create new preferences bean with list of preference names
	 */
	public AllinonePruef() {
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

	public com.webmethods.caf.DashStudent getDashStudent()  {
		if (dashStudent == null) {
		    dashStudent = (com.webmethods.caf.DashStudent)resolveExpression("#{DashStudent}");
		}
		return dashStudent;
	}
}