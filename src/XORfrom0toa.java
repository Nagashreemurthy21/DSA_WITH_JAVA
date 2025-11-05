public static int XORfrom0toa(int a)
	{
		if(a%4==0)
		{
			return a;
		}
		if(a%4==1)
		{
			return 1;
		}
		if(a%4==2) {
			return a+1;
		}
		if(a%4==3)
		{
			return 0;
		}
		return -1;
	}
