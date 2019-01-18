package com.assign.three;

import java.util.Stack;

import com.assign.second.Contact;

public class ContactStack  {

	Stack<Contact> s= new Stack<Contact>();

	int limit=1;

	public void push(Contact c) throws Exception {
		if(s.size()==limit|| !c.validate())
		{
			throw new Exception("stack is already full: PUSH OPERATION FAIL");
		}
		else {
		s.push(c);
	
		System.out.println("Successfully Pushed");
		}

}

	public void pop() throws Exception {
	if(s.size()==0) {
		throw new Exception("Stack is already empty: POP OPERATION FAIL");
	}
	else {
	s.pop();
	System.out.println("Sucessfully Popped");
	}
}


}
