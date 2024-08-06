
/////////////////////////////////////////////////////////////////////////////////////
//	
//	enum : 
//	
//	enum is group of named constants
//	create our own datatype know as enumerated datatype
//	
/////////////////////////////////////////////////////////////////////////////////////

//enum class
enum Month
{
	//constants
	JAN, FEB, MAR;
}

class EnumClass
{
	public static void main(String[] args)
	{
		Month m = Month.JAN;	// m is a enumerated datatype
		System.out.println(m);
	}
}

////////////////////////////////////////////////////////////////////////////////////
//
//	Output	:	JAN
//
////////////////////////////////////////////////////////////////////////////////////
