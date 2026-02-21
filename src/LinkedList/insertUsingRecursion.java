public Node insertUsingRecursion(int value,int index,Node node)
		{
			if(index==0)
			{
				Node temp=new Node(value,node);
				size++;
				return temp;
			}
			node.next=insertUsingRecursion(value,index-1,node.next);
			return node;
		}
		public void insertUsingRecursion(int value,int index)
		{
			head=insertUsingRecursion(value,index,head);
		}