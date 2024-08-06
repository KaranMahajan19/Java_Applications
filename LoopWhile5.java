//	Iteration Statements
//	while loop
//	write a java program to display sum of 10 naturals numbers

class LoopWhile5
{
	public static void main(String[] args)
	{
		int i = 1, sum = 0;

		while(i<=10)
		{
			sum += i;
			i++;
		}
		System.out.println("Sum of 10 natural numbers is : "+sum);
	}
}