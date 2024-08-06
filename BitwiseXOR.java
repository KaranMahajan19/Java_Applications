//	Bitwise XOR operator
//	^
//	T 	T 	:	F
//	T 	F 	:	T
//	F 	T 	: 	T
//	F 	F 	:	F


class BitwiseXOR
{
	public static void main(String[] args)
	{
		int a = 10, b = 15;

		int c  = a ^ b;

		System.out.println(c);		//5

		/*
		Solution : 
		a = 10 : 1010
		b = 15 : 1111
		--------------
			|  : 0101 = 

			1*1 + 0*2 + 1*4 + 0*8
			 1  +  0  +  4  +  0 	// 5  
		*/
	}
}