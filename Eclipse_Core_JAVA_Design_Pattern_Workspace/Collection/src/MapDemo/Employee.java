package MapDemo;

public class Employee {
private int employeeNumber;
private String employeeName;

public Employee(int employeeNumber, String employeeName) {
	super();
	this.employeeNumber = employeeNumber;
	this.employeeName = employeeName;
}
public int getEmployeeNumber() {
	return employeeNumber;
}
public void setEmployeeNumber(int employeeNumber) {
	this.employeeNumber = employeeNumber;
}
public String getEmployeeName() {
	return employeeName;
}
public void setEmployeeName(String employeeName) {
	this.employeeName = employeeName;
}
@Override
public boolean equals(Object o) {
	// TODO Auto-generated method stub
	if (o == this)
		return true;
		if (!(o instanceof Employee))
		return false;
		Employee pn = (Employee)o;
		return pn.employeeNumber == employeeNumber;
		
}

@Override
public int hashCode() {
	// TODO Auto-generated method stub
	      int result = 12;
	      result=employeeName.hashCode();
	      result=((Integer)employeeNumber).hashCode();
	      result = 12*(result+employeeName.hashCode());
	      //System.out.println(result);
	      //result = HashCodeUtil.hash( result, employeeName );

	return result;
}

}
