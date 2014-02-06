package com.pranjay;

public class StackTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="pranjay%%%%%%%%**********########";
		char[] ch=s.toCharArray();
		Stack theStack = new Stack(ch.length);
		for(int i=0;i<ch.length;i++){
			if(!theStack.isFull()){
				theStack.push(ch[i]);
				System.out.println(ch[i]); 
			}
		}
		while (!theStack.isEmpty()) // until it’s empty,
		{ // delete item from stack
			char value = theStack.pop();
			System.out.print(value); // display it
			System.out.print(" ");
		} // end while
		System.out.println(" ");
	} // end main()

	}