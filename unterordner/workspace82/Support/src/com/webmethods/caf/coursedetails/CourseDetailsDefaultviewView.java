/**
 * 
 */
package com.webmethods.caf.coursedetails;

/**
 * @author wir09cdz
 *
 */

public class CourseDetailsDefaultviewView  extends   com.webmethods.caf.faces.bean.BasePageBean {

	/**
	 * Determines if a de-serialized file is compatible with this class.
	 *
	 * Maintainers must change this value if and only if the new version
	 * of this class is not compatible with old versions. See Sun docs
	 * for <a href=http://java.sun.com/j2se/1.5.0/docs/guide/serialization/spec/version.html> 
	 * details. </a>
	 */
	private static final long serialVersionUID = 1L;
	private static final String[][] INITIALIZE_PROPERTY_BINDINGS = new String[][] {
	};
	private com.webmethods.caf.coursedetails.CourseDetails courseDetails = null;
	private com.webmethods.caf.is.wsclient.campusconnect.utils.exams.getexamfromcourse_wsd_hk1.GetExamFromCourse3 getExamFromCourse3 = null;
	private static final String[][] GETEXAMFROMCOURSE3_PROPERTY_BINDINGS = new String[][] {
		{"#{getExamFromCourse3.authCredentials.authenticationMethod}", "1"},
		{"#{getExamFromCourse3.authCredentials.requiresAuth}", "true"},
		{"#{getExamFromCourse3.autoRefresh}", "true"},
		{"#{getExamFromCourse3.parameters.getExamFromCourse.courseId}", "#{CourseDetailsDefaultviewView.courseDetails.courseID}"},
	};
	/**
	 * Initialize page
	 */
	public String initialize() {
		try {
		    resolveDataBinding(INITIALIZE_PROPERTY_BINDINGS, null, "initialize", true, false);

			return OUTCOME_OK;
		} catch (Exception e) {
			error(e);
			log(e);
			return OUTCOME_ERROR; 
		}	
	}

	public com.webmethods.caf.coursedetails.CourseDetails getCourseDetails()  {
		if (courseDetails == null) {
		    courseDetails = (com.webmethods.caf.coursedetails.CourseDetails)resolveExpression("#{CourseDetails}");
		}
		return courseDetails;
	}

	public com.webmethods.caf.is.wsclient.campusconnect.utils.exams.getexamfromcourse_wsd_hk1.GetExamFromCourse3 getGetExamFromCourse3()  {
		if (getExamFromCourse3 == null) {
		    getExamFromCourse3 = (com.webmethods.caf.is.wsclient.campusconnect.utils.exams.getexamfromcourse_wsd_hk1.GetExamFromCourse3)resolveExpression("#{GetExamFromCourse3}");
		}
	
	    resolveDataBinding(GETEXAMFROMCOURSE3_PROPERTY_BINDINGS, getExamFromCourse3, "getExamFromCourse3", false, false);
		return getExamFromCourse3;
	}
	
}