/**
 * 
 */
package com.webmethods.caf.overview_prof;

/**
 * @author wir09cdz
 *
 */

public class Overview_ProfDefaultviewView  extends   com.webmethods.caf.faces.bean.BasePageBean {

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
	private com.webmethods.caf.overview_prof.Overview_Prof overview_Prof = null;

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

	public com.webmethods.caf.overview_prof.Overview_Prof getOverview_Prof()  {
		if (overview_Prof == null) {
		    overview_Prof = (com.webmethods.caf.overview_prof.Overview_Prof)resolveExpression("#{Overview_Prof}");
		}
		return overview_Prof;
	}
	
}