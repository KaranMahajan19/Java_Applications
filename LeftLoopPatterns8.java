//	Left Side Loop Patterns

////////////////////////////////////////////////////////////////
//
//	Output	:		2
//					4 6
//					8 10 12
//					14 16 18 20
//
////////////////////////////////////////////////////////////////

class LeftLoopPatterns8
{
	public static void main(String[] args)
	{
		//rows
		int k=2;
		// ascending logic
		for(int i=1; i<=4; i++)
		{
			//columns
			for(int j=1; j<=i; j++)
			{
				System.out.print(k+" ");
				k += 2;
			}
			System.out.println();
		}
 	}
}