/**
 ** Please don't modify this file.
 ** This file was generated by the EntireX Java Wrapper
 ** from the IDL file EXAMREG.refactored.idl.
 **
 ** @author    Software AG
 ** @version   EntireX Wrapper, Version: 8.2.2.0.186, Date: 04 Nov 2011 (1.132.4.9)
 ** Generated: 2013-11-17 20:31:09.076 +0100
 **/

import java.lang.reflect.Method ;
import java.math.BigDecimal;

import com.softwareag.entirex.aci.*;

public class Suss_output {
	private BigDecimal _studentid;
	private String _firstname;
	private String _lastname;
	private String _registered;
	private BigDecimal _term;
	private BigDecimal _active;
	private String _degreeprogram;
	private String _dob;
	private String _addressline1;
	private String _addressline2;
	private String _phone;
	private String _email;

	public Suss_output() {
	}

	public void set_studentid(BigDecimal _studentid) {
		this._studentid = _studentid;
	}

	public BigDecimal get_studentid() {
		if (this._studentid == null) {
			this._studentid = new BigDecimal(0);
		}
		return this._studentid;
	}

	public void set_firstname(String _firstname) {
		this._firstname = _firstname;
	}

	public String get_firstname() {
		if (this._firstname == null) {
			this._firstname = "";
		}
		return this._firstname;
	}

	public void set_lastname(String _lastname) {
		this._lastname = _lastname;
	}

	public String get_lastname() {
		if (this._lastname == null) {
			this._lastname = "";
		}
		return this._lastname;
	}

	public void set_registered(String _registered) {
		this._registered = _registered;
	}

	public String get_registered() {
		if (this._registered == null) {
			this._registered = "";
		}
		return this._registered;
	}

	public void set_term(BigDecimal _term) {
		this._term = _term;
	}

	public BigDecimal get_term() {
		if (this._term == null) {
			this._term = new BigDecimal(0);
		}
		return this._term;
	}

	public void set_active(BigDecimal _active) {
		this._active = _active;
	}

	public BigDecimal get_active() {
		if (this._active == null) {
			this._active = new BigDecimal(0);
		}
		return this._active;
	}

	public void set_degreeprogram(String _degreeprogram) {
		this._degreeprogram = _degreeprogram;
	}

	public String get_degreeprogram() {
		if (this._degreeprogram == null) {
			this._degreeprogram = "";
		}
		return this._degreeprogram;
	}

	public void set_dob(String _dob) {
		this._dob = _dob;
	}

	public String get_dob() {
		if (this._dob == null) {
			this._dob = "";
		}
		return this._dob;
	}

	public void set_addressline1(String _addressline1) {
		this._addressline1 = _addressline1;
	}

	public String get_addressline1() {
		if (this._addressline1 == null) {
			this._addressline1 = "";
		}
		return this._addressline1;
	}

	public void set_addressline2(String _addressline2) {
		this._addressline2 = _addressline2;
	}

	public String get_addressline2() {
		if (this._addressline2 == null) {
			this._addressline2 = "";
		}
		return this._addressline2;
	}

	public void set_phone(String _phone) {
		this._phone = _phone;
	}

	public String get_phone() {
		if (this._phone == null) {
			this._phone = "";
		}
		return this._phone;
	}

	public void set_email(String _email) {
		this._email = _email;
	}

	public String get_email() {
		if (this._email == null) {
			this._email = "";
		}
		return this._email;
	}

	public void add(Marshal marshal) throws BrokerException {
		marshal.addDataN(_studentid, 17, 0);
		marshal.addDataA(_firstname, 10);
		marshal.addDataA(_lastname, 32);
		marshal.addDataA(_registered, 10);
		marshal.addDataN(_term, 3, 0);
		marshal.addDataN(_active, 1, 0);
		marshal.addDataA(_degreeprogram, 10);
		marshal.addDataA(_dob, 10);
		marshal.addDataA(_addressline1, 32);
		marshal.addDataA(_addressline2, 32);
		marshal.addDataA(_phone, 32);
		marshal.addDataA(_email, 32);
	}

	public void get(Marshal marshal) throws BrokerException {
		_studentid = marshal.getDataN(17, 0);
		_firstname = marshal.getDataA(10);
		_lastname = marshal.getDataA(32);
		_registered = marshal.getDataA(10);
		_term = marshal.getDataN(3, 0);
		_active = marshal.getDataN(1, 0);
		_degreeprogram = marshal.getDataA(10);
		_dob = marshal.getDataA(10);
		_addressline1 = marshal.getDataA(32);
		_addressline2 = marshal.getDataA(32);
		_phone = marshal.getDataA(32);
		_email = marshal.getDataA(32);
	}
	public static final Method enterStubMethod = getStubMethod("enterClientStub");
	public static final Method leaveStubMethod = getStubMethod("leaveClientStub");

	private static Method getStubMethod(String name) {
		Method method = null ;
		try {
			method = RPCService.class.getMethod(name , null ) ;
		} catch ( Exception ex ) {}
		return method ;
	}
	private void enterStub() {
		if ( enterStubMethod != null ) {
			try {
				enterStubMethod.invoke ( this , null ) ;
			} catch ( Exception ex ) {} 
		}
	}
	private void leaveStub() {
		if ( leaveStubMethod != null ) {
			try {
				leaveStubMethod.invoke ( this , null ) ;
			} catch ( Exception ex ) {}
		}
	}
}
