
public class Link {
private Person person;
public Link next;
public Link(Person person) {
	super();
	this.person = person;
	
}
public void displayLink() // display ourself
{
System.out.print(person.getName()+" ");

}
}
