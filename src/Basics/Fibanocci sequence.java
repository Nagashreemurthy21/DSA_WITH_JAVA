public static void fibanocci(int n)
	{
		int firstNum=0;
		int secondNum=1;
		for(int i=1;i<=n;i++)
		{
			System.out.println(firstNum);
			int nextNum=firstNum+secondNum;
			firstNum=secondNum;
			secondNum=nextNum;
		}
	}
