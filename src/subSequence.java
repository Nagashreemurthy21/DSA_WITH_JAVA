 public static ArrayList<String> subSequence(String p, String up)
	  {
		  if(up.isEmpty())
		  {
			  ArrayList<String> list= new ArrayList<>();
			  list.add(p);
			  return list;
		  }
		  char ch=up.charAt(0);
		  ArrayList<String> left = subSequence(p+ch,up.substring(1));
		  ArrayList<String> right = subSequence(p,up.substring(1));
		  left.addAll(right);
		  return left;
	  }
