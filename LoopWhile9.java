//	Iteration Statements
//	while loop
//	write a java program to find out given number is armstrong or not
//
////////////////////////////////////////////////////
//
//	Input	:	123
//			:	(1*1*1 + 2*2*2 + 3*3*3)
//			:	36
//			:	123 =! 36
//
//	Output	:	It is not a armstrong number
//
////////////////////////////////////////////////////

import java.util.*;

class LoopWhile9
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number : ");
		int n = sc.nextInt();

		int temp = n;

		int rem, sum=0;

		while(n>0)
		{
			rem=n%10;
			sum = sum+rem*rem*rem;
			n=n/10;
		}

		if(temp==sum)
		{
			System.out.println(sum+" is a armstrong number");
		}
		else
		{
			System.out.println(sum+" is not a armstrong number");
		}
	}
}