public static double squarerootUsingBS(int n)
	{
		double root=0.0;
		int precision=3;
		int start=0;
		int end=n;
		while(start<end)
		{
			int middle=start+(end-start)/2;
			if(middle*middle == n)
			{
				root=middle;
				return middle;
			}
			else if (middle * middle < n) {
	            root = middle; // store the floor value
	            start = middle + 1;
	        } else {
	            end = middle - 1;
	        }
		}
		double increment=0.1;
		for(int i=0;i<precision;i++)
		{
			while(root*root <= n)
			{
				root+=increment;
			}
			root-=increment;
			increment/=10;
		}
		return root;
	}
