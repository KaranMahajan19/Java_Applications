//	Arrays
// 	Arays is a collection of homogeneous data elements

/////////////////////////////////////////////////////////////////////
//
//	Single Dimensional Array
//
//	Write a java program to convert element from one array to another
//	array
//
/////////////////////////////////////////////////////////////////////

class Array_SingleDimensional_Convert
{
	public static void main(String[] args)
	{
		int arr1[] = {4,7,1,3,9,2,7,4,9};
		
		int arr2[] = new int[arr1.length];

		for(int i=0; i<arr1.length; i++)
		{
			arr2[i] = arr1[i];
		}

		System.out.println("After Converting array : ");
		for(int i:arr2)
		{
			System.out.print(i+" ");
		}

	}
}

//////////////////////////////////////////////////////////////////////
//
//	Output	:	After Converting array :
//				4 7 1 3 9 2 7 4 9
//
//////////////////////////////////////////////////////////////////////
