public static int searchInRotatedSortedArray(int[]arr)
	{
		int start=0;
		int end=arr.length-1;
		while(start<=end)
		{
			int mid=start+(end-start)/2;
			if(mid<end && arr[mid]>arr[mid+1])
			{
				return mid;
			}
			if(mid<end && arr[mid]<arr[mid-1])
			{
				return mid-1;
			}
			if(arr[start]<arr[mid])
			{
				start=mid+1;
			}
			if(arr[start]>arr[mid])
			{
				end=mid-1;
			}
		}
		return -1;
	}
	public static int answer(int[]arr, int target)
	{
		int pivot=searchInRotatedSortedArray(arr);
		if(pivot==-1)
		{
			return orderAgnosticBS(arr,target,0,arr.length-1);
		}
		if(arr[pivot]==target)
		{
			return pivot;
		}
		if(target>=arr[0])
		{
			return orderAgnosticBS(arr,target,0,pivot-1);
		}
		return orderAgnosticBS(arr,target,pivot+1,arr.length-1);
	}
	public static boolean isAsc(int[]arr) {
		int start=0;
		int end=arr.length-1;
		if(arr[start]<arr[end])
		{
			return true;
		}
		return false;
	}
	public static int orderAgnosticBS(int[]arr,int target,int start,int end)
	{
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
	
