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

public class Ses_output {
	private BigDecimal _examid;
	private BigDecimal _courseid;
	private String _coursename;
	private BigDecimal _professorid;
	private String _professorlastname;
	private BigDecimal _amountregistered;
	private BigDecimal _maxparticipants;
	private String _examdate;
	private String _examtime;
	private String _examroom;

	public Ses_output() {
	}

	public void set_examid(BigDecimal _examid) {
		this._examid = _examid;
	}

	public BigDecimal get_examid() {
		if (this._examid == null) {
			this._examid = new BigDecimal(0);
		}
		return this._examid;
	}

	public void set_courseid(BigDecimal _courseid) {
		this._courseid = _courseid;
	}

	public BigDecimal get_courseid() {
		if (this._courseid == null) {
			this._courseid = new BigDecimal(0);
		}
		return this._courseid;
	}

	public void set_coursename(String _coursename) {
		this._coursename = _coursename;
	}

	public String get_coursename() {
		if (this._coursename == null) {
			this._coursename = "";
		}
		return this._coursename;
	}

	public void set_professorid(BigDecimal _professorid) {
		this._professorid = _professorid;
	}

	public BigDecimal get_professorid() {
		if (this._professorid == null) {
			this._professorid = new BigDecimal(0);
		}
		return this._professorid;
	}

	public void set_professorlastname(String _professorlastname) {
		this._professorlastname = _professorlastname;
	}

	public String get_professorlastname() {
		if (this._professorlastname == null) {
			this._professorlastname = "";
		}
		return this._professorlastname;
	}

	public void set_amountregistered(BigDecimal _amountregistered) {
		this._amountregistered = _amountregistered;
	}

	public BigDecimal get_amountregistered() {
		if (this._amountregistered == null) {
			this._amountregistered = new BigDecimal(0);
		}
		return this._amountregistered;
	}

	public void set_maxparticipants(BigDecimal _maxparticipants) {
		this._maxparticipants = _maxparticipants;
	}

	public BigDecimal get_maxparticipants() {
		if (this._maxparticipants == null) {
			this._maxparticipants = new BigDecimal(0);
		}
		return this._maxparticipants;
	}

	public void set_examdate(String _examdate) {
		this._examdate = _examdate;
	}

	public String get_examdate() {
		if (this._examdate == null) {
			this._examdate = "";
		}
		return this._examdate;
	}

	public void set_examtime(String _examtime) {
		this._examtime = _examtime;
	}

	public String get_examtime() {
		if (this._examtime == null) {
			this._examtime = "";
		}
		return this._examtime;
	}

	public void set_examroom(String _examroom) {
		this._examroom = _examroom;
	}

	public String get_examroom() {
		if (this._examroom == null) {
			this._examroom = "";
		}
		return this._examroom;
	}

	public void add(Marshal marshal) throws BrokerException {
		marshal.addDataN(_examid, 9, 0);
		marshal.addDataN(_courseid, 9, 0);
		marshal.addDataA(_coursename, 32);
		marshal.addDataN(_professorid, 9, 0);
		marshal.addDataA(_professorlastname, 32);
		marshal.addDataN(_amountregistered, 9, 0);
		marshal.addDataN(_maxparticipants, 9, 0);
		marshal.addDataA(_examdate, 32);
		marshal.addDataA(_examtime, 32);
		marshal.addDataA(_examroom, 32);
	}

	public void get(Marshal marshal) throws BrokerException {
		_examid = marshal.getDataN(9, 0);
		_courseid = marshal.getDataN(9, 0);
		_coursename = marshal.getDataA(32);
		_professorid = marshal.getDataN(9, 0);
		_professorlastname = marshal.getDataA(32);
		_amountregistered = marshal.getDataN(9, 0);
		_maxparticipants = marshal.getDataN(9, 0);
		_examdate = marshal.getDataA(32);
		_examtime = marshal.getDataA(32);
		_examroom = marshal.getDataA(32);
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
