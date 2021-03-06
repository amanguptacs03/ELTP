package com.assign.three;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import static com.assign.one.ControlFlow.isLeap;
import static com.assign.one.ControlFlow.isLeap;
class CalendarRepeat{
public static void main(String[] args) throws ParseException {
	int curYear=2000;
	Calendar c=Calendar.getInstance();
	Calendar temp=Calendar.getInstance();
	boolean c_leap=isLeap(curYear);
	Date d=new Date();
	SimpleDateFormat sdf=new SimpleDateFormat("D/M/yyyy");
	SimpleDateFormat odf=new SimpleDateFormat("D/M/yyyy E ");
	
	
	d=sdf.parse("1/1/"+curYear);
	c.setTime(d);
	
	System.out.println(odf.format(d));
	
	for(int i=curYear+1;i<=curYear+100;i++){
		if(isLeap(i)==c_leap){
			Date t=new Date();
			t=sdf.parse("1/1/"+i);
			temp.setTime(t);
			
			
			if(c.get(Calendar.DAY_OF_WEEK)==temp.get(Calendar.DAY_OF_WEEK)){

				System.out.println(odf.format(t));
				System.out.println("SPAN :"+(i-curYear));
				break;
			}
			
		}
	}
}



}
