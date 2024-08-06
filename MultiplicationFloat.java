import java.util.Scanner;

class MultiplicationFloat
{
	public static void main(String[] arg)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the First No : ");
		float a = sc.nextFloat();

		System.out.println("Enter the Second No : ");
		float b = sc.nextFloat();

		float c = a * b;
		System.out.println("Multiplication is : "+c);


	}
}