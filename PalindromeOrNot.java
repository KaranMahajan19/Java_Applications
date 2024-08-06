//	Write a java program tocheck palindrome or not

////////////////////////////////////////////////////
//
//	Input	:	123
//			:	321
//
//	Output	:	It is not palindrome number
//--------------------------------------------------
//
//	Input	:	121
//			:	121
//
//	Output	:	It is palindrome number
//
////////////////////////////////////////////////////

import java.util.*;

class PalindromeOrNot
{
	public static void main(String[] args)
	{
		Scanner sc =  new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n = sc.nextInt();

		int temp = n;
		int rem, rev=0;

		while(n>0)
		{
			rem = n%10;
			rev = rev*10+rem;
			n = n/10;
		}

		if(temp==rev)
		{
			System.out.println(rev+" is a Palindrome number");
		}
		else
		{
			System.out.println(rev+" is not Palindrome number");
		}
	}
}