//	Left Side Loop Patterns

////////////////////////////////////////////////////////////////
//
//	Output	:		1
//					2 3
//					4 5 6
//					7 8 9 10
//
////////////////////////////////////////////////////////////////

class LeftLoopPatterns6
{
	public static void main(String[] args)
	{
		//rows
		int k=1;
		// ascending logic
		for(int i=1; i<=4; i++)
		{
			//columns
			for(int j=1; j<=i; j++)
			{
				if(k<=9)
				{
					System.out.print(k++ +" ");
				}
				else
				{
					System.out.print("0 ");
				}

				
				
			}
			System.out.println();
		}
 	}
}