/**
 * 
 */
package com.webmethods.caf.savestudinfos;

/**
 * @author wir09cdz
 *
 */

public class SaveStudInfosDefaultviewView  extends   com.webmethods.caf.faces.bean.BasePageBean {

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
	private com.webmethods.caf.savestudinfos.SaveStudInfos saveStudInfos = null;
	private com.webmethods.caf.faces.data.object.ListTableContentProvider documentsProvider2 = null;
	private static final String[][] DOCUMENTSPROVIDER2_PROPERTY_BINDINGS = new String[][] {
		{"#{DocumentsProvider2.rowType}", "com.webmethods.caf.is.wsclient.campusconnect.work.enrollment.savestudinfos_wsd_hk2.document"},
		{"#{DocumentsProvider2.rowVariable}", "document"},
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

	public com.webmethods.caf.savestudinfos.SaveStudInfos getSaveStudInfos()  {
		if (saveStudInfos == null) {
		    saveStudInfos = (com.webmethods.caf.savestudinfos.SaveStudInfos)resolveExpression("#{SaveStudInfos}");
		}
		return saveStudInfos;
	}

	public com.webmethods.caf.faces.data.object.ListTableContentProvider getDocumentsProvider2()  {
		if (documentsProvider2 == null) {
		    documentsProvider2 = (com.webmethods.caf.faces.data.object.ListTableContentProvider)resolveExpression("#{DocumentsProvider2}");
		}
	
	    resolveDataBinding(DOCUMENTSPROVIDER2_PROPERTY_BINDINGS, documentsProvider2, "documentsProvider2", false, false);
		return documentsProvider2;
	}
	
}