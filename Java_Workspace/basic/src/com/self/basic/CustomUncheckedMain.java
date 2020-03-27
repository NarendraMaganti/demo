package com.self.basic;

public class CustomUncheckedMain {
	public static void main(String[] args) {

		Election e = new Election();
		try {
			e.vote(1);
		}catch(CustomUnchecked u) {
			System.out.println(u.getMessage());
		}

	}
}
