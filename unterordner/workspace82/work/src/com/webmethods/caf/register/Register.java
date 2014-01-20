/**
 * 
 */
package com.webmethods.caf.register;

/**
 * @author wir09cdz
 *
 */

import javax.portlet.PortletPreferences;

public class Register  extends   com.webmethods.caf.faces.bean.BaseFacesPreferencesBean {

	private com.webmethods.caf.Work work = null;
	private com.webmethods.caf.is.wsclient.campusconnect.work.courseregistration.registercourses_wsd.RegisterCourses2 registerCourses2 = null;
	/**
	 * List of portlet preference names
	 */
	public static final String[] PREFERENCES_NAMES = new String[] {
		"Course", "StudID"
	};
	private static final String[][] REGISTERCOURSES2_PROPERTY_BINDINGS = new String[][] {
		{"#{registerCourses2.authCredentials.authenticationMethod}", "1"},
		{"#{registerCourses2.authCredentials.requiresAuth}", "true"},
		{"#{registerCourses2.autoRefresh}", "false"},
		{"#{registerCourses2.parameters.registerCoursesInput.inputCourses}", "#{RegisterDefaultviewView.register.course}"},
		{"#{registerCourses2.parameters.registerCoursesInput.studId}", "#{RegisterDefaultviewView.register.studID}"},
	};
	/**
	 * Create new preferences bean with list of preference names
	 */
	public Register() {
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

	public com.webmethods.caf.Work getWork()  {
		if (work == null) {
		    work = (com.webmethods.caf.Work)resolveExpression("#{Work}");
		}
		return work;
	}

	public com.webmethods.caf.is.wsclient.campusconnect.work.courseregistration.registercourses_wsd.RegisterCourses2 getRegisterCourses2()  {
		if (registerCourses2 == null) {
		    registerCourses2 = (com.webmethods.caf.is.wsclient.campusconnect.work.courseregistration.registercourses_wsd.RegisterCourses2)resolveExpression("#{RegisterCourses2}");
		}
	
	    resolveDataBinding(REGISTERCOURSES2_PROPERTY_BINDINGS, registerCourses2, "registerCourses2", false, false);
		return registerCourses2;
	}

	/**
	 * The algorithm for this 'smart' preference getter is:
	 * 1) Check the Request Map (skip this step if it isn't a 'smart' preference)
	 * 2) Check the Member variable
	 * 3) Fall back to the PortletPreferences
	 */
	public String getCourse() throws Exception {
		return (String) getPreferenceValue("Course", String.class);
	}

	/**
	 * Invoke {@link #storePreferences} to persist these changes
	 */
	public void setCourse(String course) throws Exception {
		setPreferenceValue("Course", course);
	}

	/**
	 * The algorithm for this 'smart' preference getter is:
	 * 1) Check the Request Map (skip this step if it isn't a 'smart' preference)
	 * 2) Check the Member variable
	 * 3) Fall back to the PortletPreferences
	 */
	public String getStudID() throws Exception {
		return (String) getPreferenceValue("StudID", String.class);
	}

	/**
	 * Invoke {@link #storePreferences} to persist these changes
	 */
	public void setStudID(String studID) throws Exception {
		setPreferenceValue("StudID", studID);
	}
}