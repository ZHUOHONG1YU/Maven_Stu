package com.maven.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="t_stu")
public class Stu {

	private int sno;
	private String sname;
	private int sage;
	
	public Stu() {
		super();
	}
	public Stu(int sno, String sname, int sage) {
		super();
		this.sno = sno;
		this.sname = sname;
		this.sage = sage;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getSage() {
		return sage;
	}
	public void setSage(int sage) {
		this.sage = sage;
	}
}
