// Interation Statements
// do while loop
//	Write a java program to find out factorial of a given number

import java.util.*;

class LoopDoWhile7
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number : ");
		int n = sc.nextInt();

		int i = n;

		int fact = 1;

		do{
			fact = fact * i;
			i--;
		}while(i>=1);

		System.out.println("Factorial is  : "+fact);
	}
}