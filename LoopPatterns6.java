//	Loop Patterns

////////////////////////////////////////////////////////////////
//
//	Output	:		D D D D
//					C C C C
//					B B B B
//					A A A A
//
////////////////////////////////////////////////////////////////

class LoopPatterns6
{
	public static void main(String[] args)
	{
		for(char i='D'; i>='A'; i--)
		{
			for(char j='A'; j<='D'; j++)
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
//	Output	:		D D D D
//					C C C C
//					B B B B
//					A A A A
//
////////////////////////////////////////////////////////////////

class LoopPatterns6
{
	public static void main(String[] args)
	{
		for(char i='D'; i>='A'; i--)
		{
			for(char j='D'; j>='A'; j--)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
}
*/