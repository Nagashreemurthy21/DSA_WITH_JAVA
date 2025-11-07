public static void skipCharacter(String p, String up,char skip)
	{	
		if(up.isEmpty())
		{
			System.out.println(p);
			return ;
		}
		char ch=up.charAt(0);
		if(ch==skip)
		{
			skipCharacter(p,up.substring(1),skip);
		}
		else
		{
			skipCharacter(p+ch,up.substring(1),skip);
		}
	}
