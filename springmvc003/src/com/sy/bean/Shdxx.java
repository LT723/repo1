package com.sy.bean;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Shdxx {
	private int reptid;
	private String whname;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date plandate;
	private int restatus;
	public Shdxx() {
		// TODO Auto-generated constructor stub
	}
	public Shdxx(int reptid, String whname, Date plandate, int restatus) {
		this.reptid = reptid;
		this.whname = whname;
		this.plandate = plandate;
		this.restatus = restatus;
	}
	public int getReptid() {
		return reptid;
	}
	public void setReptid(int reptid) {
		this.reptid = reptid;
	}
	public String getWhname() {
		return whname;
	}
	public void setWhname(String whname) {
		this.whname = whname;
	}
	public Date getPlandate() {
		return plandate;
	}
	public void setPlandate(Date plandate) {
		this.plandate = plandate;
	}
	public int getRestatus() {
		return restatus;
	}
	public void setRestatus(int restatus) {
		this.restatus = restatus;
	}
	@Override
	public String toString() {
		return "Shdxx [reptid=" + reptid + ", whname=" + whname + ", plandate=" + plandate + ", restatus=" + restatus
				+ "]";
	}
}
