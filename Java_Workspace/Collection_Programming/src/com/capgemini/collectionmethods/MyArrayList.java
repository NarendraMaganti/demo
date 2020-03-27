package com.capgemini.collectionmethods;

import java.util.Arrays;

public class MyArrayList<Any> {
	private static final int INIT_SIZE = 2;
	private Any[] internalArray;
	private int arraySize;

	MyArrayList() {
		this(INIT_SIZE);

	}

	MyArrayList(int size) {
		if (size < 0)
			throw new IllegalArgumentException("Size cannot be less than zero");
		internalArray = (Any[]) new Object[size];

	}

	public boolean add(Any a) {
		checkCapacity(arraySize);
		internalArray[arraySize++] = a;
		return true;
	}

	private void checkCapacity(int size) {
		if (size == internalArray.length) {
			int prevsize = internalArray.length;
			int newsize = prevsize * 2;
			internalArray = Arrays.copyOf(internalArray, newsize);
		}

	}

	/*public void remove(Any a) {
		Any[] a1 = (Any[]) new Object[arraySize];
		for (int i = 0; i < arraySize - 1; i++) {
			if (internalArray[i].equals(a)) {
				arraySize--;
				continue;
			} else {
				a1[i] = internalArray[i];

			}
		}
		internalArray = Arrays.copyOf(a1, arraySize);

	}*/
	public Object remove(int index) {
		if(index<0||index>=arraySize) {
			throw new IndexOutOfBoundsException("not possible");
		}
		Object removeElement =internalArray[index];
		for(int i=index;i<arraySize-1;i++) {
			internalArray[i-1]=internalArray[i-1];
		}
		return arraySize;
	}
	

	@Override
	public String toString() {
		return "MyArrayList [internalArray=" + Arrays.toString(internalArray) + ", arraySize=" + arraySize + "]";
	}

}
