// Interation Statements
// do while loop
//	Write a java program to display multiplication table of given number

import java.util.*;

class LoopDoWhile8
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number : ");
		int n = sc.nextInt();

		int i = 1;

		do{
			System.out.println(n*i);
			i++;
		}while(i<=10);
	}
}