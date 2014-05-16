package MapDemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;



public class MapImpl{
public static void main(String[] args)
{
	 Employee e1=new Employee(1,"Pranjay");
	 Employee e2=new Employee(2,"Shilpi");
	 Employee e3=new Employee(3,"Ankit");
	 Employee e4=new Employee(4,"Gaurav");
	Map<Employee,String> m=new HashMap<Employee,String>();
	m.put(e1, "pranjay");
	m.put(e2, "shilpi");
	m.put(e3, "veer");

	 
	Iterator it =m.entrySet().iterator();
	while(it.hasNext()){
		//String e23=(String)it.next();
		System.out.println("in iterator"+it.next());
	}
	System.out.println(m.get(e2));
	Map<String,Employee> m1=new HashMap<String,Employee>();
	m1.put("pranjay",e1);
	m1.put("shilpi",e2);
	m1.put("veer",e3);
	Employee s1=m1.get("veer");
	//System.out.println(m1.get("pranjay").hashCode());
	System.out.println("EmployeeName           "+s1.getEmployeeName());
}
}
