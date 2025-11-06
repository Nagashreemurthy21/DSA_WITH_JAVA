public static boolean isArraySorted(int[]arr, int index)
	{
		if(index==arr.length-1)
		{
			return true;
		}
		return arr[index]<arr[index+1] && isArraySorted(arr,index+1);
	}
