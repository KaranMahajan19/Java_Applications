//	Arrays
// 	Arays is a collection of homogeneous data elements

/////////////////////////////////////////////////////////////////////
//
//	Single Dimensional Array
//
//	Write a java program to display unique element from given array
//
/////////////////////////////////////////////////////////////////////


class Array_SingleDimensional_Unique
{
	public static void main(String[] args)
	{
		int arr[] = {4,7,1,3,9,2,7,4,9};
		
		for(int i=0; i<arr.length; i++)
		{
			int count=0;
			for(int j=0; j<arr.length; j++)
			{
				if(arr[i] == arr[j])
				{
					count++;
				}
			}

			if(count == 1)
			{
				System.out.print(arr[i]+" ");
			}
		}
	}
}

//////////////////////////////////////////////////////////////////////
//
//	Output	:	1 3 2
//
//////////////////////////////////////////////////////////////////////
