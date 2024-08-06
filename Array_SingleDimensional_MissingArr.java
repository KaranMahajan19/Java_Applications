//	Arrays
// 	Arays is a collection of homogeneous data elements

/////////////////////////////////////////////////////////////////////
//
//	Single Dimensional Array
//
//	Write a java program to findout missing element from given array
//
/////////////////////////////////////////////////////////////////////

class Array_SingleDimensional_MissingArr
{
	public static void main(String[] args)
	{
		int arr[] = {5,2,3,1,6};

		int sum_of_arr = arr.length+1;

		int sum = (sum_of_arr * (sum_of_arr+1)/2);	// 6*7/2 = 42/2 = 21
						
		for(int i=0; i<arr.length; i++)
		{
			sum -= arr[i];
		}
		System.out.print("Missing ekement from an array is : "+sum);
	}
}

//////////////////////////////////////////////////////////////////////
//
//	Output	:	Missing ekement from an array is : 4
//
//////////////////////////////////////////////////////////////////////
