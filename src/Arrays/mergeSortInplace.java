public static int[] mergeSortInplace(int[]arr,int start,int end)
	{
		if(end-start==1)
		{
			return arr;
		}
		int mid=start+(end-start)/2;;
		mergeSortInplace(arr,start,mid);
		mergeSortInplace(arr,mid,end);
		return mergeInplace(arr,start,mid,end);	
	}
	public static int[] mergeInplace(int[]arr,int s,int m,int e)
	{	
		int i=s,j=m,k=0;
		int[]mix=new int[e-s];
		while(i<m && j<e)
		{
			if(arr[i]<arr[j])
			{
				mix[k]=arr[i];
				i++;
			}
			else
			{
				mix[k]=arr[j];
				j++;
			}
			k++;
		}
		while(i<m)
		{
			mix[k]=arr[i];
			i++;
			k++;
		}
		while(j<e)
		{
			mix[k]=arr[j];
			j++;
			k++;
		}
		for(int l=0;l<mix.length;l++)
		{
			arr[s+l]=mix[l];
		}
		return mix;
	}
	
