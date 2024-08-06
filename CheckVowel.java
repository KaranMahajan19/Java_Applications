//	Write a java program to findout given alphabet is vowel is or not	

import java.util.Scanner;

class CheckVowel
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a Alphabet is Vowel or Not : ");
		char ch = sc.next().charAt(0);

		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ||
			ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
		{
			System.out.println(ch + " is a Vowel");
		}
		else
		{
			System.out.println(ch + " is not a Vowel");
		}
	}
}