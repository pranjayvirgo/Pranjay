
public class ArrayListDemoComparatorProperty {
	public ArrayListDemoComparatorProperty(String firstName, String lastName,
			int age) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	String firstName;
	String lastName;
	int age;
	public String getFirstName() {
		return firstName;
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
	public ArrayListDemoComparatorProperty(String firstName) {
		super();
		this.firstName = firstName;
	}
}
