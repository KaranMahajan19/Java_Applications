//	Arrays
// 	Arays is a collection of homogeneous data elements

/////////////////////////////////////////////////////////////////////
//
//	Single Dimensional Array
//
//	Write a java program to segregate array elements
//
/////////////////////////////////////////////////////////////////////

import java.util.Arrays;

class Array_SingleDimensional_Segregate
{
	public static void main(String[] args)
	{
		int arr[] = {0,1,1,0,0,1,0,1,0,1};

		Arrays.sort(arr);
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
		
	}
}

//////////////////////////////////////////////////////////////////////
//
//	Output	:	0 0 0 0 0 1 1 1 1 1
//
//////////////////////////////////////////////////////////////////////
