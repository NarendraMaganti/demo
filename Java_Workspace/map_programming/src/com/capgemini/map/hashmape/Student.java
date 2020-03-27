package com.capgemini.map.hashmape;

public class Student {
	long pno;

	@Override
	public String toString() {
		return "Student [pno=" + pno + "]";
	}

	public Student(long pno) {
		super();
		this.pno = pno;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (pno ^ (pno >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (pno != other.pno)
			return false;
		return true;
	}
	

}
