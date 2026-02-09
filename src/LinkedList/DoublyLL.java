public static class LL
	{
		private class Node
		{
			private int val;
			Node prev;
			Node next;
			public Node(int val)
			{
				this.val=val;
			}
			public Node(int val, Node prev, Node next)
			{
				this.val=val;
				this.prev=prev;
				this.next=next;
			}
		}
		private Node head;
		private Node tail;
		private int size;
		public LL()
		{
			this.size=0;
		}
		public Node insertFirst(int val)
		{
			Node node=new Node(val);
			node.next=head;
			node.prev=null;
			if(head!=null)
			{
				head.prev=node;
			}
			head=node;
			if (tail == null)
			{
			    tail = head;
			}
			size++;
			return node;
		}
		public Node insertLast(int val)
		{
			Node node=new Node(val);
			if(head==null)
			{
				head=tail=node;
				size++;
				return node;
			}
			tail.next=node;
			node.prev=tail;
			tail=node;
			tail.next=null;
			size++;
			return node;
		}
		public int deleteFirst()
		{
			if(head==null)
			{
				System.out.println("No list");
				return -1;
			}
			int val=head.val;
			head=head.next;
			if(head!=null)
			{
				head.prev=null;
			}
			else
		    {
		        tail=null;   
		    }
			size--;
			return val;
		}
		public Node getNode(int index)
		{
			Node temp=head;
			for(int i=1;i<index;i++)
			{
				temp=temp.next;
			}
			return temp;
			
		}
		public int deleteLast()
		{
			if(head==null)
			{
				System.out.println("No list");
				return -1;
			}
			int val = tail.val;
		    if (head == tail)
		    { 
		        head = null;
		        tail = null;
		    } 
		    else 
		    {
		        tail = tail.prev;
		        tail.next = null;
		    }
		    size--;
		    return val;
		}
		public void display()
		{
			Node temp=head;
			while(temp!=null)
			{
				System.out.print(temp.val+"->");
				temp=temp.next;
			}
			System.out.println("END");
		}
		public void displayRev()
		{
			Node temp=tail;
			while(temp!=null)
			{
				System.out.print(temp.val+"->");
				temp=temp.prev;
			}
			System.out.println("START");
		}
		public int countNodes()
		{
			int count=0;
			Node temp=head;
			while(temp!=null)
			{
				count++;
				temp=temp.next;
			}
			return count;
		}
	}
