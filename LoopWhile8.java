//	Iteration Statements
//	while loop
//	write a java program to display digits of a given number

import java.util.*;

class LoopWhile8
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number : ");
		int n = sc.nextInt();

		int i = n;
		int rem,sum=0;
		while(n>0)
		{
			rem = n%10;
			sum = sum+rem;
			n = n/10;
		}
		System.out.println("Sum of digits is : "+sum);

	}
}