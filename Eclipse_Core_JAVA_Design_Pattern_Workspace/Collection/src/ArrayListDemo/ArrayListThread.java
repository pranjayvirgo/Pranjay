package ArrayListDemo;

public class ArrayListThread extends Thread{

	/**
	 * @param args
	 */
	public void run(){
		ArrayListTest al=new ArrayListTest();
		al.employeeInsert();
		al.employeeList();
		al.employeeModify();
	}
	

}
