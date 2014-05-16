package SortingExamplePkgComparable;

public class Student implements Comparable<Student>{
private String firstname;
private String lastName;
private String fatherName;
private int age;
private Address address;
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}

public Student(String firstname, String lastName, String fatherName, int age,
		Address address) {
	super();
	this.firstname = firstname;
	this.lastName = lastName;
	this.fatherName = fatherName;
	this.age = age;
	this.address = address;
}
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getFatherName() {
	return fatherName;
}
public void setFatherName(String fatherName) {
	this.fatherName = fatherName;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
@Override
public int compareTo(Student s) {
	// TODO Auto-generated method stub
	//return firstname.compareTo(s.getFirstname());
	return address.compareTo(s.address);
}


}
