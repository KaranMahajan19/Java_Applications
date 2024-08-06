//	Control Statement
//	nested if statement

class NestedIf4
{
	public static void main(String[] args)
	{
		System.out.println("stmt1");

		if(5>20)
		{
			System.out.println("stmt2");

			if(true)
			{
				System.out.println("stmt3");
			}
			System.out.println("stmt4");
		}
		System.out.println("stmt5");
	}
}


///////////////////////////////////////////////////
//	
//	output	:	stmt1
//				stmt5
//
///////////////////////////////////////////////////