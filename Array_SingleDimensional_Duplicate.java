//	Arrays
// 	Arays is a collection of homogeneous data elements

/////////////////////////////////////////////////////////////////////
//
//	Single Dimensional Array
//
//	Write a java program to display duplicate element from given array
//
/////////////////////////////////////////////////////////////////////


class Array_SingleDimensional_Duplicate
{
	public static void main(String[] args)
	{
		int arr[] = {4,7,1,3,9,2,7,4,9};
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i] == arr[j])
				{
					System.out.print(arr[i]+" ");
				}
			}
		}
	}
}

//////////////////////////////////////////////////////////////////////
//
//	Output	:	4 7 9
//
//////////////////////////////////////////////////////////////////////
