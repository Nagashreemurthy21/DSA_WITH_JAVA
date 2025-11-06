public static int countNumberOfZeroes(int n, int c)
	{
		if(n==0)
		{
			return c;
		}
		int rem=n%10;
		if(rem==0)
		{
			return countNumberOfZeroes(n/10,c+1);
		}
		return countNumberOfZeroes(n/10,c);
	}
