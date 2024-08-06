//	Arrays
// 	Arays is a collection of homogeneous data elements

/////////////////////////////////////////////////////////////////////
//
//	Single Dimensional Array
//
//	Write a java program to display highest element in array elements
//
/////////////////////////////////////////////////////////////////////


class Array_SingleDimensional_Highest
{
	public static void main(String[] args)
	{
		int arr[] = {3,6,9,5,19,10};
		int big = arr[0];

		for(int i:arr)
		{
			if(i>big)
			{
				big=i;
			}
		}
		System.out.print("Highest element is : "+big);
	}
}

//////////////////////////////////////////////////////////////////////
//
//	Output	:	Highest element is : 19
//
//////////////////////////////////////////////////////////////////////
