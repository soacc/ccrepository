/**
 * 
 */
package com.webmethods.caf.links;

/**
 * @author wir09cdz
 *
 */

import javax.portlet.PortletPreferences;

public class Links  extends   com.webmethods.caf.faces.bean.BaseFacesPreferencesBean {

	private com.webmethods.caf.CampusConnect_HK campusConnect_HK = null;
	private java.lang.String property;
	/**
	 * List of portlet preference names
	 */
	public static final String[] PREFERENCES_NAMES = new String[] {
		"Var", "var1"
	};
	private static final String[][] ACTION_PROPERTY_BINDINGS = new String[][] {
		{"#{LinksDefaultviewView.links.var}", "#{LinksDefaultviewView.links.var1}"},
	};
	/**
	 * Create new preferences bean with list of preference names
	 */
	public Links() {
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

	/**
	 * The algorithm for this 'smart' preference getter is:
	 * 1) Check the Request Map (skip this step if it isn't a 'smart' preference)
	 * 2) Check the Member variable
	 * 3) Fall back to the PortletPreferences
	 */
	public String getVar() throws Exception {
		return (String) getPreferenceValue("Var", String.class);
	}

	/**
	 * Invoke {@link #storePreferences} to persist these changes
	 */
	public void setVar(String var) throws Exception {
		setPreferenceValue("Var", var);
	}

	public java.lang.String getProperty()  {
		
		return property;
	}

	public String action() {
	    resolveDataBinding(ACTION_PROPERTY_BINDINGS, this, "action.this", true, false);
		return OUTCOME_OK;
	}

	/**
	 * The algorithm for this 'smart' preference getter is:
	 * 1) Check the Request Map (skip this step if it isn't a 'smart' preference)
	 * 2) Check the Member variable
	 * 3) Fall back to the PortletPreferences
	 */
	public String getVar1() throws Exception {
		return (String) getPreferenceValue("var1", String.class);
	}

	/**
	 * Invoke {@link #storePreferences} to persist these changes
	 */
	public void setVar1(String var1) throws Exception {
		setPreferenceValue("var1", var1);
	}
}