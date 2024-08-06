//	Arrays
// 	Arays is a collection of homogeneous data elements

/////////////////////////////////////////////////////////////////////
//
//	Single Dimensional Array
//
//	Write a java program to display pair of elemets equals to sum
//
/////////////////////////////////////////////////////////////////////

class Array_SingleDimensional_PairSum
{
	public static void main(String[] args)
	{
		int arr[] = {7,2,3,5,9,1,6};

		int sum = 10;
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i]+arr[j] == sum)
				{
					System.out.println(arr[i]+" "+arr[j]);
				}
			}
		}
	}
}

//////////////////////////////////////////////////////////////////////
//
//	Output	:	7 3
//				9 1
//
//////////////////////////////////////////////////////////////////////
