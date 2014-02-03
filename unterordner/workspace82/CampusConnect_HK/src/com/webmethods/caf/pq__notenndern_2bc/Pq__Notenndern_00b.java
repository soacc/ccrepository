/**
 * 
 */
package com.webmethods.caf.pq__notenndern_2bc;

/**
 * @author wir09cdz
 *
 */

import javax.portlet.PortletPreferences;

public class Pq__Notenndern_00b  extends   com.webmethods.caf.faces.bean.BaseFacesPreferencesBean {

	public static final String[] PREFERENCES_NAMES = new String[] {};
	private com.webmethods.caf.CampusConnect_HK campusConnect_HK = null;
	private com.webmethods.caf.is.wsclient.campusconnect.work.gradesubmission.submitgrade_wsd_hk3.SubmitGrade1 submitGrade = null;
	private static final String[][] SUBMITGRADE_PROPERTY_BINDINGS = new String[][] {
		{"#{submitGrade.authCredentials.authenticationMethod}", "1"},
		{"#{submitGrade.authCredentials.requiresAuth}", "true"},
		{"#{submitGrade.autoRefresh}", "false"},
		{"#{submitGrade.parameters.submitGrade.studentsGrade}", "#{Pq__NotenndernDefaultviewView_0fe.studentsGradeProvider.array}"},
	};
	/**
	 * Create new preferences bean with list of preference names
	 */
	public Pq__Notenndern_00b() {
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

	public com.webmethods.caf.is.wsclient.campusconnect.work.gradesubmission.submitgrade_wsd_hk3.SubmitGrade1 getSubmitGrade()  {
		if (submitGrade == null) {
		    submitGrade = (com.webmethods.caf.is.wsclient.campusconnect.work.gradesubmission.submitgrade_wsd_hk3.SubmitGrade1)resolveExpression("#{SubmitGrade}");
		}
	
	    resolveDataBinding(SUBMITGRADE_PROPERTY_BINDINGS, submitGrade, "submitGrade", false, false);
		return submitGrade;
	}
}