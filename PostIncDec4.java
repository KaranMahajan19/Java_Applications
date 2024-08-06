//	Unary operators
//	Post Increment/Decrement Operator
//	fisrt take then change

class PostIncDec4
{
	public static void main(String[] args)
	{
		int i = 10;

		int j = i-- + i--;

		System.out.println(i+" "+j);	// 8  19
	}
}