
//	OOPS Concepts

/////////////////////////////////////////////////////////////////////////////////////
//
//	Oops Concept 	:	this Keyword
//
//	this key is refer to current class object reference
//	1. to refer current class variables
//	2. to refer current class methods
//	3. to refer current class Constructors
//
//	3. to refer current class Constructors
/////////////////////////////////////////////////////////////////////////////////////

class A
{
	A()
	{
		System.out.println("Zero arg constructor");
	}

	A(int i)
	{
		//refer current class Constructors
		this();
		System.out.println("int-arg constructor");
	}

	A(double b)
	{
		//refer current class Constructors
		this(10);
		System.out.println("double-arg constructor");
	}

}

class OOPS_ThisKeywordCurrentClass_Constructor
{
	public static void main(String[] args)
	{
		A a = new A(10.5d);
	}
}


//////////////////////////////////////////////////////////////////////
//
//	Output	:	Zero arg constructor
//				int-arg constructor
//				double-arg constructor
//
//////////////////////////////////////////////////////////////////////
