package SortingExamplePkgComparator;

import java.util.Comparator;

public class FirstNameSort implements Comparator<Student>{
	@Override
	public int compare(Student stu1, Student stu2) {
		// TODO Auto-generated method stub
		return stu1.getFirstname().compareTo(stu2.getFirstname());
		}
}
