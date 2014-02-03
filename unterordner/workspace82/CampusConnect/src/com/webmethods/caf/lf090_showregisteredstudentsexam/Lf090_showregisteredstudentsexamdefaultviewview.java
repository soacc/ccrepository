/**
 * 
 */
package com.webmethods.caf.lf090_showregisteredstudentsexam;

/**
 * @author wir09cdz
 *
 */

public class Lf090_showregisteredstudentsexamdefaultviewview  extends   com.webmethods.caf.faces.bean.BasePageBean {

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
	private com.webmethods.caf.lf090_showregisteredstudentsexam.Lf090_showregisteredstudentsexam lf090_showregisteredstudentsexam = null;
	private static final String[][] LF090_SHOWREGISTEREDSTUDENTSEXAMPROVIDER_PROPERTY_BINDINGS = new String[][] {
		{"#{Lf090_showregisteredstudentsexamProvider.object}", "#{Lf090_showregisteredstudentsexamdefaultviewview.lf090_showregisteredstudentsexam}"},
	};
	private static final String[][] LF090_SHOWREGISTEREDSTUDENTSEXAMDEFAULTVIEWVIEWPROVIDER_PROPERTY_BINDINGS = new String[][] {
		{"#{Lf090_showregisteredstudentsexamdefaultviewviewProvider.object}", "#{Lf090_showregisteredstudentsexamdefaultviewview}"},
	};
	private com.webmethods.caf.faces.data.object.ELSelectItemProvider studentProvider = null;
	private static final String[][] STUDENTPROVIDER_PROPERTY_BINDINGS = new String[][] {
		{"#{StudentProvider.object}", "#{Lf090_showregisteredstudentsexamdefaultviewview.lf090_showregisteredstudentsexam.showRegisteredStudentsExam3.result.students.student}"},
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

	public com.webmethods.caf.lf090_showregisteredstudentsexam.Lf090_showregisteredstudentsexam getLf090_showregisteredstudentsexam()  {
		if (lf090_showregisteredstudentsexam == null) {
		    lf090_showregisteredstudentsexam = (com.webmethods.caf.lf090_showregisteredstudentsexam.Lf090_showregisteredstudentsexam)resolveExpression("#{Lf090_showregisteredstudentsexam}");
		}
		return lf090_showregisteredstudentsexam;
	}

	public com.webmethods.caf.faces.data.object.ELSelectItemProvider getStudentProvider()  {
		if (studentProvider == null) {
		    studentProvider = (com.webmethods.caf.faces.data.object.ELSelectItemProvider)resolveExpression("#{StudentProvider}");
		}
	
	    resolveDataBinding(STUDENTPROVIDER_PROPERTY_BINDINGS, studentProvider, "studentProvider", false, false);
		return studentProvider;
	}
	
}