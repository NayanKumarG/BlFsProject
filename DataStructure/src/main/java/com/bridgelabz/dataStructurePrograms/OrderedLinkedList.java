package com.bridgelabz.dataStructurePrograms;

//import com.bridgelabz.dataStructurePrograms.UnorderedLinkedList.Node;

public class OrderedLinkedList<T extends Comparable<T>> {
	
	
	 Node<T> head;
	
	@SuppressWarnings("hiding")
	class Node<T>
	{
		Node<T> next;
		T data;
		public Node(T data)
		{
			this.data = data;
		}
	}

 

  
//method to insert node in order
	public void add(T data)
	{
		Node<T> n = new Node<T>(data);
		Node<T> t=head;
		if(head==null || head.data.compareTo(n.data)>0)
		{
			n.next = head;
			head = n;
			return;
		}
		if(head==null || head.data.compareTo(n.data)==0)
		{
			n.next = head;
			head = n;
			return;
		}
	
		
		while(t.next!=null && t.next.data.compareTo(n.data)<0)
		{
			t=t.next;
			
		}
		n.next = t.next;
		t.next = n;
	}
	
	//search given number
	public boolean search(T data)
	{
		if(head == null)
		{
			System.out.println("list is empty:");
			return false;
			
		}
		Node<T> t = head;
		while(t!=null)
		{
			if(t.data.compareTo(data)==0)
			{
				return true;
			}
			t = t.next;
		}
		return false;
		
	}
	
	//return the list data
	public String getData()
	{
		String str="";
		Node<T> t = head;
		while(t!=null) {
			str = str+t.data;
			if(t.next!=null)
			{
				str=str+",";
			}
		}
			
		return str;
		
	}
	
 //method to remove item
  public void remove(T data)
  {

		if(head == null)
		{
			System.out.println("no elements found");
			return;
		}
		
		if(head.data.compareTo(data)==0)
		{
			head = head.next;
			return;
		}
		Node<T> t = head;
		Node<T> prev = head;
		while(t!=null)
		{
			prev = t;
			if(t.next.data==data)
			{
			prev.next = t.next.next;
			t=prev;
			return;
			}
			t = t.next;
		}
  }
  
  //check list is empty or not 
  public boolean isEmpty()
  {
		if(head==null)
			return true;
		else
		return false;
	  
  }
  
  //size of list
  public int size()
  {
		int count = 1;
		Node<T> t = head;
		if(head==null)
		{
		return 0;
		}
		while(t.next!=null)
		{
			t=t.next;
			count++;
		}
		return count;
	  
  }
  
  //to display the list
  @Override
public String toString() {
	String s = "";
		Node<T> t = head;
		while(t!=null)
		{
			s=s+t.data;
			if(t.next!=null)
			{
				s=s+"-->";
			}
			t = t.next;
		}
		
		return s;
  }
  
  
  
  
  
  
  
  
	/*public static void main(String[] args) {
       
		OrderedLinkedList<Integer> oll = new OrderedLinkedList<Integer>();
		oll.add(12);
		oll.add(15);
		oll.add(10);
		oll.add(13);
		oll.add(5); 
		System.out.println(oll);
		//System.out.println(oll.size());
		System.out.println(oll.isEmpty());
		//oll.remove(11);
		//System.out.println(oll);
		
	}*/

}
