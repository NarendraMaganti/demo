package com.capgemini.collectionframework.set;

import java.util.*;

public class StudentLinkedHsTest {
	public static void main(String[] args) {
		LinkedHashSet<StudentLinkedHs> hs=new LinkedHashSet<StudentLinkedHs>();
		hs.add(new StudentLinkedHs(20, "saikumar"));
		hs.add(new StudentLinkedHs(20, "saikumar"));
		hs.add(new StudentLinkedHs(21, "kamal"));
		hs.add(null);
		System.out.println(hs);
	}

}
