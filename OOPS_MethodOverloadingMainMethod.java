
//	OOPS Concepts

/////////////////////////////////////////////////////////////////////////////////////
//
//	Oops Concept 	:	Method Overloading
//
//	Can we overload main method in java?
//	Yes, but Compiler will execute only String array parameters only
//
/////////////////////////////////////////////////////////////////////////////////////


class OOPS_MethodOverloadingMainMethod
{
	//////////////////////////////////////////////////////
	//	main method Overloading methods
	//////////////////////////////////////////////////////

	public static void main(String[] args)
	{
		System.out.println("String arg method");
	}

	public static void main(int[] iargs)
	{
		System.out.println("int arg method");
	}
}


//////////////////////////////////////////////////////////////////////
//
//	Output	:	String arg method
//
//////////////////////////////////////////////////////////////////////
