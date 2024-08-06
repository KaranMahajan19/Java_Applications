//	Left Side Loop Patterns

////////////////////////////////////////////////////////////////
//
//	Output	:		1
//					2  2
//					3  3  3
//					4  4  4  4
//
////////////////////////////////////////////////////////////////

class LeftLoopPatterns
{
	public static void main(String[] args)
	{
		//rows
		for(int i=1; i<=4; i++)
		{
			//columns
			for(int j=1; j<=i; j++)
			{
				System.out.print(i+"  ");
			}
			System.out.println();
		}
	}
}