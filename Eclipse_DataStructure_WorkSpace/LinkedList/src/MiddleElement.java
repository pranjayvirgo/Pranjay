
public class MiddleElement {
	
		public static void main(String[] args)
		{
		LinkedList theList = new LinkedList(); // make new list
		theList.insertFirst(new Person("pranjay","26")); // insert four items
		theList.insertFirst(new Person("pranjay1","26"));
		theList.insertFirst(new Person("pranjay2","26"));
		theList.insertFirst(new Person("pranjay3","26"));
		theList.displayList(); // display list
		theList.findMiddle();
		}
}