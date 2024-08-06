//	Arrays
// 	Arays is a collection of homogeneous data elements

/////////////////////////////////////////////////////////////////////
//
//	Single Dimensional Array
//
//	Write a java program to display array elements in sorting order
//
/////////////////////////////////////////////////////////////////////

import java.util.Arrays;
class Array_SingleDimensional_SortingOrder
{
	public static void main(String[] args)
	{
		int arr[] = {5,9,8,11,13,16,10};

		Arrays.sort(arr);

		//for each
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
	}
}


//////////////////////////////////////////////////////////////////////
//
//	Output	:	5 8 9 10 11 13 16
//
//////////////////////////////////////////////////////////////////////
