/**
 * 
 */
package com.webmethods.caf.pq__notenndern_2bc;

/**
 * @author wir09cdz
 *
 */

public class Pq__NotenndernDefaultviewView_0fe  extends   com.webmethods.caf.faces.bean.BasePageBean {

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
	private com.webmethods.caf.pq__notenndern_2bc.Pq__Notenndern_00b pq__Notenndern_00b = null;
	private com.webmethods.caf.faces.data.object.ListTableContentProvider studentsGradeProvider = null;
	private static final String[][] STUDENTSGRADEPROVIDER_PROPERTY_BINDINGS = new String[][] {
		{"#{StudentsGradeProvider.rowType}", "com.webmethods.caf.is.wsclient.campusconnect.work.gradesubmission.submitgrade_wsd_hk3.StudentsGrade"},
		{"#{StudentsGradeProvider.rowVariable}", "studentsGrade"},
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

	public com.webmethods.caf.pq__notenndern_2bc.Pq__Notenndern_00b getPq__Notenndern_00b()  {
		if (pq__Notenndern_00b == null) {
		    pq__Notenndern_00b = (com.webmethods.caf.pq__notenndern_2bc.Pq__Notenndern_00b)resolveExpression("#{Pq__Notenndern_00b}");
		}
		return pq__Notenndern_00b;
	}

	public com.webmethods.caf.faces.data.object.ListTableContentProvider getStudentsGradeProvider()  {
		if (studentsGradeProvider == null) {
		    studentsGradeProvider = (com.webmethods.caf.faces.data.object.ListTableContentProvider)resolveExpression("#{StudentsGradeProvider}");
		}
	
	    resolveDataBinding(STUDENTSGRADEPROVIDER_PROPERTY_BINDINGS, studentsGradeProvider, "studentsGradeProvider", false, false);
		return studentsGradeProvider;
	}
	
}