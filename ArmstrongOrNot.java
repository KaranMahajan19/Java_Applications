//	write a java program to find out given number is armstrong or not

////////////////////////////////////////////////////
//
//	Input	:	153
//			:	(1*1*1 + 5*5*5 + 3*3*3)
//			:	153
//			:	153 = 153
//
//	Output	:	It is a armstrong number
//
////////////////////////////////////////////////////


import java.util.*;

class ArmstrongOrNot
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number : ");
		int n = sc.nextInt();

		int temp = n;

		int rem, sum=0;

		while(n>0)
		{
			rem=n%10;
			sum = sum+rem*rem*rem;
			n=n/10;
		}

		if(temp==sum)
		{
			System.out.println(sum+" is a armstrong number");
		}
		else
		{
			System.out.println(sum+" is not a armstrong number");
		}
	}
}