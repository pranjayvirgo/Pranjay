import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;


public class PersonMethodReplacer implements MethodReplacer {

	@Override
	public Object reimplement(Object target, Method method, Object[] arg)
			throws Throwable {
		System.out.println("inside replacer method");
	System.out.println(method.getName());
	
	Person p=(Person)arg[0];
	String s=(String)arg[1];
	System.out.println(p.getAge());
	System.out.println(p.getName());
	System.out.println(s);
	p.setAge(32);
	p.setName("SinghFromReplacer");
		return p;
	}

}
