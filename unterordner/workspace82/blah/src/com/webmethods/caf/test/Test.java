/**
 * 
 */
package com.webmethods.caf.test;

/**
 * @author wir09cdz
 *
 */

import javax.portlet.PortletPreferences;

public class Test  extends   com.webmethods.caf.faces.bean.BaseFacesPreferencesBean {

	public static final String[] PREFERENCES_NAMES = new String[] {};
	private com.webmethods.caf.Blah blah = null;
	
	/**
	 * Create new preferences bean with list of preference names
	 */
	public Test() {
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

	public com.webmethods.caf.Blah getBlah()  {
		if (blah == null) {
		    blah = (com.webmethods.caf.Blah)resolveExpression("#{Blah}");
		}
		return blah;
	}
}