public static int stepsToReduceToZero(int n, int steps)
	{
		if(n==0)
		{
			return steps;
		}
		if(n%2==0)
		{
			return stepsToReduceToZero(n/2,steps+1);
		}
		return stepsToReduceToZero(n-1,steps+1);
	}
