package web.dto;

import java.util.Date;

public class RotSteMng {
	
	private int steSeq;
	private String steCd;
	private String steNm;
	private String nm;
	private String email;
	private String cttpc;
	private String psitn;
	private String steDes;
	private int fileSeq;
	private String rgr;
	private String regDtm;
	private String modr;
	private Date modDtm;
	private String regIp;
	private String regPgm;
	private String modIp;
	private String modPgm;
	
	@Override
	public String toString() {
		return "RotSteMng [steSeq=" + steSeq + ", steCd=" + steCd + ", steNm=" + steNm + ", nm=" + nm + ", email="
				+ email + ", cttpc=" + cttpc + ", psitn=" + psitn + ", steDes=" + steDes + ", fileSeq=" + fileSeq
				+ ", rgr=" + rgr + ", regDtm=" + regDtm + ", modr=" + modr + ", modDtm=" + modDtm + ", regIp=" + regIp
				+ ", regPgm=" + regPgm + ", modIp=" + modIp + ", modPgm=" + modPgm + "]";
	}

	public int getSteSeq() {
		return steSeq;
	}

	public void setSteSeq(int steSeq) {
		this.steSeq = steSeq;
	}

	public String getSteCd() {
		return steCd;
	}

	public void setSteCd(String steCd) {
		this.steCd = steCd;
	}

	public String getSteNm() {
		return steNm;
	}

	public void setSteNm(String steNm) {
		this.steNm = steNm;
	}

	public String getNm() {
		return nm;
	}

	public void setNm(String nm) {
		this.nm = nm;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCttpc() {
		return cttpc;
	}

	public void setCttpc(String cttpc) {
		this.cttpc = cttpc;
	}

	public String getPsitn() {
		return psitn;
	}

	public void setPsitn(String psitn) {
		this.psitn = psitn;
	}

	public String getSteDes() {
		return steDes;
	}

	public void setSteDes(String steDes) {
		this.steDes = steDes;
	}

	public int getFileSeq() {
		return fileSeq;
	}

	public void setFileSeq(int fileSeq) {
		this.fileSeq = fileSeq;
	}

	public String getRgr() {
		return rgr;
	}

	public void setRgr(String rgr) {
		this.rgr = rgr;
	}

	public String getRegDtm() {
		return regDtm;
	}

	public void setRegDtm(String regDtm) {
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
	
	
	
	
	
}
