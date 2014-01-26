/**
 * 
 */
package com.webmethods.caf.lf010_registercourses;

/**
 * @author wir09cdz
 *
 */

public class Lf010_registercoursesdefaultviewview  extends   com.webmethods.caf.faces.bean.BasePageBean {

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
	private com.webmethods.caf.lf010_registercourses.Lf010_registercourses lf010_registercourses = null;
	private static final String[][] INPUTCOURSESPROVIDER2_PROPERTY_BINDINGS = new String[][] {
		{"#{InputCoursesProvider2.rowType}", "java.lang.String"},
		{"#{InputCoursesProvider2.rowVariable}", "inputCourse"},
	};
	private static final String[][] LF010_REGISTERCOURSES_PROPERTY_BINDINGS = new String[][] {
		{"#{lf010_registercourses.studID}", "#{environment[\"wsclient-username\"]}"},
	};
	private static final String[][] INPUTCOURSESPROVIDER3_PROPERTY_BINDINGS = new String[][] {
		{"#{InputCoursesProvider3.rowType}", "java.lang.String"},
		{"#{InputCoursesProvider3.rowVariable}", "inputCourse"},
	};
	private static final String[][] REGISTERCOURSES_PROPERTY_BINDINGS = new String[][] {
		{"#{registerCourses.authCredentials.authenticationMethod}", "1"},
		{"#{registerCourses.authCredentials.requiresAuth}", "true"},
		{"#{registerCourses.autoRefresh}", "false"},
		{"#{registerCourses.parameters.registerCoursesInput.inputCourses}", "#{Lf010_registercoursesdefaultviewview.inputCoursesProvider3.array}"},
		{"#{registerCourses.parameters.registerCoursesInput.studId}", "#{Lf010_registercoursesdefaultviewview.lf010_registercourses.studID}"},
	};
	private com.webmethods.caf.faces.data.object.ListTableContentProvider inputCoursesProvider = null;
	private static final String[][] INPUTCOURSESPROVIDER_PROPERTY_BINDINGS = new String[][] {
		{"#{InputCoursesProvider.rowType}", "java.lang.String"},
		{"#{InputCoursesProvider.rowVariable}", "inputCourse"},
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

	public com.webmethods.caf.lf010_registercourses.Lf010_registercourses getLf010_registercourses()  {
		if (lf010_registercourses == null) {
		    lf010_registercourses = (com.webmethods.caf.lf010_registercourses.Lf010_registercourses)resolveExpression("#{Lf010_registercourses}");
		}
		return lf010_registercourses;
	}

	public com.webmethods.caf.faces.data.object.ListTableContentProvider getInputCoursesProvider()  {
		if (inputCoursesProvider == null) {
		    inputCoursesProvider = (com.webmethods.caf.faces.data.object.ListTableContentProvider)resolveExpression("#{InputCoursesProvider}");
		}
	
	    resolveDataBinding(INPUTCOURSESPROVIDER_PROPERTY_BINDINGS, inputCoursesProvider, "inputCoursesProvider", false, false);
		return inputCoursesProvider;
	}
	
}