/**
 * 
 */
package com.webmethods.caf.lf070_savepersonaldatastud;

/**
 * @author wir09cdz
 *
 */

public class Lf070_savepersonaldatastuddefaultviewview  extends   com.webmethods.caf.faces.bean.BasePageBean {

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
	private com.webmethods.caf.lf070_savepersonaldatastud.Lf070_savepersonaldatastud lf070_savepersonaldatastud = null;

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

	public com.webmethods.caf.lf070_savepersonaldatastud.Lf070_savepersonaldatastud getLf070_savepersonaldatastud()  {
		if (lf070_savepersonaldatastud == null) {
		    lf070_savepersonaldatastud = (com.webmethods.caf.lf070_savepersonaldatastud.Lf070_savepersonaldatastud)resolveExpression("#{Lf070_savepersonaldatastud}");
		}
		return lf070_savepersonaldatastud;
	}
	
}