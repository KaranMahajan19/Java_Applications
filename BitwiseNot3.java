//	Bitwise Not operator
//	~
//	T 	T 	:	F 
//	T 	F 	:	T
//	F 	T 	: 	T
//	F 	F 	:	F


class BitwiseNot3
{
	public static void main(String[] args)
	{
		int i = ~(-56);

		System.out.println(i);		// -55
	}
}