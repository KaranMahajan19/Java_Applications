//	Arrays
// 	Arays is a collection of homogeneous data elements

/////////////////////////////////////////////////////////////////////
//
//	Single Dimensional Array
//
//	Write a java program to display sum of array elements
//
/////////////////////////////////////////////////////////////////////


class Array_SingleDimensional_Sum
{
	public static void main(String[] args)
	{
		int arr[] = {10,20,30,40};

		// for each
		int sum=0;
		for(int i:arr)
		{
			sum += i;
		}
		System.out.println("Sum of arrays elements is : "+sum);
	}
}


//////////////////////////////////////////////////////////////////////
//
//	Output	:	Sum of arrays elements is : 100
//
//////////////////////////////////////////////////////////////////////
