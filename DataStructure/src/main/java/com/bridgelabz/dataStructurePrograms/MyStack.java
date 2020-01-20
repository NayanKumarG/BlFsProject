package com.bridgelabz.dataStructurePrograms;

public class MyStack {
	
int capacity ; 
Object stk[];
int top;
//initialising the stack
public MyStack(int capacity)
{
	this.capacity = capacity;
	stk = new Object[capacity];
	top = -1;
}

//adding item to the stack
public void push(Object data)
{
	if(top == capacity-1)
	{
		System.out.println("Stack is overflow!!");
		return;
	}
	stk[++top] = data;
}

//removing top element
public Object pop()
{
if(top==-1)
{
	System.out.println("Stack is underflow!!");
	return null;
}
return stk[top--];
}

//size of stack
public int size()
{
	return top+1;
}

//returns peek value
public Object peek()
{
	if(top==-1)
	{
		System.out.println("Stack is underflow!!");
		return null;
	}
	return stk[top];
}

//search the item

public int search(Object data)
{
	for(int i = top ; i>=0 ; i++)
	{
		if(stk[i] == data)
		{
			return top-i+1;
		}
	}
	return 0;
}

public boolean isEmpty()
{
	if(top==-1)
		return true;
	else
		return false;
}

//displaying stack items
@Override
public String toString()
{
	String st = "[";
	for(int i=0 ; i<=top ; i++)
	{
		st = st+stk[i];
		if(i<top)
			st = st+",";
	}
	return st+"]";
	}

public static void main(String[] args) {
	MyStack stk = new MyStack(5);
	stk.push("Nayan");
	stk.push("Srijan");
	stk.push("Akshay");
	stk.push("Chethan");
	System.out.println(stk);
	System.out.println(stk.size());
	System.out.println(stk.pop());
	System.out.println(stk);
	System.out.println(stk.peek());
	
	
}
}


