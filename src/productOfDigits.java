public static int productOfDigits(int n)
	{
		if(n<=1)
		{
			return n;
		}
		return n%10 * productOfDigits(n/10);
	}
