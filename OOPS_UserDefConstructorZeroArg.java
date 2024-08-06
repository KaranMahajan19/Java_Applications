
//	OOPS Concepts

/////////////////////////////////////////////////////////////////////////////////////
//
//	Oops Concept 	:	Constructors
//
//	User Defined Constructor : Constructor declared by User
//	-------------------------
//	1.Zero Argument Constructor
//
/////////////////////////////////////////////////////////////////////////////////////

class OOPS_UserDefConstructorZeroArg
{
	//default constructor
	OOPS_UserDefConstructorZeroArg()//zero argument constructor
	{
		System.out.println("Zero arg Constructor");
	}

	public static void main(String[] args)
	{
		System.out.println("Main method");

		//object creation for constructor
		OOPS_UserDefConstructorZeroArg obj = new OOPS_UserDefConstructorZeroArg();
	}
}


//////////////////////////////////////////////////////////////////////
//
//	Output	:	Main method
//				Zero arg Constructor
//
//////////////////////////////////////////////////////////////////////
