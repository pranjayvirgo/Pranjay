package generics;

import java.util.ArrayList;
import java.util.List;

public class TestBadLegacy {

	/**
	 * @param args
	 */
	
	static List<Integer> myList=null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myList=new ArrayList<Integer>();
		myList.add(4);
		myList.add(8);

Inserter in=new Inserter();
in.insert(myList);
	}
@Override
public String toString() {
	// TODO Auto-generated method stub
	return "mylist is"+myList;
}
}
