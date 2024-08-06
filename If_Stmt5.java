//	 Write a java program to find out greatest two numbers

import java.util.Scanner;

class If_Stmt5
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number : ");
		int a = sc.nextInt();

		System.out.print("Enter second number : ");
		int b = sc.nextInt();

		if(a>b)
		{
			System.out.println(a+" is greatest");
		}

		if(b>a)
		{
			System.out.println(b+" is greatest");
		}
	}
}