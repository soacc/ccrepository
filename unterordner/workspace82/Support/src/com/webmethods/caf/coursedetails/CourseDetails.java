/**
 * 
 */
package com.webmethods.caf.coursedetails;

/**
 * @author wir09cdz
 *
 */

import javax.portlet.PortletPreferences;

public class CourseDetails  extends   com.webmethods.caf.faces.bean.BaseFacesPreferencesBean {

	private com.webmethods.caf.Support support = null;
	private com.webmethods.caf.is.wsclient.campusconnect.utils.courses.getcoursedetails_wsd_hk1.GetCourseDetails1 getCourseDetails = null;
	/**
	 * List of portlet preference names
	 */
	public static final String[] PREFERENCES_NAMES = new String[] {
		"CourseID"
	};
	private static final String[][] GETCOURSEDETAILS_PROPERTY_BINDINGS = new String[][] {
		{"#{getCourseDetails.authCredentials.authenticationMethod}", "1"},
		{"#{getCourseDetails.authCredentials.requiresAuth}", "true"},
		{"#{getCourseDetails.autoRefresh}", "true"},
		{"#{getCourseDetails.parameters.getCourseDetails.id}", "#{CourseDetailsDefaultviewView.courseDetails.courseID}"},
	};
	/**
	 * Create new preferences bean with list of preference names
	 */
	public CourseDetails() {
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

	public com.webmethods.caf.is.wsclient.campusconnect.utils.courses.getcoursedetails_wsd_hk1.GetCourseDetails1 getGetCourseDetails()  {
		if (getCourseDetails == null) {
		    getCourseDetails = (com.webmethods.caf.is.wsclient.campusconnect.utils.courses.getcoursedetails_wsd_hk1.GetCourseDetails1)resolveExpression("#{GetCourseDetails}");
		}
	
	    resolveDataBinding(GETCOURSEDETAILS_PROPERTY_BINDINGS, getCourseDetails, "getCourseDetails", false, false);
		return getCourseDetails;
	}

	/**
	 * The algorithm for this 'smart' preference getter is:
	 * 1) Check the Request Map (skip this step if it isn't a 'smart' preference)
	 * 2) Check the Member variable
	 * 3) Fall back to the PortletPreferences
	 */
	public String getCourseID() throws Exception {
		return (String) getPreferenceValue("CourseID", String.class);
	}

	/**
	 * Invoke {@link #storePreferences} to persist these changes
	 */
	public void setCourseID(String courseID) throws Exception {
		setPreferenceValue("CourseID", courseID);
	}
}