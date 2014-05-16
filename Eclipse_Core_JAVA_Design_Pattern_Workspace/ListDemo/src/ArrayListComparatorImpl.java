import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ArrayListComparatorImpl {
	public static void main(String[] args) {
	ArrayListDemoComparatorProperty student1=new ArrayListDemoComparatorProperty("pranjay","singh",26);
	ArrayListDemoComparatorProperty student2=new ArrayListDemoComparatorProperty("gaurav","thakur",27);
	ArrayListDemoComparatorProperty student3=new ArrayListDemoComparatorProperty("abhishek","jain",29);
	ArrayListDemoComparatorProperty student4=new ArrayListDemoComparatorProperty("sumit","goel",23);
	ArrayListDemoComparatorProperty student5=new ArrayListDemoComparatorProperty("vaibhav","agarwal",22);
	ArrayListDemoComparatorProperty student6=new ArrayListDemoComparatorProperty("ankit","pratap",24);
	List<ArrayListDemoComparatorProperty> studentList=new ArrayList<ArrayListDemoComparatorProperty>(15);
	studentList.add(student1);
	studentList.add(student2);
	studentList.add(student3);
	studentList.add(student4);
	studentList.add(student5);
	studentList.add(student6);
	System.out.println(studentList);
	ArrayListDemoComparator adc=new ArrayListDemoComparator();
	Collections.sort(studentList,adc);
	System.out.println(studentList);
	ComparatorFirstname afn=new ComparatorFirstname();
	Collections.sort(studentList,afn);
System.out.println(Collections.binarySearch(studentList, new ArrayListDemoComparatorProperty("pranjay"), afn));
	}}