
//	OOPS Concepts

/////////////////////////////////////////////////////////////////////////////////////
//
//	Oops Concept 	:	Constructors
//
//	User Defined Constructor : Constructor declared by User
//	-------------------------
//	1.Zero Argument Constructor
//	 : if we wont declare any argment to userdefined constructor
//
/////////////////////////////////////////////////////////////////////////////////////

class OOPS_UserDefConstructorZeroArg3
{
	//public constructor
	private OOPS_UserDefConstructorZeroArg3()		//zero argument constructor
	{
		System.out.println("Zero arg Constructor");
	}

	public static void main(String[] args)
	{
		System.out.println("Main method");

		//object creation for constructor
		OOPS_UserDefConstructorZeroArg3 obj1 = new OOPS_UserDefConstructorZeroArg3();

		OOPS_UserDefConstructorZeroArg3 obj2 = new OOPS_UserDefConstructorZeroArg3();
	}
}


//////////////////////////////////////////////////////////////////////
//
//	Output	:	Main method
//				Zero arg Constructor
//
//////////////////////////////////////////////////////////////////////
