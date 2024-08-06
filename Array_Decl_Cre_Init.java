//	Arrays
// 	Arays is a collection of homogeneous data elements

////////////////////////////////////////////////////////////////////////////////////////
//
//	Arrays Declaration, Creation, Initialization.
//
////////////////////////////////////////////////////////////////////////////////////////

import java.util.Arrays;
class Array_Decl_Cre_Init
{
	public static void main(String[] args)
	{
		int arr[] = new int[]{10,20,30,40};
	
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);

		System.out.println(Arrays.toString(arr));
	}
}