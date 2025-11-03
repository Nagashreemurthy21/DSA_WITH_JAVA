public static void cyclicSort(int[]arr)
	{
		int i=0;
		while(i<arr.length)
		{
			int correctIndex=arr[i]-1;
			if(arr[i]>=1 && arr[i]<=arr.length && arr[i]!=arr[correctIndex])
			{
				int temp=arr[i];
				arr[i]=arr[correctIndex];
				arr[correctIndex]=temp;
			}
			else
			{
				i++;
			}
		}
	}
