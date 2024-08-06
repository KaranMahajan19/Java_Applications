
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

class EnumClass2
{
	public static void main(String[] args)
	{
		Month m = Month.FEB;	// m is a enumerated datatype

		switch(m)
		{
			case JAN : System.out.println("January"); break;
			case FEB : System.out.println("February"); break;
			case MAR : System.out.println("March"); break;
		}
	}
}

////////////////////////////////////////////////////////////////////////////////////
//
//	Output	:	February
//
////////////////////////////////////////////////////////////////////////////////////
