//	Unary operators
//	Post Increment/Decrement Operator
//	fisrt take then change

class PostIncDec4
{
	public static void main(String[] args)
	{
		int i = 10;

		int j = i++ + i++ + i++;
			  //10  + 11  +  12  

		System.out.println(i+" "+j);	// 13  32
	}
}