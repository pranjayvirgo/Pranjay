
public class PersonUtil {

	
	
public void populatePerson()
{
	Person person=new Person();
	person.setAge(28);
	person.setName("Pranjay");
	Person per=modifyPerson(person,"test");
	System.out.println(per.getAge());
	System.out.println(per.getName());
}
public Person modifyPerson(Person p,String s){
	p.setAge(29);
	p.setName("singh");
	return p;
	
}
}

