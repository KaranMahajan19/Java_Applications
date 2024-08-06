//	Arrays
// 	Arays is a collection of homogeneous data elements
//	Arrays rules

///////////////////////////////////////////////////////////////////////////
//
//	Rule : 2
//	It is legal to have an array size with zero
//
///////////////////////////////////////////////////////////////////////////

class Array_Creation_Rules2
{
	public static void main(String[] args)
	{
		int arr[] = new int[0];
		System.out.println(arr.length);	// 0
	}
}