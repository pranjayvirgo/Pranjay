package ArrayListDemo;

import java.util.ArrayList;

public class ArrayThreadImpl {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayListThread t1=new ArrayListThread();
		ArrayListThread t2=new ArrayListThread();
		ArrayListThread t3=new ArrayListThread();
		ArrayListThread t4=new ArrayListThread();
        t1.start();
        t2.start();
        t3.start();
        t4.start();
	}

}
