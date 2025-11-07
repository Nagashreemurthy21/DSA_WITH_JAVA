public static int[] quickSort(int[]arr, int low, int high)
	{
		if(low>=high)
		{
			return arr ;
		}
		int s=low,e=high;
		int m=s+(e-s)/2;
		int pivot=arr[m];
		while(s<e)
		{
			while(arr[s]<pivot)
			{
				s++;
			}
			while(arr[e]>pivot)
			{
				e--;
			}
			if(s<=e)
			{
				int temp=arr[s];
				arr[s]=arr[e];
				arr[e]=temp;
				s++;
				e--;
			}
		}
		quickSort(arr,low,e);
		quickSort(arr,s,high);
		return arr;
		
		
	}
