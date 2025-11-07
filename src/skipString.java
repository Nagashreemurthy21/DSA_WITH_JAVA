public static String skipString(String up)
	{
		if(up.isEmpty())
		{
			return " ";
		}
		if(up.startsWith("abc"))
		{
			return skipString(up.substring(3));
		}
		else
		{
			return up.charAt(0)+skipString(up.substring(1));
		}
	}
