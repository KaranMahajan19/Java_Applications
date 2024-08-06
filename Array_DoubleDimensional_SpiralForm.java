
//	Arrays
// 	Arays is a collection of homogeneous data elements

/////////////////////////////////////////////////////////////////////////////////////
//
//	Double Dimensional Array
//
//	Write a java program to to Display array elements in spiral form
//
//		1  2  3
//  	4  5  6		:	spiral : 1  2  3  6  9  8  7  4  5
//  	7  8  9
//
/////////////////////////////////////////////////////////////////////////////////////


class Array_DoubleDimensional_SpiralForm
{
	public static void main(String[] args)
	{
		int[][] matrix = {
						{1,2,3},
						{4,5,6},
						{7,8,9}
					};

		int rows = matrix.length;
		int columns = matrix[0].length;

		int top = 0;
		int bottom = rows-1;
		int left = 0;
		int right = columns-1;

		while(true)
		{
			if(left>right)
			{
				break;
			}

			// left to right
			for(int i=left; i<=right; i++)
			{
				System.out.print(matrix[top][i]+" ");
			}
			top++;
			
			// top to bottom
			if(top>bottom)
			{
				break;
			}

			for(int i=top; i<=bottom;i++)
			{
				System.out.print(matrix[i][right]+" ");
			}
			right--;

			// bottom right to left
			if(left>right)
			{
				break;
			}

			for(int i=right; i>=left; i--)
			{
				System.out.print(matrix[bottom][i]+" ");
			}
			bottom--;

			// bottom to top
			if(bottom>top)
			{
				break;
			}
			for(int i=bottom; i>=top; i--)
			{
				System.out.print(matrix[i][left]+" ");
			}
			left++;
		}
	}
}

//////////////////////////////////////////////////////////////////////
//
//	Output	:	1 2 3 6 9 8 7 4 5
//
//////////////////////////////////////////////////////////////////////
