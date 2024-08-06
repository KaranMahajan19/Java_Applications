//	Demonstration of logical AND operators
//	&&

class LogicalOperator
{
	public static void main(String[] args)
	{
		Boolean b1 = true && true;
		System.out.println(b1);			// true

		Boolean b2 = false && true;
		System.out.println(b2);			//false

		Boolean b3 = true && false;
		System.out.println(b3);			//false

		Boolean b4 = false && false;
		System.out.println(b4);			//false

	}
}