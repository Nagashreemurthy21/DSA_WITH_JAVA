public static int numberOfDigits(int n)
	{
		return (int)(Math.log10(n))+1;
	}
	public static boolean isEven(int n)
	{
		int digit=numberOfDigits(n);
		return (digit%2==0);
	}
	public static int EvenNumberOfDigits(int[]arr)
	{
		int count=0;
		for(int num:arr)
		{
			if(isEven(num))
			{
				count++;
			}
		}
		return count;
	}
