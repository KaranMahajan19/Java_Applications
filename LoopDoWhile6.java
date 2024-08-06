// Interation Statements
// do while loop
//	Write a java program to display sum of 10 natural numbers in discending order

class LoopDoWhile6
{
	public static void main(String[] args)
	{
		int i = 1, sum = 0;

		do{
			sum += i;
			i++;
		}while(i<=10);

		System.out.println(sum);	// 55
	}
}