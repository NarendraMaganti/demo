package com.capgemini.collectionmethods;

import java.util.Arrays;

public class DemoArray {
	public static void main(String[] args) {
		int ar[] = { 10, 20, 30, 50 };
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);

		}
		int []ar1=Arrays.copyOf(ar, 8);
		ar1[4]=60;
		for (int i = 0; i < ar1.length; i++) {
			System.out.println(ar1[i]);

		}
		

	}

}
