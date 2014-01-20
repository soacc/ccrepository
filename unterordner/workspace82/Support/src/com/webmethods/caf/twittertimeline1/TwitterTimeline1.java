/**
 * 
 */
package com.webmethods.caf.twittertimeline1;

/**
 * @author wir09cdz
 *
 */

import javax.portlet.PortletPreferences;

public class TwitterTimeline1  extends   com.webmethods.caf.faces.bean.BaseFacesPreferencesBean {

	public static final String[] PREFERENCES_NAMES = new String[] {};
	private com.webmethods.caf.Support support = null;
	
	/**
	 * Create new preferences bean with list of preference names
	 */
	public TwitterTimeline1() {
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

	public com.webmethods.caf.Support getSupport()  {
		if (support == null) {
		    support = (com.webmethods.caf.Support)resolveExpression("#{Support}");
		}
		return support;
	}
}