
public class ArrayListDemo implements Comparable<ArrayListDemo>{
String firstName;
String lastName;
int age;
public String getFirstName() {
	return firstName;
}
public ArrayListDemo(String firstName, String lastName, int age) {
	super();
	this.firstName = firstName;
	this.lastName = lastName;
	this.age = age;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
@Override
	public String toString() {
		// TODO Auto-generated method stub
	//	return super.toString();
return(firstName+" "+lastName+" "+age);	
}
@Override
public int compareTo(ArrayListDemo a) {
	// TODO Auto-generated method stub
	Integer i=new Integer(age);
	return new Integer(age).compareTo(a.getAge());
}
}
