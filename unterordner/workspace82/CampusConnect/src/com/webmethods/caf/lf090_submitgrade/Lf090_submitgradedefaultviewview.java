/**
 * 
 */
package com.webmethods.caf.lf090_submitgrade;

/**
 * @author wir09cdz
 *
 */

public class Lf090_submitgradedefaultviewview  extends   com.webmethods.caf.faces.bean.BasePageBean {

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
	private com.webmethods.caf.lf090_submitgrade.Lf090_submitgrade lf090_submitgrade = null;
	private com.webmethods.caf.is.wsclient.campusconnect.work.gradesubmission.submitgrade_wsd_hk1.SubmitGrade submitGrade = null;
	private com.webmethods.caf.faces.data.object.ListTableContentProvider submitGradeProvider = null;
	private static final String[][] SUBMITGRADEPROVIDER_PROPERTY_BINDINGS = new String[][] {
		{"#{SubmitGradeProvider.rowType}", "com.webmethods.caf.is.wsclient.campusconnect.work.gradesubmission.submitgrade_wsd_hk1.StudentsGrade"},
		{"#{SubmitGradeProvider.rowVariable}", "submitGrade"},
	};
	private static final String[][] SUBMITGRADE_PROPERTY_BINDINGS = new String[][] {
		{"#{submitGrade.authCredentials.authenticationMethod}", "1"},
		{"#{submitGrade.authCredentials.requiresAuth}", "true"},
		{"#{submitGrade.autoRefresh}", "false"},
		{"#{submitGrade.parameters.submitGrade}", "#{Lf090_submitgradedefaultviewview.submitGradeProvider.array}"},
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

	public com.webmethods.caf.lf090_submitgrade.Lf090_submitgrade getLf090_submitgrade()  {
		if (lf090_submitgrade == null) {
		    lf090_submitgrade = (com.webmethods.caf.lf090_submitgrade.Lf090_submitgrade)resolveExpression("#{Lf090_submitgrade}");
		}
		return lf090_submitgrade;
	}

	public com.webmethods.caf.is.wsclient.campusconnect.work.gradesubmission.submitgrade_wsd_hk1.SubmitGrade getSubmitGrade()  {
		if (submitGrade == null) {
		    submitGrade = (com.webmethods.caf.is.wsclient.campusconnect.work.gradesubmission.submitgrade_wsd_hk1.SubmitGrade)resolveExpression("#{SubmitGrade}");
		}
	
	    resolveDataBinding(SUBMITGRADE_PROPERTY_BINDINGS, submitGrade, "submitGrade", false, false);
		return submitGrade;
	}

	public com.webmethods.caf.faces.data.object.ListTableContentProvider getSubmitGradeProvider()  {
		if (submitGradeProvider == null) {
		    submitGradeProvider = (com.webmethods.caf.faces.data.object.ListTableContentProvider)resolveExpression("#{SubmitGradeProvider}");
		}
	
	    resolveDataBinding(SUBMITGRADEPROVIDER_PROPERTY_BINDINGS, submitGradeProvider, "submitGradeProvider", false, false);
		return submitGradeProvider;
	}
	
}