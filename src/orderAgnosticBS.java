public static boolean isAsc(int[]arr) {
		int start=0;
		int end=arr.length-1;
		if(arr[start]<arr[end])
		{
			return true;
		}
		return false;
	}
	public static int orderAgnosticBS(int[]arr,int target)
	{
		int start=0;
		int end=arr.length-1;
		if(isAsc(arr))
		{
			while(start<=end)
			{
				int mid=start+(end-start)/2;
				if(arr[mid]==target)
				{
					return mid;
				}
				if(target>arr[mid])
				{
					start=mid+1;
				}
				if(target<arr[mid])
				{
					end=mid-1;
				}
			}
		}
		else
		{
			while(start<=end)
			{
				int mid=start+(end-start)/2;
				if(arr[mid]==target)
				{
					return mid;
				}
				if(target>arr[mid])
				{
					end=mid-1;
				}
				if(target<arr[mid])
				{
					start=mid+1;
				}
			}
		}
		return -1;
	}
