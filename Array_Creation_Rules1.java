//	Arrays
// 	Arays is a collection of homogeneous data elements
//	Arrays rules

///////////////////////////////////////////////////////////////////////////
//
//	Rule : 1
//	At the time of array creation compulsary we need to specify array size
//
///////////////////////////////////////////////////////////////////////////

class Array_Creation_Rules1
{
	public static void main(String[] args)
	{

		//int arr[] = new int[];	// CTE : Array dimension missing
		
		//Array Creation
		int arr[] = new int[4];
		System.out.println(arr.length);	//4
	}
}