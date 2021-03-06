package com.assign.second;

import java.util.Date;
import java.util.regex.*;
public class Contact {

	private String fname,mname,lname,gender,address,area,city,pin,state,country,tel,mob,email,website;
	private Date dob,anniversary;
	
	public Contact()
	{
		tel="";
	}
     public Contact(String fname, String mname, String lname, String gender, String address, String area, String city,
			String pin, String state, String country, String tel, String mob, String email, String website, Date dob,
			Date anniversary) throws Exception {
		super();
		
		this.fname = fname;
		this.mname = mname;
		this.lname = lname;
		this.gender = gender;
		this.address = address;
		this.area = area;
		this.city = city;
		this.pin = pin;
		this.state = state;
		this.country = country;
		this.tel = tel;
		this.mob = mob;
		this.email = email;
		this.website = website;
		this.dob = dob;
		this.anniversary = anniversary;
		validate();
	}

	public  boolean validate() throws Exception{
    	 
    	 if(this.fname.isEmpty()||this.lname.isEmpty()||this.dob==null){
    		throw new Exception("please enter the complete details");
    	
    	 }
    	 
    	 Pattern p=Pattern.compile("^([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)\\.([a-zA-Z]{2,5})$");
    	 Matcher m=p.matcher(this.email);
    	 if(!m.find())
    	 {
    		 throw new Exception("invalid email");
    	 }
    	 
    	 if(tel.isEmpty() && mob.isEmpty()){
    		 
      		throw new Exception("Atleast enter either mobile number or telephone");
     	 }
    		 else
    			 return true;
     
    	 
    	 
     }
	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getMob() {
		return mob;
	}

	public void setMob(String mob) {
		Pattern p=Pattern.compile("[0-9]{10}");
		Matcher m=p.matcher(mob);
		if(m.find())
		this.mob = mob;
		else
			System.err.print("invalid number");
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public Date getAnniversary() {
		return anniversary;
	}

	public void setAnniversary(Date anniversary) {
		this.anniversary = anniversary;
	}
	
}
