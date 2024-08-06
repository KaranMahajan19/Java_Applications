//	Left Side Loop Patterns

////////////////////////////////////////////////////////////////
//
//	Output	:		*
//					*  *
//					*  *  *
//					*  *  *  *
//					*  *  *
//					*  *
//					*
//
////////////////////////////////////////////////////////////////

class LeftLoopPatterns3
{
	public static void main(String[] args)
	{
		//rows
		// ascending logic
		for(int i=1; i<=4; i++)
		{
			//columns
			for(int j=1; j<=i; j++)
			{
				System.out.print("*  ");
			}
			System.out.println();
		}

		// descending logic
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