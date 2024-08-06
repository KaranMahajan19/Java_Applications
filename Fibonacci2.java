//	Write a java program to display reverse of a given number

// Write a java program to find out Fibonacci series of given number

////////////////////////////////////////////////////////////
//
//	Input	:	5
//
//	Output	:	0 1 1 2 3 5
//
////////////////////////////////////////////////////////////

import java.util.*;
class Fibonacci2
{
	public static void main(String[] args)
	{
		Scanner sc  = new Scanner(System.in);
		System.out.print("Enter a number : ");

		int n = sc.nextInt();

		int a=0, b=1, c;
		//System.out.print(a+" "+b+" ");

		for(int i=0; i<=n; i++)
		{
			c = a + b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}
	}
}