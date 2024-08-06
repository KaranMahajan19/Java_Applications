//	Arrays
// 	Arays is a collection of homogeneous data elements
//	Arrays rules

///////////////////////////////////////////////////////////////////////////
//
//	Rule : 3
//	We cant take negative number as an array size otherwise we'll get 
//	run time error NegativeArraySizeException
//
///////////////////////////////////////////////////////////////////////////

class Array_Creation_Rules3
{
	public static void main(String[] args)
	{
		int arr[] = new int[-4];	//RE : NegativeArraySizeException	}
}