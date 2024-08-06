
// Various ways to write methods in java

//-----------------------------------------
// With returntype with argument method
//------------------------------------------

// write a java program to check given number is even or odd
//	using with returntype with argument method

////////////////////////////////////////////////////////////////
//
//  Input   : 7
//
//  Output  : 7 is Odd number
//
////////////////////////////////////////////////////////////////

import java.util.*;

class Method_WithRet_WithArg3
{
	//callie method
	public static boolean even_odd(int a)
	{
		if(a%2==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	// main method
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();

		//caller method
		if(even_odd(n))
		{
			System.out.println(n+" is Even number");
		}
		else
		{
			System.out.println(n+" is Odd number");
		}
	}
}