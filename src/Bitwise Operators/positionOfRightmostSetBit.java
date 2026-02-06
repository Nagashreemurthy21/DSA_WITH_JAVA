public static int positionOfRightmostSetBit(int n)
	{
		int position=1;
		while((n&1)==0)
		{
			n=n>>1;
			position++;
		}
		return position;
	}
