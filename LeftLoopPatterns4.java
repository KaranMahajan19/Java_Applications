//	Left Side Loop Patterns

////////////////////////////////////////////////////////////////
//
//	Output	:		1
//					2 3
//					4 5 6
//					7 8 9 10
//
////////////////////////////////////////////////////////////////

class LeftLoopPatterns4
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
				k++;
			}
			System.out.println();
		}
 	}
}