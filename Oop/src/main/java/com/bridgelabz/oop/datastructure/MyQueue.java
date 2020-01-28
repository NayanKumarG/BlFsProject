package com.bridgelabz.oop.datastructure;


public class MyQueue<T> {
	
	@SuppressWarnings("hiding")
	class Node<T>
	{
	T data;
    Node<T> next;
	public Node(T data)
	{
		this.data = data;
		
	}
	}
	Node<T> front;
	Node<T> rear;
	
	
	//method to add a node
	public void enqueue(T data)
	{
		Node<T> n = new Node<T>(data);
		if(rear == null)
		{
			front=rear=n;
			return;
		}
		
		while(rear.next!=null)
		{
			rear = rear.next;
		}
		rear.next=n;
		rear=n;
	}
	
	
	//method to delete node from front end
	public T dequeue()
	{
		if(front==null)
		{
			System.out.println("Queue is empty:");
			return null;
		}
		
		T data = front.data;
		front = front.next;
		
		return data;
		
	}
	
	//method to find size of queue
	public int size()
	{
		int size=0;
		Node<T> t = front;
		while(t!=null)
		{
			size++;
			t=t.next;
		}
		return size;
	}
	
	//search the item in queue
	public boolean search(T data)
	{
		if(front==null)
		{
			return false;
		}
		Node<T> t = front;
		while(t!=null)
		{
			if(t.data==data)
			{
				return true;
			}
			else
			{
				t = t.next;
			}
		}
		return false;
		
	}
	
	public String toString()
	{
		String str = "";
		Node<T> t = front;
		while(t != null)
		{
			str = str+t.data;
			if(t.next!=null)
				str =str + "-->";
			t = t.next;
		
		}
return str;
	}
	
	/*public static void main(String[] args) {

MyQueue<String> mq = new MyQueue<String>();
System.out.println(mq.search("Nayan"));
mq.enqueue("Nayan");
mq.enqueue("Kumar");
mq.enqueue("Akshay");

System.out.println(mq);
System.out.println(mq.size());
System.out.println(mq.search("Agf"));
mq.dequeue();


System.out.println(mq);
System.out.println(mq.size());
	}*/

}
