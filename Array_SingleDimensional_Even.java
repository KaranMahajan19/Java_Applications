//	Arrays
// 	Arays is a collection of homogeneous data elements

/////////////////////////////////////////////////////////////////////
//
//	Single Dimensional Array
//
//	Write a java program to display even elements form given array
//
/////////////////////////////////////////////////////////////////////


class Array_SingleDimensional_Even
{
	public static void main(String[] args)
	{
		int arr[] = {4,6,5,9,8,4};

		// for each
		for(int i:arr)
		{
			if(i%2==0)
			{
				System.out.print(i+" ");
			}
		}
	}
}


//////////////////////////////////////////////////////////////////////
//
//	Output	:	4 6 8 4
//
//////////////////////////////////////////////////////////////////////