//	Arrays
// 	Arays is a collection of homogeneous data elements

////////////////////////////////////////////////////////////////////////////////////////
//
//	Arrays Initialization :
//	-----------------------
//	1)Once if we create an array then every array index initialized with default value
//	2)If we are not happy with default values then we can change with customized values
//
////////////////////////////////////////////////////////////////////////////////////////

import java.util.Arrays;
class Array_Initialization2
{
	public static void main(String[] args)
	{
		int arr1[] = new int[4];
		System.out.print("Length of array1 is : "+arr1.length);	//4

		int arr2[]={10,20,30,40};
		System.out.println("Length of array2 is : "+arr2.length);	//4

		System.out.println(arr2[0]);	//10
		System.out.println(arr2[1]);	//20
		System.out.println(arr2[2]);	//30
		System.out.println(arr2[3]);	//40	

		System.out.println(Arrays.toString(arr2));	//40	
	}
}