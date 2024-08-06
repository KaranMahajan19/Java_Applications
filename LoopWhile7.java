//	Iteration Statements
//	while loop
//	write a java program to display multiplicationn of a given number

import java.util.*;

class LoopWhile7
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number : ");
		int n = sc.nextInt();

		int i=1;
		while(i<=10)
		{
			System.out.println(n+" * "+i+" = "+n*i);
			i++;
		}

	}
}