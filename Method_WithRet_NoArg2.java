

// Various ways to write methods in java

//-----------------------------------------
// With returntype with No argument method
//------------------------------------------

// write a java program to sum of two number

////////////////////////////////////////////////////////////////
//
//  Input   : 10 	20
//
//  Output  : 30
//
////////////////////////////////////////////////////////////////

import java.util.*;

class Method_WithRet_NoArg2
{
	//callie method 
				//returntype
	public static int sum()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number : ");
		int a = sc.nextInt();

		System.out.print("Enter second number : ");
		int b = sc.nextInt();

		int c = a+b;
		return c;

	}

	public static void main(String[] args)
	{
		int add = sum();
		System.out.println("Sum of two number is : "+add);
	}
}