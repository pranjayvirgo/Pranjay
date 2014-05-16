
public class StaticClass extends StaticClassTest{
	public  void print(){
		System.out.println("inside static class");
	}
	
public static void main(String[] args){
	StaticClassTest s=new StaticClass();
	s.print();	
}
}

class StaticClassTest{
	public  void print(){
		System.out.println("Inside Static Class Test");
	}
}