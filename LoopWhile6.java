//	Iteration Statements
//	while loop
//	write a java program to find out factorial of given number

import java.util.*;

class LoopWhile6
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number : ");
		int n = sc.nextInt();

		int i=n, fact=1;

		while(i>=1)
		{
			fact = fact * i;
			i--;
		}
		System.out.print("Factorial is : "+fact);

	}
}