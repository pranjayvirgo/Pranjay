package SortingExamplePkgComparator;

import java.util.Comparator;

public class AddressSort implements Comparator<Student> {

	@Override
	public int compare(Student stu1, Student stu2) {
		// TODO Auto-generated method stub
		return stu1.getAddress().compareTo(stu2.getAddress());
		}

}
