
// Various ways to write methods in java

//-----------------------------------------
// With returntype with argument method
//------------------------------------------

// write a java program to perform sum of two numbers using 
//	with returntype with argument method

////////////////////////////////////////////////////////////////
//
//  Input   : 10	20
//
//  Output  : 	Sum of two numbers is : 30
//				Mulitplication of two number is : 200
//
////////////////////////////////////////////////////////////////

import java.util.*;

class Method_WithRet_WithArg2
{
	//callie method
	public static int sum(int a, int b)
	{
		int c = a+b;
		return c;
	}

	//callie method
	public static int mulitplication(int i, int j)
	{
		int c = i*j;
		return c;
	}

	// main method
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First number : ");
		int a = sc.nextInt();

		System.out.println("Enter Second number : ");
		int b = sc.nextInt();

		//caller method
		int add = sum(a,b);
		System.out.println("Sum of two numbers is : "+add);

		//caller method
		System.out.println("Mulitplication of two number is : "+mulitplication(a,b));
	}
}