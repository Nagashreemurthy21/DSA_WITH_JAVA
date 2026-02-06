public static boolean isAsc(int[]arr)
	{
		int start=0;
		int end=arr.length-1;
		boolean isAsc=true;
		for(int i=start;i<end;i++)
		{
			if(arr[i]>arr[i+1])
			{
				isAsc=false;
			}
		}
		return isAsc;
	}
