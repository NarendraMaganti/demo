package com.self.basic;

public class Election {

	public void vote(int age) {
		if(age < 18) {
			throw new CustomUnchecked();
		}else {
			System.out.println(" Hurry!!!!!!! You are eligible for voting");
		}

	}
}
