package com.assign.three;



import java.sql.Date;
import java.time.DateTimeException;

import com.assign.second.Contact;


public class Demo {
	public static void main(String[] args) throws Exception {
		Contact c= new Contact();
		Contact ch=new Contact();
		c.setFname("aman");
		c.setLname("gupta");
		c.setEmail("amang32@g.com");
		c.setMob("5861234127");
		c.setDob(Date.valueOf("1998-10-03"));
		
		
	
		ContactStack cs=new ContactStack();
		cs.push(c);
	//cs.push(c);
	//	cs.pop();
		//cs.pop();
		
	}

}



