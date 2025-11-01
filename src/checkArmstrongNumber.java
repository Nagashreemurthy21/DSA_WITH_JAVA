public static boolean isArmstrong(int n)
	{
		int originalNumber=n;
		int sum=0;
		while(n>0)
		{
			int rem=n%10;
			int cube=rem*rem*rem;
			sum+=cube;
			n/=10;	
		}
		return (sum==originalNumber);
	}
