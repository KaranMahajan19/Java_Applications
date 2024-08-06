//	Left Side Loop Patterns

////////////////////////////////////////////////////////////////
//
//	Output	:		1
//					2  2
//					3  3  3
//					4  4  4  4
//
////////////////////////////////////////////////////////////////

class LeftLoopPatterns3
{
	public static void main(String[] args)
	{
		//rows
		for(int i=1; i<=4; i++)
		{
			//columns
			for(int j=1; j<=i; j++)
			{
				System.out.print("*  ");
			}
			System.out.println();
		}
		for(int i=3; i>=1; i--)
		{
			for(int j=1; j<=i;j++)
			{
				System.out.print("*  ");
			}
			System.out.println();
		}
	}
}