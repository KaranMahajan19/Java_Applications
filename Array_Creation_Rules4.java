//	Arrays
// 	Arays is a collection of homogeneous data elements
//	Arrays rules

///////////////////////////////////////////////////////////////////////////
//
//	Rule : 4
//	The allowed dataype for an array size are byte, short, int & char.
//	If we take other datatype then we will get compile time error
//
///////////////////////////////////////////////////////////////////////////

class Array_Creation_Rules4
{
	public static void main(String[] args)
	{
		int arr[] = new int['a'];
		System.out.println(arr.length);

		byte b=10;
		int arr2[] = new int[b];
		System.out.println(arr2.length);

		//int arr3[] = new int[10L];	// CTE : possible lossy conversion from long to int
		//System.out.println(arr3.length);

	}
}