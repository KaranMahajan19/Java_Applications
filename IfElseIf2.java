//	Control Statement
//	if else if ladder

import java.util.Scanner;
class IfElseIf2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Select anyone from \n[100,103,108]");
		System.out.print("Enter the option : ");
		int option = sc.nextInt();

		if(option == 100)
		{
			System.out.println("It is Police number");
		}
		else if(option == 103)
		{
			System.out.println("It is Enquiry number");
		}
		else if(option == 108)
		{
			System.out.println("It is Emergency number");
		}
		else
		{
			System.out.println("Invalid Option");
		}
	}
}