public static int numberOfDigitsInBaseb(int n, int base)
	{
		return (int)(Math.log(n)/Math.log(base))+1;
	}
