package com.capgemini.collectionmethods;
import java.util.*;

public class CollectionMeth {
	public static void main(String[] args) {
		Collection<Integer> col = new ArrayList<Integer>();
		col.add(10);
		col.add(20);
		col.add(30);
		System.out.println(col);
		col.remove(10);
		System.out.println(col);
		System.out.println(col.size());
		System.out.println(col.contains(10));
		System.out.println(col.isEmpty());
		System.out.println(col);
		col.removeAll(col);
		System.out.println(col);

	}

}
