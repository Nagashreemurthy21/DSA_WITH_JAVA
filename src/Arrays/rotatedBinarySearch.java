public static int rotatedBinarySearch(int[]arr,int target,int start, int end)
	{
		if(start>end)
		{
			return -1;
		}
		while(start<=end)
		{
			int mid=start+(end-start)/2;
			if(target==arr[mid])
			{
				return mid;
			}
			if(arr[start]<=arr[mid])
			{
				if(target>=arr[start] && target<=arr[mid])
				{
					end=mid-1;
				}
				else
				{
					start=mid+1;
				}
			}
			else
			{
				if(target>=arr[mid] && target<=arr[end])
				{
					start=mid+1;
				}
				else
				{
					end=mid-1;
				}
			}	
			
		}
		return -1;
	}
