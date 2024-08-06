//	Demonstation of Local Block 

class LocalBlock
{
	public static void main(String[] args)
	{

		System.out.println("stmt1");

		{
			System.out.println("stmt2");
		}

		System.out.println("stmt3");
	}
}