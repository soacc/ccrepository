/**
 * 
 */
package com.webmethods.caf.lf090_submitgrade;

/**
 * @author wir09cdz
 *
 */

import javax.portlet.PortletPreferences;

public class Lf090_submitgrade  extends   com.webmethods.caf.faces.bean.BaseFacesPreferencesBean {

	public static final String[] PREFERENCES_NAMES = new String[] {};
	private com.webmethods.caf.CampusConnect campusConnect = null;
	
	/**
	 * Create new preferences bean with list of preference names
	 */
	public Lf090_submitgrade() {
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
}