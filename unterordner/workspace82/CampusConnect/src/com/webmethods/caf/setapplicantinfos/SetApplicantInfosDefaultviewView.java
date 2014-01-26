/**
 * 
 */
package com.webmethods.caf.setapplicantinfos;

/**
 * @author wir09cdz
 *
 */

public class SetApplicantInfosDefaultviewView  extends   com.webmethods.caf.faces.bean.BasePageBean {

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
	private com.webmethods.caf.setapplicantinfos.SetApplicantInfos setApplicantInfos = null;
	private com.webmethods.caf.faces.data.object.ListTableContentProvider documentsProvider = null;
	private static final String[][] DOCUMENTSPROVIDER_PROPERTY_BINDINGS = new String[][] {
		{"#{DocumentsProvider.rowType}", "com.webmethods.caf.is.wsclient.campusconnect.work.enrollment.setapplicantinfos_wsd_hk1.document"},
		{"#{DocumentsProvider.rowVariable}", "document"},
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

	public com.webmethods.caf.setapplicantinfos.SetApplicantInfos getSetApplicantInfos()  {
		if (setApplicantInfos == null) {
		    setApplicantInfos = (com.webmethods.caf.setapplicantinfos.SetApplicantInfos)resolveExpression("#{SetApplicantInfos}");
		}
		return setApplicantInfos;
	}

	public com.webmethods.caf.faces.data.object.ListTableContentProvider getDocumentsProvider()  {
		if (documentsProvider == null) {
		    documentsProvider = (com.webmethods.caf.faces.data.object.ListTableContentProvider)resolveExpression("#{DocumentsProvider}");
		}
	
	    resolveDataBinding(DOCUMENTSPROVIDER_PROPERTY_BINDINGS, documentsProvider, "documentsProvider", false, false);
		return documentsProvider;
	}
	
}