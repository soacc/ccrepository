/**
 * 
 */
package com.webmethods.caf.register;

/**
 * @author wir09cdz
 *
 */

public class RegisterDefaultviewView  extends   com.webmethods.caf.faces.bean.BasePageBean {

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
	private com.webmethods.caf.register.Register register = null;
	private com.webmethods.caf.faces.data.object.ListTableContentProvider inputCoursesProvider2 = null;
	private static final String[][] INPUTCOURSESPROVIDER2_PROPERTY_BINDINGS = new String[][] {
		{"#{InputCoursesProvider2.rowType}", "java.lang.String"},
		{"#{InputCoursesProvider2.rowVariable}", "inputCourse"},
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

	public com.webmethods.caf.register.Register getRegister()  {
		if (register == null) {
		    register = (com.webmethods.caf.register.Register)resolveExpression("#{Register}");
		}
		return register;
	}

	public com.webmethods.caf.faces.data.object.ListTableContentProvider getInputCoursesProvider2()  {
		if (inputCoursesProvider2 == null) {
		    inputCoursesProvider2 = (com.webmethods.caf.faces.data.object.ListTableContentProvider)resolveExpression("#{InputCoursesProvider2}");
		}
	
	    resolveDataBinding(INPUTCOURSESPROVIDER2_PROPERTY_BINDINGS, inputCoursesProvider2, "inputCoursesProvider2", false, false);
		return inputCoursesProvider2;
	}
	
}