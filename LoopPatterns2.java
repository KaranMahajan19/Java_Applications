//	Loop Patterns

////////////////////////////////////////////////////////////////
//
//	Output	:		1	2   3   4 
//					1	2   3   4
//					1	2   3   4
//					1	2   3   4
//
////////////////////////////////////////////////////////////////



class LoopPatterns2
{
	public static void main(String[] args)
	{
		//rows
		for(int i=1; i<=4; i++)
		{
			//columns
			for(int j=1; j<=4; j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}