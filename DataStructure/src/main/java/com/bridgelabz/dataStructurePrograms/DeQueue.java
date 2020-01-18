package com.bridgelabz.dataStructurePrograms;


public class DeQueue<T> {

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
	
	
	//add first
	public void addFront(T data)
	{
		Node<T> n = new Node<>(data);
		if(front==null)
		{
			n.next = front;
			front= rear = n;
			return;
		}
		n.next = front;
		front = n;
		
		
	}
	
	
	//add at rear
	public void addRear(T data)
	{
		Node<T> n = new Node<T>(data);
		if(rear == null)
		{
			rear=front=n;
			return;
		}
		
		while(rear.next!=null)
		{
			rear = rear.next;
		}
		rear.next=n;
		rear=n;
	}
	
	//delete front
	public T removeFront()
	{
		if(front==null)
		{
			System.out.println("Queue is empty:");
			return null;
		}
		
		T data= front.data;
		front = front.next;
		
		return data;
		
	}
	
	//remove from rear
	public T removeRear()
	{
		if(rear==null) {
			System.out.println("Queue is empty:");
			return null;
		}
		if(rear==front)
		{
			T data = rear.data;
			rear=front=null;
			return data;
		}
		while(rear.next!=null)
		{
			rear=rear.next;
		}
		Node<T> t = front;
		while(t.next.next != null)
		{
			t=t.next;
		}
		T c= t.next.data;
		t.next = null;
		rear = t;
		return c;
		
	}
	
	//to check queue is empty or not
	public boolean isEmpty()
	{
		return front==null;
	}
	
	//to check size of queue
	public int size()
	{
		Node<T> t = front;
		int size = 0 ;
		if(isEmpty())
		{
			return 0;
		}
		while(t!=null)
		{
			size++;
			t = t.next;
		}
		return size;
	}


	//display the queue
	public String toString()
	{
		String str ="";
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
	

	
	public static void main(String[] args) {
DeQueue<Integer> dq = new DeQueue<>();
dq.addFront(1);
dq.addRear(2);
dq.addRear(3);
dq.addFront(5);
//dq.display();
System.out.println(dq.size());
System.out.println(dq);
dq.removeFront();
System.out.println(dq);
dq.removeRear();
System.out.println(dq);
System.out.println(dq.size());



	}

}
