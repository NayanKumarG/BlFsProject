package com.bridgelabz.dataStructurePrograms;

public class UnorderedLinkedList<T> {
	
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
	  Node<T> head;

		//method to insert a node
		public boolean add(T data)
		{
			Node<T> n = new Node<T>(data);	
			if(head == null)
			{
				head = n;
				return true;
			}
			Node<T> t = head;
		
			while(t.next!=null)
			{
				if(t.data.equals(data))
				return false;
			t = t.next;
			}
			t.next = n;
			return true;
			

		}
		
		// method to remove a node
		public void remove(T data)
		{
			if(head == null)
			{
				System.out.println("no elements found");
				return;
			}
			
			if(head.data.equals(data))
			{
				head = head.next;
				return;
			}
			Node<T> t = head;
			Node<T> prev = head;
			while(t!=null)
			{
				prev = t;
				if(t.next.data.equals(data))
				{
				prev.next = t.next.next;
				t=prev;
				return;
				}
				t = t.next;
			}
			
		}
		
		//to check list is empty or not
		public boolean isEmpty()
		{
			if(head==null)
				return true;
			else
			return false;
			
		}
		
		//to find size of list
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
		
		//appending node to last
		public void append(T data)
		{
			Node<T> n = new Node<T>(data);
			if(head==null)
			{
				head = n;
				return;
			}
			Node<T> t = head;
			while(t.next!= null)
			{
				if(t.data==data)
				{
					return;
				}
				else
				t = t.next;
			}
			t.next = n;
			
		}
		
		//returns position of item
		public int index(T data)
		{
			if(head == null)
			{
				System.out.println("The list is empty:");
				return 0;
			}
			Node<T> t = head;
			int in = 0;
			while(t.next!=null)
			{
				if(t.data == data)
				{
					return in;
				}
				t = t.next;
				in++;
				
			}
			if(t.data==data)
				return in;
			else
			{
				System.out.println("The item not found");
			return in;
			}
		}
		
		//insert node at particular index
		public void insertAt(T data , int pos)
		{
			Node<T> n = new Node<T>(data);
			if(pos == 0)
			{
				n.next = head;
				head = n;
				return;
			}
			Node<T> t =head;
			while(pos>1 && t!=null)
			{
				pos--;
				t = t.next;
			}
			if(t!=null)
			{
				n.next = t.next;
				t.next = n;
				return;
			}
			else
			{
				System.out.println("Given position not possible");
			}
			
		}
		
		//delete last element
		public T deleteLast()
		{
			if(head == null)
			{
				System.out.println("List is empty");
				return null;
			}
			Node<T> t = head;
			Node<T> t1 =head;
			while(t.next!=null)
			{
				t1=t;
				t =t.next;
			}
			t1.next = null ;
			return t.data;	
		}
		
		//delete at position
		public T deletePos(int pos)
		{
			if(head == null)
			{
				System.out.println("List is empty");
				return null;
			}
			if(pos==0)
			{
				T data = head.data;
				head = head.next;
				return data;
			}
			Node<T> t = head;
			while(pos>1 && t!=null)
			{
				pos--;
				t = t.next;
			}
			if(t.next!= null)
			{
				T data = t.next.data;
				t.next = t.next.next;
				return data;
			}
			return null;	
		}
		
		//search a node
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
				if((t.data).equals(data))
				{
					return true;
				}
				t = t.next;
			}
			return false;
			
		}
		
		//get the data as a string
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
		
		
		//To display the data
		@Override
		public String toString()
		{
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
		
		/*public static void main(String[] args) 
		{
			UnorderedLinkedList sl = new UnorderedLinkedList();
			sl.add(5);
			sl.add(7);
			sl.add(5);
			sl.add(10);
			sl.add(7);
			System.out.println(sl);
		   // System.out.println(sl.index(11));
			System.out.println(sl.size());
			//sl.remove(10);
			//System.out.println(sl);
			//System.out.println(sl.size());
			//sl.insertAt(12, 5);
			//System.out.println(sl);
			sl.append(15);
			sl.remove(7);
			System.out.println(sl);
			System.out.println(sl.size());
			//System.out.println(sl);
			//System.out.println("List is empty:"+sl.isEmpty());
			//System.out.println("delete last:"+sl.deleteLast());
			//System.out.println(sl.deletePos(2));
			//System.out.println(sl);
		}	*/
	}

