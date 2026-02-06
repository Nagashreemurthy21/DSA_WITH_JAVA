public static ArrayList<Integer> findAllIndex(int[]arr, int target, int index)
	{
		ArrayList<Integer> list=new ArrayList<>();
		if(index==arr.length)
		{
			return list;
		}
		if(arr[index]==target)
		{
			list.add(index);
		}
		ArrayList<Integer> listFromBelowCalls= findAllIndex(arr,target,index+1);
		list.addAll(listFromBelowCalls);
		return list;
	}
