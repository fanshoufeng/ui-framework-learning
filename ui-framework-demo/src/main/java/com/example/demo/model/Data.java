package com.example.demo.model;

public class Data {

	private String cmcustCode;
	private String cmcustName;
	private String cmcustStatus;
	private String cmcustManager;
	private String cmcustGrpcode;
	private String cmcustParentname;
	private String cmcustCurid;
	private String cmcustPhone;
	private String cmcustAddr01;
	
	public Data(String cmcustCode, String cmcustName, String cmcustStatus, String cmcustManager, String cmcustGrpcode,
			String cmcustParentname, String cmcustCurid, String cmcustPhone, String cmcustAddr01) {
		this.cmcustCode = cmcustCode;
		this.cmcustName = cmcustName;
		this.cmcustStatus = cmcustStatus;
		this.cmcustManager = cmcustManager;
		this.cmcustGrpcode = cmcustGrpcode;
		this.cmcustGrpcode = cmcustGrpcode;
		this.cmcustParentname = cmcustParentname;
		this.cmcustCurid = cmcustCurid;
		this.cmcustPhone = cmcustPhone;
		this.cmcustAddr01 = cmcustAddr01;
	}

	/**
	 * @return the cmcustCode
	 */
	public String getCmcustCode() {
		return cmcustCode;
	}

	/**
	 * @param cmcustCode the cmcustCode to set
	 */
	public void setCmcustCode(String cmcustCode) {
		this.cmcustCode = cmcustCode;
	}

	/**
	 * @return the cmcustName
	 */
	public String getCmcustName() {
		return cmcustName;
	}

	/**
	 * @param cmcustName the cmcustName to set
	 */
	public void setCmcustName(String cmcustName) {
		this.cmcustName = cmcustName;
	}

	/**
	 * @return the cmcustStatus
	 */
	public String getCmcustStatus() {
		return cmcustStatus;
	}

	/**
	 * @param cmcustStatus the cmcustStatus to set
	 */
	public void setCmcustStatus(String cmcustStatus) {
		this.cmcustStatus = cmcustStatus;
	}

	/**
	 * @return the cmcustManager
	 */
	public String getCmcustManager() {
		return cmcustManager;
	}

	/**
	 * @param cmcustManager the cmcustManager to set
	 */
	public void setCmcustManager(String cmcustManager) {
		this.cmcustManager = cmcustManager;
	}

	/**
	 * @return the cmcustGrpcode
	 */
	public String getCmcustGrpcode() {
		return cmcustGrpcode;
	}

	/**
	 * @param cmcustGrpcode the cmcustGrpcode to set
	 */
	public void setCmcustGrpcode(String cmcustGrpcode) {
		this.cmcustGrpcode = cmcustGrpcode;
	}

	/**
	 * @return the cmcustParentname
	 */
	public String getCmcustParentname() {
		return cmcustParentname;
	}

	/**
	 * @param cmcustParentname the cmcustParentname to set
	 */
	public void setCmcustParentname(String cmcustParentname) {
		this.cmcustParentname = cmcustParentname;
	}

	/**
	 * @return the cmcustCurid
	 */
	public String getCmcustCurid() {
		return cmcustCurid;
	}

	/**
	 * @param cmcustCurid the cmcustCurid to set
	 */
	public void setCmcustCurid(String cmcustCurid) {
		this.cmcustCurid = cmcustCurid;
	}

	/**
	 * @return the cmcustPhone
	 */
	public String getCmcustPhone() {
		return cmcustPhone;
	}

	/**
	 * @param cmcustPhone the cmcustPhone to set
	 */
	public void setCmcustPhone(String cmcustPhone) {
		this.cmcustPhone = cmcustPhone;
	}

	/**
	 * @return the cmcustAddr01
	 */
	public String getCmcustAddr01() {
		return cmcustAddr01;
	}

	/**
	 * @param cmcustAddr01 the cmcustAddr01 to set
	 */
	public void setCmcustAddr01(String cmcustAddr01) {
		this.cmcustAddr01 = cmcustAddr01;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Data [cmcustCode=" + cmcustCode + ", cmcustName=" + cmcustName + ", cmcustStatus=" + cmcustStatus
				+ ", cmcustManager=" + cmcustManager + ", cmcustGrpcode=" + cmcustGrpcode + ", cmcustParentname="
				+ cmcustParentname + ", cmcustCurid=" + cmcustCurid + ", cmcustPhone=" + cmcustPhone + ", cmcustAddr01="
				+ cmcustAddr01 + "]";
	}

}
