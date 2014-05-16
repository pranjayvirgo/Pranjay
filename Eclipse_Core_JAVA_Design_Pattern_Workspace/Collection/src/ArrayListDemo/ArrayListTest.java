package ArrayListDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class ArrayListTest {

	/**
	 * @param args
	 */
	
		// TODO Auto-generated method stub
	List l1=null;
	public void employeeModify()
	{
		System.out.println("in nodify"+l1.size());
		l1.remove(2);
		System.out.println("after nodify"+l1.size());
	}
	public void employeeInsert(){
		System.out.println(Thread.currentThread().getName());
	 l1=new ArrayList<Employee>();
	 Employee e1=new Employee(1,"Pranjay");
	 Employee e2=new Employee(2,"Shilpi");
	 Employee e3=new Employee(3,"Ankit");
	 Employee e4=new Employee(4,"Gaurav");
	 l1.add(e1);
	 l1.add(e2);
	 l1.add(e3);
	 l1.add(e4);
	 //l1.subList(1,2);
	// Collections.synchronizedList(l1);
	}
			
			public void employeeList(){
	if(l1!=null){			
	ListIterator<Employee> it=l1.listIterator();
	 while(it.hasNext()){
		Employee e=it.next();
		 System.out.println(e.getEmployeeNumber()+ "     "+e.getEmployeeName());
	 }
	// ListIterator<Employee> il=l1.listIterator();
	 while(it.hasPrevious()){
	 Employee el=it.previous();
	 System.out.println(el.getEmployeeNumber()+ "     "+el.getEmployeeName());
	 }
	}
	else{
	System.out.println("List is empty");
	}
	}
	
}