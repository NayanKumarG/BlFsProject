package com.bridgelabz.oop.datastructure;

public class StackLinkedList<T> {

	class Node
	{
		Node next;
		T data;
		public Node(T data)
		{
			this.data = data;
		}

	}
	Node top = null;
	int length=0;
	
	//add item to stack
	public void push(T data)
	{
		Node n = new Node(data);


		if(top == null)
		{
			top = n;
			length++;
			return;
		}
		n.next =top;
		top = n;
		length++;
	}

	//delete the top item
	public T pop()
	{
		T data =top.data;
		top = top.next;
		length--;
		return data;
	}

	//returns top item
	public T peek()
	{
		return top.data;
	}

	//size of the stack
	public int size()
	{
		return length;
	}

	//to check stack is empty or not
	public boolean isEmpty()
	{
		return length==0;
	}

	//reverse the stack
	public void reverse()
	{
		Node prev = null;
		Node next = null;
		Node temp = top;
		
		
	while(temp!=null)
	{
		next = temp.next;
		temp.next = prev;
		prev = temp;
		temp = next;
	}
	
	top = prev;
		
	}
	
	//search a object
	public boolean search(T data)
	{
		if(top==null)
		{
			return false;
		}
		Node t = top;
		while(t!=null)
		{
			if(t.data == data)
			{
				
				return true;
			}
			else
				t = t.next;
		}
		return false;
		
		
	}
	
	//display the stack item
	@Override
	public String toString()
	{
		String str ="";

		Node t = top;
		while(t!=null)
		{
			str = str+t.data;
			if(t.next!=null)
			{
				str=str+"-->";
			}
			t = t.next;
		}
		return str;
	}
	
	/*public static void main(String[] args) {
		StackLinkedList<Integer> sll = new StackLinkedList<Integer>();
		sll.push(11);
		sll.push(24);
		sll.push(33);
		sll.push(9);
		System.out.println(sll.size());
		System.out.println(sll);
		System.out.println(sll.search(2));
		System.out.println( sll.pop());
		System.out.println(sll);
		System.out.println(sll.peek());
		System.out.println(sll.isEmpty());
		System.out.println(sll.size());
	}*/
}
