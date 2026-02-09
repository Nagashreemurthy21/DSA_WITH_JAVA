public static class LL
	{
		public class Node
		{
			private int val;
			private Node next;
			public Node(int val)
			{
				this.val=val;
			}
			public Node(int val, Node next)
			{
				this.val=val;
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
			if(head==null)
			{
				tail=node;
			}
			node.next=head;
			head=node;
			size++;
			return node;
		}
		public Node insertLast1(int val)
		{
			Node node=new Node(val);
			if(tail==null)
			{
			    head = tail = node;
			    size++;
			    return node;
			}
			tail.next=node;
			tail=node;
			size++;
			return node;
		}
		public Node insertLast2(int val)
		{
			Node node=new Node(val);
			if (head == null) 
			{
			    head = tail = node;
			    size++;
			    return node;
			}
			Node temp=head;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=node;
			tail=node;
			size++;
			return node;
		}
		public int deleteFirst()
		{
			if(head==null)
			{
				System.out.println("LL is empty");
				return -1;
			}
			int val = head.val;
            head = head.next;

            if (head == null)
            { 
                tail = null;
            }
            size--;
            return val;
		}
		public Node getNode(int index)
		{
			Node temp=head;
			for(int i=0;i<index;i++)
			{
				temp=temp.next;
			}
			return temp;
		}
		public int deleteLast()
		{
			if(head==null)
			{
				System.out.println("LL is empty");
				return -1;
			}
			if (size == 1) 
			{   
                return deleteFirst();
            }
			Node secondLast=getNode(size-2);
			int val=tail.val;
			tail=secondLast;
			tail.next=null;
			size--;
			return val;
		}
		public void display()
		{
			Node temp=head;
			if(head==null)
			{
				System.out.println("List is empty");
				return;
			}
			while(temp!=null)
			{
				System.out.print(temp.val +"->");
				temp=temp.next;
			}
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
		public Node insertAtSpecificPos(int val, int index)
		{
			Node node=new Node(val);
			if(index==0)
			{
				return insertFirst(val);
			}
			if(index==size)
			{
				return insertLast1(val);
			}
			Node temp=head;
			for(int i=1;i<index;i++)
			{
				temp=temp.next;
			}
			node.next = temp.next;
			temp.next=node;
			temp=node;
			size++;
			return node;
		}
		public int deleteAtSpecificPos(int index)
		{
			if(index==0)
			{
				return deleteFirst();
			}
			if(index==size)
			{
				return deleteLast();
			}
			Node prev=getNode(index-1);
			int val=prev.next.val;
			prev.next=prev.next.next;
			size--;
			return val;
		}
	}
