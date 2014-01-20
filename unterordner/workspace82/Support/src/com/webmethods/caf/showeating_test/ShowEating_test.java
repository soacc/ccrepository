/**
 * 
 */
package com.webmethods.caf.showeating_test;

/**
 * @author wir09cdz
 *
 */

import javax.portlet.PortletPreferences;

public class ShowEating_test  extends   com.webmethods.caf.faces.bean.BaseFacesPreferencesBean {

	public static final String[] PREFERENCES_NAMES = new String[] {};
	private com.webmethods.caf.Support support = null;
	private com.webmethods.caf.is.wsclient.campusconnect.work.eating.showeating_wsd_hk1.ShowEating1 showEating = null;
	private static final String[][] SHOWEATING_PROPERTY_BINDINGS = new String[][] {
		{"#{showEating.authCredentials.authenticationMethod}", "1"},
		{"#{showEating.authCredentials.requiresAuth}", "true"},
		{"#{showEating.autoRefresh}", "true"},
		{"#{showEating.parameters.showEating.eatingplan_local}", "#{ShowEating_testDefaultviewView.eatingplan_localProvider.array}"},
	};
	/**
	 * Create new preferences bean with list of preference names
	 */
	public ShowEating_test() {
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

	public com.webmethods.caf.is.wsclient.campusconnect.work.eating.showeating_wsd_hk1.ShowEating1 getShowEating()  {
		if (showEating == null) {
		    showEating = (com.webmethods.caf.is.wsclient.campusconnect.work.eating.showeating_wsd_hk1.ShowEating1)resolveExpression("#{ShowEating}");
		}
	
	    resolveDataBinding(SHOWEATING_PROPERTY_BINDINGS, showEating, "showEating", false, false);
		return showEating;
	}
}