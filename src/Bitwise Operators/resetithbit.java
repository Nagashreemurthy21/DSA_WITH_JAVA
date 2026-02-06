public static String resetithbit(int n, int i)
	{
		int ans= (n & ~(1<<i));
		return Integer.toBinaryString(ans);
	}
