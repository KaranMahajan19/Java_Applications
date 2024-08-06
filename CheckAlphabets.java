//	write a java program to check given alphabet is 
//	uppercase,
//	lowecase,
//	digit or 
//	symbol

import java.util.Scanner;

class CheckAlphabets
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Aplhabet : ");
		char ch = sc.next().charAt(0);

		if(ch>='A' && ch<='Z')
		{
			System.out.println(ch+" is a uppercase letter");
		}

		else if(ch>='a' && ch<='z')
		{
			System.out.println(ch+" is a lowercase letter");
		}

		else if(ch>='0' && ch<='9')
		{
			System.out.println(ch+" is a digit");
		}

		else
		{
			System.out.println(ch+" is a Symbol");
		}
	}
}