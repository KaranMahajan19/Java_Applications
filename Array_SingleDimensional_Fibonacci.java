//	Arrays
// 	Arays is a collection of homogeneous data elements

/////////////////////////////////////////////////////////////////////
//
//	Single Dimensional Array
//
//	Write a java program to display triplet of elements equals to sum
//
/////////////////////////////////////////////////////////////////////

class Array_SingleDimensional_Fibonacci
{
	public static void main(String[] args)
	{
		int n = 10;

		int fibonacci[] = new int[n];

		fibonacci[0] = 0;
		fibonacci[1] = 1;

		System.out.print(fibonacci[0]+" "+fibonacci[1]+" ");

		for(int i=2; i<fibonacci.length; i++)
		{
			fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
			System.out.print(fibonacci[i]+" ");
		}

	}
}

//////////////////////////////////////////////////////////////////////
//
//	Output	:	0 1 1 2 3 5 8 13 21 34
//
//////////////////////////////////////////////////////////////////////
