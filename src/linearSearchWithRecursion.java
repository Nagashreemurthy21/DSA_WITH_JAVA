public static int linearSearchWithRecursion(int[]arr,int target,int index)
	{
		if(index==arr.length-1)
		{
			return -1;
		}
		if(arr[index]==target)
		{
			return index;
		}
		return linearSearchWithRecursion(arr,target,index+1);
	}
