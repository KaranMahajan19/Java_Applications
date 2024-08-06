//	Write a java program to findout given alphabet is vowel is or not	

import java.util.Scanner;

class CheckVowel2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a Alphabet is Vowel or Not : ");
		char ch = sc.next().charAt(0);

		switch(ch)
		{
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':

				System.out.println(ch + " is a Vowel");
				break;
			default:
				System.out.println(ch + " is not Vowel");
		}
	}
}