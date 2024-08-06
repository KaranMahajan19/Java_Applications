//	Arrays
// 	Arays is a collection of homogeneous data elements

/////////////////////////////////////////////////////////////////////
//
//	Single Dimensional Array
//
//	Write a java program to display triplet of elements equals to sum
//
/////////////////////////////////////////////////////////////////////

class Array_SingleDimensional_TripletSum
{
	public static void main(String[] args)
	{
		int arr[] = {7,2,3,5,9,1,6};

		int sum = 10;
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				for(int k=j+1; k<arr.length; k++)
				{
					if(arr[i]+arr[j]+arr[k] == sum)
					{
						System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
					}
				}
			}
		}
	}
}

//////////////////////////////////////////////////////////////////////
//
//	Output	:	7 2 1
//				2 3 5
//				3 1 6
//
//////////////////////////////////////////////////////////////////////
