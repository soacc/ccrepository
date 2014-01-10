/**
 * 
 */
package com.webmethods.caf.lf030_savestudinfos;

/**
 * @author wir09cdz
 *
 */

public class Lf030_savestudinfosdefaultviewview  extends   com.webmethods.caf.faces.bean.BasePageBean {

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
	private com.webmethods.caf.lf030_savestudinfos.Lf030_savestudinfos lf030_savestudinfos = null;

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

	public com.webmethods.caf.lf030_savestudinfos.Lf030_savestudinfos getLf030_savestudinfos()  {
		if (lf030_savestudinfos == null) {
		    lf030_savestudinfos = (com.webmethods.caf.lf030_savestudinfos.Lf030_savestudinfos)resolveExpression("#{Lf030_savestudinfos}");
		}
		return lf030_savestudinfos;
	}
	
}