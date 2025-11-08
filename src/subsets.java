  public static void subsets(String p, String up)
	    {
	    	if(up.isEmpty())
	    	{
	    		System.out.println(p);
	    		return ;
	    	}
	    	char ch=up.charAt(0);
	    	if(ch ==',')
	    	{
	    		subsets(p,up.substring(1));
	    	}
	    	else
	    	{
	    		subsets(p,up.substring(1));
	    	
		    	if(p.isEmpty())
		    	{
		    		subsets(p+ch, up.substring(1));
		    	}
		    	else
		    	{
		    		subsets(p+" "+ch,up.substring(1));
		    	}
	    	}
	    }
