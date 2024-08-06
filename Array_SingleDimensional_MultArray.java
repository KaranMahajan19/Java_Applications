//	Arrays
// 	Arays is a collection of homogeneous data elements

/////////////////////////////////////////////////////////////////////
//
//	Single Dimensional Array
//
//	Write a java program to multiply two arrays & store result into
//	third array
//
/////////////////////////////////////////////////////////////////////

class Array_SingleDimensional_MultArray
{
	public static void main(String[] args)
	{
		int arr1[] = {4,7,1,3,2};
		int arr2[] = {9,6,5,7,4};

		int resArr[] = new int[arr1.length];
		for(int i=0; i<arr1.length && i<arr2.length; i++)
		{
			resArr[i] = arr1[i] * arr2[i];
		}

		System.out.print("Multiplication of two arrrays are : ");
		for(int i:resArr)
		{
			System.out.print(i+" ");
		}
	}
}

//////////////////////////////////////////////////////////////////////
//
//	Output	:	Multiplication of two arrrays are : 36 42 5 21 8
// 
//////////////////////////////////////////////////////////////////////
