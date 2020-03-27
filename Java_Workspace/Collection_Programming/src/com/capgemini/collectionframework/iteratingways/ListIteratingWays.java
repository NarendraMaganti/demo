package com.capgemini.collectionframework.iteratingways;

import java.util.*;

public class ListIteratingWays {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(12);
		al.add(96);
		al.add(48);
		al.add(100);
		System.out.println("---------for loop-------------");
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}
		System.out.println("-----for each-------");
		for (Integer i : al) {
			System.out.println(i);
		}
		System.out.println("-----iterator()------");
		Iterator<Integer> itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("----List Iterator------");
		ListIterator<Integer> litr = al.listIterator();
		while (litr.hasNext()) {

			System.out.println(litr.next());

		}

		System.out.println("----List Iterator() forward direction------");
		ListIterator<Integer> ltrr = al.listIterator(al.size());
		while (litr.hasPrevious()) {

			System.out.println(litr.previous());

		}
		System.out.println("----List Iterator() forward direction------");
		ListIterator<Integer> l = al.listIterator(al.size());
		while (l.hasPrevious()) {

			System.out.println(l.previous());

		}

	}

}
