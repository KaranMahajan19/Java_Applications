//	Arrays
// 	Arays is a collection of homogeneous data elements

/////////////////////////////////////////////////////////////////////
//
//	Single Dimensional Array
//
//	Write a java program to display leader elements
//
/////////////////////////////////////////////////////////////////////

class Array_SingleDimensional_LeaderEle
{
	public static void main(String[] args)
	{
		int arr[] = {5,8,38,29,6,14,10};

		int max = arr[arr.length-1];
		System.out.print(max+" ");

		for(int i=arr.length-2; i>=0; i--)
		{
			if(arr[i]>max)
			{
				max=arr[i];
				System.out.print(max+" ");
			}
		}
	}
}

//////////////////////////////////////////////////////////////////////
//
//	Output	:	10 14 29 38
//
//////////////////////////////////////////////////////////////////////
