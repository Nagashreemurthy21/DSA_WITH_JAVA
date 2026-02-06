public static int duplicateNumber(int[]arr)
	{
		int i=0;
		while(i<arr.length)
		{
			int correctIndex=arr[i]-1;
			if(arr[i]<arr.length && arr[i]!=arr[correctIndex])
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
		for(int index=0;index<arr.length;index++)
		{
			if(arr[index]!=index+1)
			{
				return arr[index];
			}
		}
		return arr.length;
	}
