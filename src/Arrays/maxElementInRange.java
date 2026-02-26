public static int maxElementInRange(int[]arr,int start,int end)
	{
		int max=arr[0];
		for(int i=start;i<=end;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		return max;
	}
