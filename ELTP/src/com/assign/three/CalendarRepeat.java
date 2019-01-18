package com.assign.three;

import java.util.Calendar;
import static com.assign.one.ControlFlow.isLeap;

import static com.assign.one.ControlFlow.isLeap;
class CalendarRepeat{
public static void main(String[] args) {
	int curYear=2000;
	Calendar c=new Calendar.Builder().setDate(curYear, 1, 1).build();
	Calendar temp;
	boolean c_leap=isLeap(curYear);
	
	System.out.println(curYear+" Day "+c.get(Calendar.DAY_OF_WEEK));
	
	for(int i=curYear+1;i<=curYear+100;i++){
		if(isLeap(i)==c_leap){
			
			temp=new Calendar.Builder().setDate(i, 1, 1).build();
			
			
			if(c.get(Calendar.DAY_OF_WEEK)==temp.get(Calendar.DAY_OF_WEEK)){

				System.out.println(i+" Day "+c.get(Calendar.DAY_OF_WEEK));
				System.out.println("SPAN :"+(i-curYear));
				break;
			}
			
		}
	}
}
}
