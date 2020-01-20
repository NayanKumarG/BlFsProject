package com.bridgelabz.dataStructurePrograms;


public class HashTable {

class Node
{
	Node next;
	int data;

	public Node(int data)
	{
		this.data = data;
		next = null;
	}
}
	private Node[] array;
	private int size;

	public HashTable(int arraysize)
	{
		array = new Node[arraysize];
		size = 0;
	}

	//to check empty or not
	public boolean isEmpty()
	{
		return size==0;
	}

	//to get the index
	public int getIndex(int value)
	{	

		int index = value/11;
		return index;

	}

	//add values
	public void add(int value)
	{
		Node n = new Node(value);
			size++;
			
			int pos = getIndex(value);
			
			if(array[pos] == null)
			{
				array[pos] = n;
				return;
			}
		
		n.next = array[pos];
		array[pos] = n;
		
	}
	
	//remove an element
	public void remove(int value)
	{
		int pos = getIndex(value);
		Node start = array[pos];
		Node t = start;
		if(start.data == value)
		{
		size--;
		array[pos] = start.next;
		return;
		}
		
		while(t.next!=null)
		{
			if(t.next.data==value)
			{
				t.next = t.next.next;
				return;
			}
			t = t.next;
		}
		size++;
		System.out.println("Element not found");
	
	}

	//check the value
	public boolean search(int value)
	{
		int pos = getIndex(value);
		Node start = array[pos];
		Node t = start;
		if(start.data == value)
		{
			return true;
		}

		while(t.next!=null)
		{
			if(t.next.data==value)
			{
				return true;
			}
			t = t.next;
		}
		return false;

	}
	
	//get data
	public String getData(int i)
	{
		String st ="";
		Node start = array[i];
		st = st+"slot"+i+":";
		if(array[i]==null)
			return st;
		while(start!=null)
		{
		if(start.next!=null)
		{
			st=st+start.next.data;
			st=st+" ";
		}
		start =start.next;
		}
		return st;
		
	}
	
	//display the hash table
	public void display()
	{
		for(int i=0 ; i<array.length ; i++)
			{
			Node start = array[i];
			System.out.print("slot"+(i)+":");
			while(start != null)
			{
				System.out.print(start.data+" ");
				start = start.next;
			}
			System.out.println();
			}
	}


/*	public static void main(String[] args) {
HashTable ht = new HashTable(10);

ht.add(10);
ht.add(11);
ht.add(25);
ht.add(33);
ht.add(43);
ht.add(57);
ht.add(60);
ht.display();

	}*/

}
