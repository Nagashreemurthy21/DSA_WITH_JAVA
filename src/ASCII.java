
	package DSA;
	import java.util.*;

	public class Practicee {

	    public static void main(String[] args) {
	    	for(char ch='a';ch<='z';ch++)
	    	{
	    		ASCII(" ",Character.toString(ch));
	    	}
	    }
	  
	    public static void ASCII(String p, String up)
	    
	    {
	    	if(up.isEmpty())
	    	{
	    		System.out.println(p);
	    		return;
	    	}
	    	char ch=up.charAt(0);
	    	ASCII(p+ch+"->"+(int)ch,up.substring(1));
	    	ASCII(p,up.substring(1));
	    }
	}


