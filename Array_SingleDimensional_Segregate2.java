//	Arrays
// 	Arays is a collection of homogeneous data elements

/////////////////////////////////////////////////////////////////////
//
//	Single Dimensional Array
//
//	Write a java program to segregate array elements without using 
//	Arrays class
//
/////////////////////////////////////////////////////////////////////

class Array_SingleDimensional_Segregate2
{
	public static void main(String[] args)
	{
		int arr[] = {0,1,1,0,0,1,0,1,0,1};

		int resArr[] = new int[arr.length];

		//inserting [0 0 0 0 0]
		int j = 0;

		for(int i:arr)
		{
			if(i==0)
			{
				resArr[j++] = i;
			}
		}

		//inserting [1 1 1 1 1]  
		while(j<arr.length)
		{
			resArr[j++] = 1;
		}

		for(int i:resArr)
		{
			System.out.print(i+" ");
		}
	}
}

//////////////////////////////////////////////////////////////////////
//
//	Output	:	0 0 0 0 0 1 1 1 1 1
//
//////////////////////////////////////////////////////////////////////
