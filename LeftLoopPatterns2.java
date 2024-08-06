//	Left Side Loop Patterns

////////////////////////////////////////////////////////////////
//
//	Output	:		4  4  4  4
//					3  3  3
//					2  2
//					1
//
////////////////////////////////////////////////////////////////

class LeftLoopPatterns2
{
	public static void main(String[] args)
	{
		//rows
		for(int i=4; i>=1; i--)
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