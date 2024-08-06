//	Control Statement
//	nested if statement

class NestedIf3
{
	public static void main(String[] args)
	{
		System.out.println("stmt1");

		if(5>2)
		{
			System.out.println("stmt2");

			if(false)
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
//				stmt4
//				stmt5
//
///////////////////////////////////////////////////