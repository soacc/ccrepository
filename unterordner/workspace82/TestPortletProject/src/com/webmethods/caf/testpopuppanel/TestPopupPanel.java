/**
 * 
 */
package com.webmethods.caf.testpopuppanel;

/**
 * @author Viper
 *
 */

import javax.portlet.PortletPreferences;

public class TestPopupPanel  extends   com.webmethods.caf.faces.bean.BaseFacesPreferencesBean {

	public static final String[] PREFERENCES_NAMES = new String[] {};
	private transient com.webmethods.caf.TestPortletProject testPortletProject = null;
	
	/**
	 * Create new preferences bean with list of preference names
	 */
	public TestPopupPanel() {
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

	public com.webmethods.caf.TestPortletProject getTestPortletProject()  {
		if (testPortletProject == null) {
		    testPortletProject = (com.webmethods.caf.TestPortletProject)resolveExpression("#{TestPortletProject}");
		}
		return testPortletProject;
	}
}