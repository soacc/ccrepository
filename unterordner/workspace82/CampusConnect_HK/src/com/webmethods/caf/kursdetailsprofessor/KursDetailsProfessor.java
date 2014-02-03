/**
 * 
 */
package com.webmethods.caf.kursdetailsprofessor;

/**
 * @author wir09cdz
 *
 */

import javax.portlet.PortletPreferences;

public class KursDetailsProfessor  extends   com.webmethods.caf.faces.bean.BaseFacesPreferencesBean {

	private com.webmethods.caf.CampusConnect_HK campusConnect_HK = null;
	private com.webmethods.caf.is.wsclient.campusconnect.utils.courses.listcoursessingleprof_wsd_hk1.ListCoursesSingleProf2 listCoursesSingleProf2 = null;
	private com.webmethods.caf.is.wsclient.campusconnect.work.gradesubmission.showregisteredstudentsexam_wsd_hk1.ShowRegisteredStudentsExam3 showRegisteredStudentsExam3 = null;
	private static final String[][] LISTCOURSESSINGLEPROF2_PROPERTY_BINDINGS = new String[][] {
		{"#{listCoursesSingleProf2.authCredentials.authenticationMethod}", "1"},
		{"#{listCoursesSingleProf2.authCredentials.requiresAuth}", "true"},
		{"#{listCoursesSingleProf2.autoRefresh}", "true"},
		{"#{listCoursesSingleProf2.parameters.listCoursesSingleProf.profId}", "#{KursDetailsProfessorDefaultviewView.kursDetailsProfessor.profID}"},
	};
	private static final String[][] SHOWREGISTEREDSTUDENTSEXAM3_PROPERTY_BINDINGS = new String[][] {
		{"#{showRegisteredStudentsExam3.authCredentials.authenticationMethod}", "1"},
		{"#{showRegisteredStudentsExam3.authCredentials.requiresAuth}", "true"},
		{"#{showRegisteredStudentsExam3.autoRefresh}", "false"},
		{"#{showRegisteredStudentsExam3.parameters.showRegisteredStudentsExam.examId}", "#{KursDetailsProfessorDefaultviewView.kursDetailsProfessor.courseID}"},
	};
	private static final String[][] EXAMIDSET_PROPERTY_BINDINGS = new String[][] {
		{"#{KursDetailsProfessorDefaultviewView.kursDetailsProfessor.courseID}", "#{course._COURSEID}"},
		{"#{KursDetailsProfessorDefaultviewView.kursDetailsProfessor.showRegisteredStudentsExam3.refresh}", null},
	};
	/**
	 * List of portlet preference names
	 */
	public static final String[] PREFERENCES_NAMES = new String[] {
		"ProfID", "CourseID", "StudID", "Grade"
	};
	private com.webmethods.caf.is.wsclient.campusconnect.work.gradesubmission.submitgrade_wsd_hk3.SubmitGrade2 submitGrade2 = null;
	private static final String[][] STUDIDSET_PROPERTY_BINDINGS = new String[][] {
		{"#{KursDetailsProfessorDefaultviewView.kursDetailsProfessor.studID}", "#{student._STUDENTID}"},
	};
	private static final String[][] SUBMITGRADE2_PROPERTY_BINDINGS = new String[][] {
		{"#{submitGrade2.authCredentials.authenticationMethod}", "1"},
		{"#{submitGrade2.authCredentials.requiresAuth}", "true"},
		{"#{submitGrade2.autoRefresh}", "false"},
		{"#{submitGrade2.parameters.submitGrade.studentId}", "#{KursDetailsProfessorDefaultviewView.kursDetailsProfessor.studID}"},
		{"#{submitGrade2.parameters.submitGrade.courseId}", "#{KursDetailsProfessorDefaultviewView.kursDetailsProfessor.courseID}"},
	};
	private static final String[][] NOTEGEBEN_PROPERTY_BINDINGS = new String[][] {
		{"#{KursDetailsProfessorDefaultviewView.kursDetailsProfessor.submitGrade2.refresh}", null},
		{"#{KursDetailsProfessorDefaultviewView.kursDetailsProfessor.showRegisteredStudentsExam3.refresh}", null},
	};
	/**
	 * Create new preferences bean with list of preference names
	 */
	public KursDetailsProfessor() {
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

	public com.webmethods.caf.is.wsclient.campusconnect.utils.courses.listcoursessingleprof_wsd_hk1.ListCoursesSingleProf2 getListCoursesSingleProf2()  {
		if (listCoursesSingleProf2 == null) {
		    listCoursesSingleProf2 = (com.webmethods.caf.is.wsclient.campusconnect.utils.courses.listcoursessingleprof_wsd_hk1.ListCoursesSingleProf2)resolveExpression("#{ListCoursesSingleProf2}");
		}
	
	    resolveDataBinding(LISTCOURSESSINGLEPROF2_PROPERTY_BINDINGS, listCoursesSingleProf2, "listCoursesSingleProf2", false, false);
		return listCoursesSingleProf2;
	}

	public com.webmethods.caf.is.wsclient.campusconnect.work.gradesubmission.showregisteredstudentsexam_wsd_hk1.ShowRegisteredStudentsExam3 getShowRegisteredStudentsExam3()  {
		if (showRegisteredStudentsExam3 == null) {
		    showRegisteredStudentsExam3 = (com.webmethods.caf.is.wsclient.campusconnect.work.gradesubmission.showregisteredstudentsexam_wsd_hk1.ShowRegisteredStudentsExam3)resolveExpression("#{ShowRegisteredStudentsExam3}");
		}
	
	    resolveDataBinding(SHOWREGISTEREDSTUDENTSEXAM3_PROPERTY_BINDINGS, showRegisteredStudentsExam3, "showRegisteredStudentsExam3", false, false);
		return showRegisteredStudentsExam3;
	}

	/**
	 * The algorithm for this 'smart' preference getter is:
	 * 1) Check the Request Map (skip this step if it isn't a 'smart' preference)
	 * 2) Check the Member variable
	 * 3) Fall back to the PortletPreferences
	 */
	public String getProfID() throws Exception {
		return (String) getPreferenceValue("ProfID", String.class);
	}

	/**
	 * Invoke {@link #storePreferences} to persist these changes
	 */
	public void setProfID(String profID) throws Exception {
		setPreferenceValue("ProfID", profID);
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

	public String examIDSet() {
	    resolveDataBinding(EXAMIDSET_PROPERTY_BINDINGS, this, "examIDSet.this", true, false);
		return OUTCOME_OK;
	}

	public String studIDSet() {
	    resolveDataBinding(STUDIDSET_PROPERTY_BINDINGS, this, "studIDSet.this", true, false);
		return OUTCOME_OK;
	}

	/**
	 * The algorithm for this 'smart' preference getter is:
	 * 1) Check the Request Map (skip this step if it isn't a 'smart' preference)
	 * 2) Check the Member variable
	 * 3) Fall back to the PortletPreferences
	 */
	public String getGrade() throws Exception {
		return (String) getPreferenceValue("Grade", String.class);
	}

	/**
	 * Invoke {@link #storePreferences} to persist these changes
	 */
	public void setGrade(String grade) throws Exception {
		setPreferenceValue("Grade", grade);
	}

	public String noteGeben() {
	    resolveDataBinding(NOTEGEBEN_PROPERTY_BINDINGS, this, "noteGeben.this", true, false);
		return OUTCOME_OK;
	}

	public com.webmethods.caf.is.wsclient.campusconnect.work.gradesubmission.submitgrade_wsd_hk3.SubmitGrade2 getSubmitGrade2()  {
		if (submitGrade2 == null) {
		    submitGrade2 = (com.webmethods.caf.is.wsclient.campusconnect.work.gradesubmission.submitgrade_wsd_hk3.SubmitGrade2)resolveExpression("#{SubmitGrade2}");
		}
	
	    resolveDataBinding(SUBMITGRADE2_PROPERTY_BINDINGS, submitGrade2, "submitGrade2", false, false);
		return submitGrade2;
	}
}