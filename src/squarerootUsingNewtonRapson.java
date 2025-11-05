public static double squarerootUsingNewtonRapson(double n)
	{
		double x=n;
		double root;
		while(true)
		{
			root=0.5 * (x+(n/x));
			if(Math.abs(root-x)<1)
			{
				break;
			}
			x=root;
		}
		return root;
	}
