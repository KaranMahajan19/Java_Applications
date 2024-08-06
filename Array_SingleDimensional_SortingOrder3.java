//	Arrays
// 	Arays is a collection of homogeneous data elements

/////////////////////////////////////////////////////////////////////
//
//	Single Dimensional Array
//
//	Write a java program to display array elements in sorting descending
//	order
//
/////////////////////////////////////////////////////////////////////

import java.util.Arrays;
class Array_SingleDimensional_SortingOrder3
{
	public static void main(String[] args)
	{
		int arr[] = {5,9,8,11,13,16,10};

		Arrays.sort(arr);		//5 8 9 10 11 13 16

		// descending order
		for(int i=arr.length-1; i>=0; i--)
		{
			System.out.print(arr[i]+" ");
		}
	}
}

//////////////////////////////////////////////////////////////////////
//
//	Output	:	16 13 11 10 9 8 5
//
//////////////////////////////////////////////////////////////////////
