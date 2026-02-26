public static int[] searchIn2DArrays(int[][]arr,int target)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				if(arr[i][j]==target)
				{
					return new int []{i,j};
				}
			}
		}
		return new int[] {-1,-1};
	}
