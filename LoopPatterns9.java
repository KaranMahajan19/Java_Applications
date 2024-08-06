//	Loop Patterns

////////////////////////////////////////////////////////////////
//
//	Output	:		*  -  -  -
//					-  *  -  -
//					-  -  *  -
//					-  -  -  *
//
////////////////////////////////////////////////////////////////

class LoopPatterns9
{
	public static void main(String[] args)
	{
		//rows
		for(int i=1; i<=4; i++)
		{
			for(int j=1; j<=4; j++)
			{
				if(i==j)
				{
					System.out.print("*  ");
				}
				else
				{
					System.out.print("-  ");
				}
			}
			System.out.println();
		}
	}
}