public static void calculator()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the operator:");
		char op=sc.next().trim().charAt(0);
		System.out.println("Enter values for a and b:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		switch(op)
		{
			case '+': 	System.out.println(a+b);
						break;
			case '-':   System.out.println(a-b);
						break;
			case '*':   System.out.println(a*b);
						break;
			case '/':   if(b!=0)
						{
							System.out.println(a/b);
						}
						System.out.println("Division by zero error");
						break;
			case '%':   System.out.println(a%b);
						break;
			case '^':   System.out.println(Math.pow(a, b));
						break;
			default:    System.out.println("enter valid operator");
						break;
						
		}
	}
