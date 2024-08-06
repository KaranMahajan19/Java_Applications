//	Pyramid Loop Patterns

////////////////////////////////////////////////////////////////
//
//	Output	:	          *
//					    * * *
//					  * * * * *
//					* * * * * * *
//
////////////////////////////////////////////////////////////////

class PyramidLoopPatterns3
{
	public static void main(String[] args)
	{
		// rows
		for(int i=1; i<=4; i++)
		{
			// spaces
			for(int j=4; j>i; j--)
			{
				System.out.print("  ");
			}

			// left side elements
			for(int j=1; j<=i; j++)
			{
				System.out.print("* ");
			}

			// right side elements
			for(int j=i-1; j>=1; j--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
 