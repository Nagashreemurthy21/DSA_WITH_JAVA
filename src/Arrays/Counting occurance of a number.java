public static int countingOccurance(int n)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to count its occurance:");
		int numberOccurance=sc.nextInt();
		int count=0;
		while(n>0)
		{
			int rem=n%10;
			if(rem==numberOccurance)
			{
				count++;
			}
			n/=10;
		}
		return count;	
	}
