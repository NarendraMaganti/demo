package com.capgemini.junit.calculator.test;

import java.util.ArrayList;

public class MyFriends {
	
	private ArrayList<String> al = new ArrayList<String>();
	public MyFriends() {
		al.add("narendra");
		al.add("maya");
		al.add("meera");
		al.add("naveen");
	}
	public String getName() {
		if(al.size()==0) {
			return null;
		} else {
			return al.remove(0);
		}
	}

}
