/**
 * 
 */
package com.webmethods.caf.submitgrade;

/**
 * @author wir09cdz
 *
 */

import javax.portlet.PortletPreferences;

public class SubmitGrade3  extends   com.webmethods.caf.faces.bean.BaseFacesPreferencesBean {

	public static final String[] PREFERENCES_NAMES = new String[] {};
	private com.webmethods.caf.CampusConnect_HK campusConnect_HK = null;
	
	/**
	 * Create new preferences bean with list of preference names
	 */
	public SubmitGrade3() {
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

	public com.webmethods.caf.CampusConnect_HK getCampusConnect_HK()  {
		if (campusConnect_HK == null) {
		    campusConnect_HK = (com.webmethods.caf.CampusConnect_HK)resolveExpression("#{CampusConnect_HK}");
		}
		return campusConnect_HK;
	}
}