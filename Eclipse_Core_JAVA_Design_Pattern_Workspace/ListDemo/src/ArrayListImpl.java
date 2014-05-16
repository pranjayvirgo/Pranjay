import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ArrayListImpl {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayListDemo student1=new ArrayListDemo("pranjay","singh",26);
ArrayListDemo student2=new ArrayListDemo("gaurav","thakur",27);
ArrayListDemo student3=new ArrayListDemo("abhishek","jain",29);
ArrayListDemo student4=new ArrayListDemo("sumit","goel",23);
ArrayListDemo student5=new ArrayListDemo("vaibhav","agarwal",22);
ArrayListDemo student6=new ArrayListDemo("ankit","pratap",24);
List<ArrayListDemo> studentList=new ArrayList<ArrayListDemo>(15);
studentList.add(student1);
studentList.add(student2);
studentList.add(student3);
studentList.add(student4);
studentList.add(student5);
studentList.add(student6);
System.out.println(studentList);
Collections.sort(studentList);
System.out.println(studentList);
	}

}
