//	Left Side Loop Patterns

////////////////////////////////////////////////////////////////
//
//	Output	:		2
//					3 5
//					7 11 13
//					17 19 23 29
//
////////////////////////////////////////////////////////////////

class LeftLoopPatternsPrime
{
	public static void main(String[] args)
	{
		//rows
		int n=2;

		// ascending logic
		for(int i=1; i<=4; i++)
		{
			//columns
			for(int j=1; j<=i; j++)
			{
				while(true)
				{
					boolean flag = true;
					for(int k=2; k<=n/2; k++)
					{
						if(n%k==0)
						{
							flag = false;
							break;
						}
					}
					if(flag==true)
					{
						System.out.print(n+" ");
						n++;
						break;
					}
					else
					{
						n++;
					}
				}
			}
			System.out.println();
		}
 	}
}