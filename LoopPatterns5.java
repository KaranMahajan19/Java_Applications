//	Loop Patterns

////////////////////////////////////////////////////////////////
//
//	Output	:		A A A A
//					B B B B
//					C C C C
//					D D D D
//
////////////////////////////////////////////////////////////////

class LoopPatterns5
{
	public static void main(String[] args)
	{
		for(char i='A'; i<='D'; i++)
		{
			for(char j='A'; j<='D'; j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
}