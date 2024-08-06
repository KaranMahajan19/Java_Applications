//	Pyramid Loop Patterns

////////////////////////////////////////////////////////////////
//
//	Output	:	          1
//					    1 2 1
//					  1 2 3 2 1
//					1 2 3 4 3 2 1
//
////////////////////////////////////////////////////////////////

class PyramidLoopPatterns
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
				System.out.print(j+" ");
			}

			// right side elements
			for(int j=i-1; j>=1; j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
 