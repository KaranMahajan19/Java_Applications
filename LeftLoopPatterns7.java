//	Left Side Loop Patterns

////////////////////////////////////////////////////////////////
//
//	Output	:		1
//					3 5
//					7 9 11
//					13 15 17 19
//
////////////////////////////////////////////////////////////////

class LeftLoopPatterns7
{
	public static void main(String[] args)
	{
		//rows
		int k=1;
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