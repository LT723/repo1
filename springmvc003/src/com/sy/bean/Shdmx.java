package com.sy.bean;

public class Shdmx {
	private int mxid;
	private Shdxx shdxx;
	private String pname;
	private String ptype;
	private int plannum;
	private int incount;
	private int destorycount;
	private int rkzt;
	public Shdmx() {
		// TODO Auto-generated constructor stub
	}
	public Shdmx(int mxid, Shdxx shdxx, String pname, String ptype, int plannum, int incount, int destorycount,
			int rkzt) {
		this.mxid = mxid;
		this.shdxx = shdxx;
		this.pname = pname;
		this.ptype = ptype;
		this.plannum = plannum;
		this.incount = incount;
		this.destorycount = destorycount;
		this.rkzt = rkzt;
	}
	public int getMxid() {
		return mxid;
	}
	public void setMxid(int mxid) {
		this.mxid = mxid;
	}
	public Shdxx getShdxx() {
		return shdxx;
	}
	public void setShdxx(Shdxx shdxx) {
		this.shdxx = shdxx;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPtype() {
		return ptype;
	}
	public void setPtype(String ptype) {
		this.ptype = ptype;
	}
	public int getPlannum() {
		return plannum;
	}
	public void setPlannum(int plannum) {
		this.plannum = plannum;
	}
	public int getIncount() {
		return incount;
	}
	public void setIncount(int incount) {
		this.incount = incount;
	}
	public int getDestorycount() {
		return destorycount;
	}
	public void setDestorycount(int destorycount) {
		this.destorycount = destorycount;
	}
	public int getRkzt() {
		return rkzt;
	}
	public void setRkzt(int rkzt) {
		this.rkzt = rkzt;
	}
	@Override
	public String toString() {
		return "Shdmx [mxid=" + mxid + ", shdxx=" + shdxx + ", pname=" + pname + ", ptype=" + ptype + ", plannum="
				+ plannum + ", incount=" + incount + ", destorycount=" + destorycount + ", rkzt=" + rkzt + "]";
	}
}
