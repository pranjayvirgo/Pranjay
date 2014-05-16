package com.pranjay;

public class Stack {
private int maxSize;
private long[] stackArray;
private int top;

public Stack(int maxSize) {
	super();
	this.maxSize = maxSize;
	stackArray=new long[maxSize];
	top=-1;
}
public long pop(){
return	stackArray[top--];
}
public void push(long j){
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
