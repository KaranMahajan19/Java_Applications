//	Unary operators
//	Pre Increment/Decrement Operator
//	fisrt change then take

class PreIncDec4
{
	public static void main(String[] args)
	{
		int i = 10;

		int j = --i + --i;
		
		System.out.println(i+" "+j);	// 8  17
	}
}