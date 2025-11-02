public static int ceilingOfaNumber(int[]arr,int target)
	{
		int start=0;
		int end=arr.length-1;
		for(int i=start;i<=end;i++)
		{
			while(start<=end)
			{
				int mid=start+(end-start)/2;
				if(target==arr[mid])
				{
					return mid;
				}
				if(target>arr[mid])
				{
					start=mid+1;
				}
				else if(target<arr[mid])
				{
					end=mid-1;
				}
			}
		}
		return arr[start];
	}
