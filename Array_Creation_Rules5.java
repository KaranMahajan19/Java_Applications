//	Arrays
// 	Arays is a collection of homogeneous data elements
//	Arrays rules

/////////////////////////////////////////////////////////////////////////////////
//
//	Rule : 5
//	The maximum length we can take for an array size is maximum length of integer
//
/////////////////////////////////////////////////////////////////////////////////

class Array_Creation_Rules5
{
	public static void main(String[] args)
	{
		int arr[] = new int[21474836465];
		System.out.println(arr.length);		// CTE : integer number too large
	}
}