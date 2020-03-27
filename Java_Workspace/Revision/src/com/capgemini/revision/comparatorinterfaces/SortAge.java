package com.capgemini.revision.comparatorinterfaces;

import java.util.Comparator;

public class SortAge implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		if(o1.getStudentNo()==o2.getStudentNo())
			return 0;
		else
		return	(o1.getStudentNo()>o2.getStudentNo()?1:-1);
	}

}
