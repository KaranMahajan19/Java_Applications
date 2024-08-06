//	Arrays
// 	Arays is a collection of homogeneous data elements

/////////////////////////////////////////////////////////////////////
//
//	Single Dimensional Array
//
//	Write a java program to display Least element in array elements
//
/////////////////////////////////////////////////////////////////////


class Array_SingleDimensional_Least
{
	public static void main(String[] args)
	{
		int arr[] = {3,6,9,5,-19,10};
		int small = arr[0];

		for(int i:arr)
		{
			if(i<small)
			{
				small=i;
			}
		}
		System.out.print("Shortest element is : "+small);
	}
}

//////////////////////////////////////////////////////////////////////
//
//	Output	:	Shortest element is : 3
//
//////////////////////////////////////////////////////////////////////
