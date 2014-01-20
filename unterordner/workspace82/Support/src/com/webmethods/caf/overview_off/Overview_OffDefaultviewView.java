/**
 * 
 */
package com.webmethods.caf.overview_off;

/**
 * @author wir09cdz
 *
 */

public class Overview_OffDefaultviewView  extends   com.webmethods.caf.faces.bean.BasePageBean {

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
	private com.webmethods.caf.overview_off.Overview_Off overview_Off = null;

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

	public com.webmethods.caf.overview_off.Overview_Off getOverview_Off()  {
		if (overview_Off == null) {
		    overview_Off = (com.webmethods.caf.overview_off.Overview_Off)resolveExpression("#{Overview_Off}");
		}
		return overview_Off;
	}
	
}