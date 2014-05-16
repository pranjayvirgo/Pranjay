package com.pranjay;

public class Stack {
private int maxSize;
private char[] stackArray;
private int top;

public Stack(int maxSize) {
	super();
	this.maxSize = maxSize;
	stackArray=new char[maxSize];
	top=-1;
}
public char pop(){
return	stackArray[top--];
}
public void push(char j){
	stackArray[++top]=j;
}
public long peek(){
	return stackArray[top];
}
public boolean isEmpty() // true if stack is empty
{
return (top == -1);
}
//--------------------------------------------------------------
public boolean isFull() // true if stack is full
{
return (top == maxSize-1);
}
}
