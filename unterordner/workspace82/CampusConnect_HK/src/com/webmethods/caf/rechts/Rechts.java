/**
 * 
 */
package com.webmethods.caf.rechts;

/**
 * @author wir09cdz
 *
 */

import javax.portlet.PortletPreferences;

public class Rechts  extends   com.webmethods.caf.faces.bean.BaseFacesPreferencesBean {

	private com.webmethods.caf.CampusConnect_HK campusConnect_HK = null;
	/**
	 * List of portlet preference names
	 */
	public static final String[] PREFERENCES_NAMES = new String[] {
		"Var"
	};
	private com.webmethods.caf.links.Links links = null;
	private static final String[][] LINKS_PROPERTY_BINDINGS = new String[][] {
	};
	/**
	 * Create new preferences bean with list of preference names
	 */
	public Rechts() {
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

	public com.webmethods.caf.links.Links getLinks()  {
		if (links == null) {
		    links = (com.webmethods.caf.links.Links)resolveExpression("#{Links}");
		}
	
	    resolveDataBinding(LINKS_PROPERTY_BINDINGS, links, "links", false, false);
		return links;
	}
}