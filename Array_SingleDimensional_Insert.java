//	Arrays
// 	Arays is a collection of homogeneous data elements

/////////////////////////////////////////////////////////////////////
//
//	Single Dimensional Array
//
//	Write a java program to insert given element in a given index
//
/////////////////////////////////////////////////////////////////////

import java.util.Arrays;

class Array_SingleDimensional_Insert
{
	public static void main(String[] args)
	{
		int arr[] = {5,8,7,6,2,3};
		
		int element = 10;

		int index = 3;

		arr = Arrays.copyOf(arr,arr.length+1);

		for(int i=arr.length-1; i>=index; i--)
		{
			arr[i] = arr[i-1];
		}
		arr[index] = element;

		System.out.println("After Inserting a index : ");

		//display
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
	}
}

//////////////////////////////////////////////////////////////////////
//
//	Output	:	After Inserting a index :
//				5 8 7 10 6 2 3
//
//////////////////////////////////////////////////////////////////////
