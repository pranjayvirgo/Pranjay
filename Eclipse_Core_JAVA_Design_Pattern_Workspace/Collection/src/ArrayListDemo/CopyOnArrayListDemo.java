package ArrayListDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnArrayListDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list=new ArrayList();
		list.add("pranjay");
		list.add("shilpi");
		Iterator it=list.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
			//list.add("veer");
			
		}
		CopyOnWriteArrayList list1=new CopyOnWriteArrayList();
		list1.add("pranjay");
		list1.add("shilpi");
		Iterator it1=list1.iterator();
		while(it1.hasNext()){
			System.out.println(it1.next());
			list1.add("veer");
			System.out.println(it1.next());
		
		}
		System.out.println(list1.size());
		Iterator it2=list1.iterator();
		while(it2.hasNext()){
			System.out.println(it2.next());
	}
	}

}
