/**
 * 
 */
package com.webmethods.caf.lf010_deregistercourses;

/**
 * @author wir09cdz
 *
 */

public class Lf010_deregistercoursesdefaultviewview  extends   com.webmethods.caf.faces.bean.BasePageBean {

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
	private com.webmethods.caf.lf010_deregistercourses.Lf010_deregistercourses lf010_deregistercourses = null;
	private com.webmethods.caf.is.wsclient.campusconnect.work.coursederegistration.deregistercourses_wsd.DeregisterCourses1 deregisterCourses = null;
	private com.webmethods.caf.faces.data.object.ListTableContentProvider courseIdsProvider = null;
	private static final String[][] COURSEIDSPROVIDER_PROPERTY_BINDINGS = new String[][] {
		{"#{CourseIdsProvider.rowType}", "java.lang.String"},
		{"#{CourseIdsProvider.rowVariable}", "courseId"},
	};
	private static final String[][] DEREGISTERCOURSES_PROPERTY_BINDINGS = new String[][] {
		{"#{deregisterCourses.authCredentials.authenticationMethod}", "1"},
		{"#{deregisterCourses.authCredentials.requiresAuth}", "true"},
		{"#{deregisterCourses.autoRefresh}", "false"},
		{"#{deregisterCourses.parameters.deregisterCourses.courseIds}", "#{Lf010_deregistercoursesdefaultviewview.lf010_deregistercourses.courseID}"},
		{"#{deregisterCourses.parameters.deregisterCourses.studId}", "#{Lf010_deregistercoursesdefaultviewview.lf010_deregistercourses.studID}"},
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

	public com.webmethods.caf.lf010_deregistercourses.Lf010_deregistercourses getLf010_deregistercourses()  {
		if (lf010_deregistercourses == null) {
		    lf010_deregistercourses = (com.webmethods.caf.lf010_deregistercourses.Lf010_deregistercourses)resolveExpression("#{Lf010_deregistercourses}");
		}
		return lf010_deregistercourses;
	}

	public com.webmethods.caf.is.wsclient.campusconnect.work.coursederegistration.deregistercourses_wsd.DeregisterCourses1 getDeregisterCourses()  {
		if (deregisterCourses == null) {
		    deregisterCourses = (com.webmethods.caf.is.wsclient.campusconnect.work.coursederegistration.deregistercourses_wsd.DeregisterCourses1)resolveExpression("#{DeregisterCourses}");
		}
	
	    resolveDataBinding(DEREGISTERCOURSES_PROPERTY_BINDINGS, deregisterCourses, "deregisterCourses", false, false);
		return deregisterCourses;
	}

	public com.webmethods.caf.faces.data.object.ListTableContentProvider getCourseIdsProvider()  {
		if (courseIdsProvider == null) {
		    courseIdsProvider = (com.webmethods.caf.faces.data.object.ListTableContentProvider)resolveExpression("#{CourseIdsProvider}");
		}
	
	    resolveDataBinding(COURSEIDSPROVIDER_PROPERTY_BINDINGS, courseIdsProvider, "courseIdsProvider", false, false);
		return courseIdsProvider;
	}
	
}