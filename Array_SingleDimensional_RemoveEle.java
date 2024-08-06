//	Arrays
// 	Arays is a collection of homogeneous data elements

/////////////////////////////////////////////////////////////////////
//
//	Single Dimensional Array
//
//	Write a java program to remove/delete given element from array
//
/////////////////////////////////////////////////////////////////////

class Array_SingleDimensional_RemoveEle
{
	public static void main(String[] args)
	{
		int arr[] = {2,5,6,3,1,5,9,7,5};
		
		int element=5;
		int resArr[] = new int[arr.length-1];

		int j = 0, count=0;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] == element && count==0)
			{
				count=1;
				continue;
			}
			resArr[j++] = arr[i];
		}

		//for each
		for(int i:resArr)
		{
			System.out.print(i+" ");
		}
	}
}

//////////////////////////////////////////////////////////////////////
//
//	Output	:	4 7 1 3 9 2 7 4 9
//
//////////////////////////////////////////////////////////////////////
