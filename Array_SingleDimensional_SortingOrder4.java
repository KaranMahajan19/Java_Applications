//	Arrays
// 	Arays is a collection of homogeneous data elements

/////////////////////////////////////////////////////////////////////
//
//	Single Dimensional Array
//
//	Write a java program to display array elements in sorting 
//	Ascending order  withput sort() method
//
/////////////////////////////////////////////////////////////////////


class Array_SingleDimensional_SortingOrder4
{
	public static void main(String[] args)
	{
		int arr[] = {11,13,16,5,9,8,10};

		// ascending order
		//nested for loop
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr.length; j++)
			{
				if(arr[i] < arr[j])
				{
					int swap = arr[i];
					arr[i] = arr[j];
					arr[j] = swap;
				}
			}
		}

		//for each
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
