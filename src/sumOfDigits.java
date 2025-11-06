public static int sumOfDigits(int n)
	{
		if(n<=1)
		{
			return n;
		}
		return n%10 +sumOfDigits(n/10);
	}
