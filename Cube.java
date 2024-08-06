// Write a java program to perform Square of given number

import java.util.Scanner;

class Cube
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter First Number : ");
		int c = sc.nextInt();

		int cube = c*c*c;

		System.out.println("Square is  : "+cube);

	}
}