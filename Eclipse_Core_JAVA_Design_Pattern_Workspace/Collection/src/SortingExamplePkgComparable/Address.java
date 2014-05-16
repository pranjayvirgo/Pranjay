 package SortingExamplePkgComparable;

public class Address {
private String street;
public String city;
public Address(String street, String city) {
	super();
	this.street = street;
	this.city = city;
}

public String getStreet() {
	return street;
}
public void setStreet(String street) {
	this.street = street;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}

public int compareTo(Address address) {
	// TODO Auto-generated method stub
	return city.compareTo(address.city);
}


}
