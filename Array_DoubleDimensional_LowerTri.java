
//	Arrays
// 	Arays is a collection of homogeneous data elements

/////////////////////////////////////////////////////////////////////////////////////
//
//	Double Dimensional Array
//
//	Write a java program to to Display sum of lower triangle elements
//
//		1  2  3
//  	4  5  6		:	upper triangle : 4  7  8
//  	7  8  9
//
/////////////////////////////////////////////////////////////////////////////////////


class Array_DoubleDimensional_LowerTri
{
	public static void main(String[] args)
	{
		int[][] arr = {
						{1,2,3},
						{4,5,6},
						{7,8,9}
					};

		int rows = arr.length;
		int columns = arr[0].length;

		int sum=0;
		for(int i=0; i<rows; i++)
		{
			for(int j=0; j<columns; j++)
			{
				if(i>j)
				{
					sum += arr[i][j];
				}
			}
		}
		System.out.println(sum);
	}
}

//////////////////////////////////////////////////////////////////////
//
//	Output	:	19
//
//////////////////////////////////////////////////////////////////////
