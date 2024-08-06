//	Loop Patterns

////////////////////////////////////////////////////////////////
//
//	Output	:		4 4 4 4
//					3 3 3 3
//					2 2 2 2
//					1 1 1 1
//
////////////////////////////////////////////////////////////////



class LoopPatterns4
{
	public static void main(String[] args)
	{
		//rows
		for(int i=4; i>=1; i--)
		{
			//columns
			for(int j=1; j<=4; j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
}

/*
//	Loop Patterns

////////////////////////////////////////////////////////////////
//
//	Output	:		4 4 4 4
//					3 3 3 3
//					2 2 2 2
//					1 1 1 1
//
////////////////////////////////////////////////////////////////



class LoopPatterns4
{
	public static void main(String[] args)
	{
		//rows
		for(int i=4; i>=1; i--)
		{
			//columns
			for(int j=4; j>=1; j--)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
}
*/