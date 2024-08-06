//	Control Statement
//	nested if statement

class NestedIf2
{
	public static void main(String[] args)
	{
		System.out.println("stmt1");

		if(5>2)
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
//				stmt2
//				stmt3
//				stmt4
//				stmt5
//
///////////////////////////////////////////////////