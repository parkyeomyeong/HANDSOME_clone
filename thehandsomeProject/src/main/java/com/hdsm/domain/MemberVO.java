package com.hdsm.domain;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import lombok.Data;

@Data
public class MemberVO {
	private String mid;
	private String mpassword;
	private String mname;
	private String memail;
	private String mtel;
	private int mzipcode;
	private int buysum;
	private String maddress1;
	private String maddress2;
	private String mgrade;
	//	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private java.sql.Date mdate;
	private int mpoint;
	private int menabled;
	
	private List<MemberAuthVO> authList;
	
	public String encode(String str) {

		BCryptPasswordEncoder pec = new BCryptPasswordEncoder();
		
		return pec.encode(str);
	}
}
