package SortingExamplePkgComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import javax.security.auth.login.FailedLoginException;

public class StrudentImpl {
public static void main(String[] args)
{
	Student s1=new Student("Pranjay","Singh","Veer",28,new Address("sector-119","Noida"));
	Student s2=new Student("Shilpi","Shekhwat","Devendra",27,new Address("sector-119","Delhi"));
	Student s3=new Student("Apple","Babu","Tree",23,new Address("sector-119","Ghaziabab"));
	Student s4=new Student("Orange","Fruit","Juice",35,new Address("sector-119","Ahmedabad"));
	List ls=new ArrayList();
	ls.add(s1);
	ls.add(s2);
	ls.add(s3);
	ls.add(s4);
	Iterator<Student> it=ls.iterator();
	while(it.hasNext()){
		Student s=it.next();
		System.out.println("before sorting"+s.getAddress().getCity()+"  "+s.getFirstname());
		}
	AddressSort as=new AddressSort();
	Collections.sort(ls, as);
	Iterator<Student> t=ls.iterator();
	while(t.hasNext()){
		Student s=t.next();
		System.out.println("afetr sorting"+s.getAddress().getCity()+"  "+s.getFirstname());
			}
	FirstNameSort fs=new FirstNameSort();
	Collections.sort(ls, fs);
	Iterator<Student> tt=ls.iterator();
	while(tt.hasNext()){
		Student s=tt.next();
		System.out.println("afetr sorting"+s.getAddress().getCity()+"  "+s.getFirstname());
			}
	
	}
}
