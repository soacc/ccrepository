/**
 * 
 */
package com.webmethods.caf.rechts;

/**
 * @author wir09cdz
 *
 */

public class RechtsDefaultviewView  extends   com.webmethods.caf.faces.bean.BasePageBean {

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
	private com.webmethods.caf.rechts.Rechts rechts = null;
	private com.webmethods.caf.faces.bean.SimpleFileExportBean fileExportBean = null;
	private static final String[][] FILEEXPORTBEAN_PROPERTY_BINDINGS = new String[][] {
	};
	private java.lang.Character _character;

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

	public com.webmethods.caf.rechts.Rechts getRechts()  {
		if (rechts == null) {
		    rechts = (com.webmethods.caf.rechts.Rechts)resolveExpression("#{Rechts}");
		}
		return rechts;
	}

	public com.webmethods.caf.faces.bean.SimpleFileExportBean getFileExportBean()  {
		if (fileExportBean == null) {
			fileExportBean = new com.webmethods.caf.faces.bean.SimpleFileExportBean();
		}
	
	    resolveDataBinding(FILEEXPORTBEAN_PROPERTY_BINDINGS, fileExportBean, "fileExportBean", false, false);
		return fileExportBean;
	}

	public java.lang.Character get_character()  {
		
		return _character;
	}
	
}