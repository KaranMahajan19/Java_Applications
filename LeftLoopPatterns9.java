//	Left Side Loop Patterns

////////////////////////////////////////////////////////////////
//
//	Output	:		1
//					2 1
//					1 2 3
//					4 3 2 1
//
////////////////////////////////////////////////////////////////

class LeftLoopPatterns9
{
	public static void main(String[] args)
	{
		for(int i=1; i<=4; i++)
		{
			if(i%2!=0)
			{
				for(int j=1; j<=i; j++)
				{
					System.out.print(j+" ");
				}
				System.out.println();
			}
			else
			{
				for(int j=i; j>=1; j--)
				{
					System.out.print(j+" ");
				}
				System.out.println();
			}
		}
 	}
}