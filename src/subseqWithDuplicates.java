public static void subseqWithDuplicates(char[]str, int index, String current)
	  {
		  System.out.println(current);
		  for(int i=index;i<str.length;i++)
		  {
			  if(i>index && str[i]==str[i-1])continue;
			  subseqWithDuplicates(str,i+1,current+str[i]);
		  }
	  }
