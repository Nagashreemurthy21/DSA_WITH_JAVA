public static int richestCustomerWealth(int[][]arr)
	{
		int max=0;
		for(int i=0;i<arr.length;i++)
		{
			int rowsum=0;
			for(int j=0;j<arr[i].length;j++)
			{
				rowsum+=arr[i][j];
			}
						if(rowsum>max)
			{
				max= rowsum;
			}
		}
		return max;
	}
