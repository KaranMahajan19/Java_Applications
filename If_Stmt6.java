//	 Write a java program to find out greatest three numbers

import java.util.Scanner;

class If_Stmt6
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter first number : ");
		int a = sc.nextInt();

		System.out.print("Enter second number : ");
		int b = sc.nextInt();

		System.out.println("Enter third number : ");
		int c = sc.nextInt();

		if((a>b)&&(a>c))
		{
			System.out.println(a+" is greatest");
		}

		if((b>a) && (b>c))
		{
			System.out.println(b+" is greatest");
		}

		if((c>a) && (c>b))
		{
			System.out.println(c+" is greatest");
		}
	}
}