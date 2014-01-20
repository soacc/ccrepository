/**
 * 
 */
package com.webmethods.caf.showeating_test;

/**
 * @author wir09cdz
 *
 */

public class ShowEating_testDefaultviewView  extends   com.webmethods.caf.faces.bean.BasePageBean {

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
	private com.webmethods.caf.showeating_test.ShowEating_test showEating_test = null;
	private com.webmethods.caf.faces.data.object.ListTableContentProvider eatingplan_localProvider = null;
	private static final String[][] EATINGPLAN_LOCALPROVIDER_PROPERTY_BINDINGS = new String[][] {
		{"#{Eatingplan_localProvider.rowType}", "com.webmethods.caf.is.wsclient.campusconnect.work.eating.showeating_wsd_hk1.eatingplan_local"},
		{"#{Eatingplan_localProvider.rowVariable}", "eatingplan_local"},
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

	public com.webmethods.caf.showeating_test.ShowEating_test getShowEating_test()  {
		if (showEating_test == null) {
		    showEating_test = (com.webmethods.caf.showeating_test.ShowEating_test)resolveExpression("#{ShowEating_test}");
		}
		return showEating_test;
	}

	public com.webmethods.caf.faces.data.object.ListTableContentProvider getEatingplan_localProvider()  {
		if (eatingplan_localProvider == null) {
		    eatingplan_localProvider = (com.webmethods.caf.faces.data.object.ListTableContentProvider)resolveExpression("#{Eatingplan_localProvider}");
		}
	
	    resolveDataBinding(EATINGPLAN_LOCALPROVIDER_PROPERTY_BINDINGS, eatingplan_localProvider, "eatingplan_localProvider", false, false);
		return eatingplan_localProvider;
	}
	
}