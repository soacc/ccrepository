/**
 * 
 */
package com.webmethods.caf.pq__immatrikulationsbersicht_qff;

/**
 * @author wir09cdz
 *
 */

public class Pq__ImmatrikulationsbersichtDefaultviewView_qii  extends   com.webmethods.caf.faces.bean.BasePageBean {

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
	private com.webmethods.caf.pq__immatrikulationsbersicht_qff.Pq__Immatrikulationsbersicht_qff pq__Immatrikulationsbersicht_qff = null;
	private com.webmethods.caf.is.wsclient.campusconnect.work.enrollment.showenrolledstuds_wsd.ShowEnrolledStuds1 showEnrolledStuds = null;
	private static final String[][] SHOWENROLLEDSTUDS_PROPERTY_BINDINGS = new String[][] {
		{"#{showEnrolledStuds.authCredentials.authenticationMethod}", "1"},
		{"#{showEnrolledStuds.authCredentials.requiresAuth}", "true"},
		{"#{showEnrolledStuds.autoRefresh}", "true"},
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

	public com.webmethods.caf.pq__immatrikulationsbersicht_qff.Pq__Immatrikulationsbersicht_qff getPq__Immatrikulationsbersicht_qff()  {
		if (pq__Immatrikulationsbersicht_qff == null) {
		    pq__Immatrikulationsbersicht_qff = (com.webmethods.caf.pq__immatrikulationsbersicht_qff.Pq__Immatrikulationsbersicht_qff)resolveExpression("#{Pq__Immatrikulationsbersicht_qff}");
		}
		return pq__Immatrikulationsbersicht_qff;
	}

	public com.webmethods.caf.is.wsclient.campusconnect.work.enrollment.showenrolledstuds_wsd.ShowEnrolledStuds1 getShowEnrolledStuds()  {
		if (showEnrolledStuds == null) {
		    showEnrolledStuds = (com.webmethods.caf.is.wsclient.campusconnect.work.enrollment.showenrolledstuds_wsd.ShowEnrolledStuds1)resolveExpression("#{ShowEnrolledStuds}");
		}
	
	    resolveDataBinding(SHOWENROLLEDSTUDS_PROPERTY_BINDINGS, showEnrolledStuds, "showEnrolledStuds", false, false);
		return showEnrolledStuds;
	}
	
}