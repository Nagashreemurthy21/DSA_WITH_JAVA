public void removeDuplicates()
		{
			if (head == null) return;
			Node temp=head;
			while(temp!=null &&temp.next!=null)
			{
				if(temp.next!=null && temp.value==temp.next.value)
				{
					temp.next=temp.next.next;
					size--;
				}
				else
				{
					temp=temp.next;
				}
			}
			tail=temp;
			
		}
