package web.dto;

import java.util.Date;

public class Info {
	
	private String schCd;
	private String schNm;
	private String schDiv;
	private String zipno;
	private String addr;
	private String addrDts;
	private String telNo;
	private String remk;
	private String rgr;
	private Date regDtm;
	private String modr;
	private Date modDtm;
	private String regIp;
	private String regPgm;
	private String modIp;
	private String modPgm;
	private String userId;
	
	@Override
	public String toString() {
		return "Info [schCd=" + schCd + ", schNm=" + schNm + ", schDiv=" + schDiv + ", zipno=" + zipno + ", addr="
				+ addr + ", addrDts=" + addrDts + ", telNo=" + telNo + ", remk=" + remk + ", rgr=" + rgr + ", regDtm="
				+ regDtm + ", modr=" + modr + ", modDtm=" + modDtm + ", regIp=" + regIp + ", regPgm=" + regPgm
				+ ", modIp=" + modIp + ", modPgm=" + modPgm + ", userId=" + userId + "]";
	}

	public String getSchCd() {
		return schCd;
	}

	public void setSchCd(String schCd) {
		this.schCd = schCd;
	}

	public String getSchNm() {
		return schNm;
	}

	public void setSchNm(String schNm) {
		this.schNm = schNm;
	}

	public String getSchDiv() {
		return schDiv;
	}

	public void setSchDiv(String schDiv) {
		this.schDiv = schDiv;
	}

	public String getZipno() {
		return zipno;
	}

	public void setZipno(String zipno) {
		this.zipno = zipno;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getAddrDts() {
		return addrDts;
	}

	public void setAddrDts(String addrDts) {
		this.addrDts = addrDts;
	}

	public String getTelNo() {
		return telNo;
	}

	public void setTelNo(String telNo) {
		this.telNo = telNo;
	}

	public String getRemk() {
		return remk;
	}

	public void setRemk(String remk) {
		this.remk = remk;
	}

	public String getRgr() {
		return rgr;
	}

	public void setRgr(String rgr) {
		this.rgr = rgr;
	}

	public Date getRegDtm() {
		return regDtm;
	}

	public void setRegDtm(Date regDtm) {
		this.regDtm = regDtm;
	}

	public String getModr() {
		return modr;
	}

	public void setModr(String modr) {
		this.modr = modr;
	}

	public Date getModDtm() {
		return modDtm;
	}

	public void setModDtm(Date modDtm) {
		this.modDtm = modDtm;
	}

	public String getRegIp() {
		return regIp;
	}

	public void setRegIp(String regIp) {
		this.regIp = regIp;
	}

	public String getRegPgm() {
		return regPgm;
	}

	public void setRegPgm(String regPgm) {
		this.regPgm = regPgm;
	}

	public String getModIp() {
		return modIp;
	}

	public void setModIp(String modIp) {
		this.modIp = modIp;
	}

	public String getModPgm() {
		return modPgm;
	}

	public void setModPgm(String modPgm) {
		this.modPgm = modPgm;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	
	
}
