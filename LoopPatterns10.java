//	Loop Patterns

////////////////////////////////////////////////////////////////
//
//	Output	:		*  -  -  -  *
//					-  *  -  *  -
//					-  -  *  -  -
//					-  *  -  *  -
//					*  -  -  -  *
//
////////////////////////////////////////////////////////////////

class LoopPatterns10
{
	public static void main(String[] args)
	{
		//rows
		for(int i=1; i<=5; i++)
		{
			//columns
			for(int j=1; j<=5; j++)
			{
				if(i==j || i+j==6)
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