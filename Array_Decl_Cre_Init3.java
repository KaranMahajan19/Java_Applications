//	Arrays
// 	Arays is a collection of homogeneous data elements

////////////////////////////////////////////////////////////////////////////////////////
//
//	Arrays Declaration, Creation, Initialization.
//
////////////////////////////////////////////////////////////////////////////////////////

import java.util.Arrays;
class Array_Decl_Cre_Init3
{
	public static void main(String[] args)
	{

		String str[]=new String[]{"Karan","Mahajan"};
		System.out.println(Arrays.toString(str));

		// or
		String str1[] = {"Hii","Hello"};

		System.out.println(str1[0]);
		System.out.println(str1[1]);

		System.out.println(Arrays.toString(str1));

	}
}