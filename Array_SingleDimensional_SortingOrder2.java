//	Arrays
// 	Arays is a collection of homogeneous data elements

/////////////////////////////////////////////////////////////////////
//
//	Single Dimensional Array
//
//	Write a java program to display array elements in sorting order
//	Without sort() method
//
/////////////////////////////////////////////////////////////////////

import java.util.Arrays;
class Array_SingleDimensional_SortingOrder2
{
	public static void main(String[] args)
	{
		int arr[] = {5,9,8,11,13,16,10};

		Arrays.sort(arr);

		//ascending order
		//nested for
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr.length; j++)
			{
				if(arr[i] < arr[j])
				{
					int swap=arr[i];
					arr[i] = arr[j];
					arr[j] = swap;
				}
			}
		}

		//for each to display
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
