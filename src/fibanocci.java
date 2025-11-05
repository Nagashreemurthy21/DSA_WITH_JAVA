
	public static int fibanocci(int n)
	{
		if(n<2)
		{
			return n;
		}
		return fibanocci(n-1)+fibanocci(n-2);
	}
