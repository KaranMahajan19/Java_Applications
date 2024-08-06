
//	OOPS Concepts

/////////////////////////////////////////////////////////////////////////////////////
//
//	Oops Concept 	:	this Keyword
//
//	super keyword used to refer class object reference
//
//	1.To refer super class cariables
//	2.To refer super class methods
//	3.To refer super class Constructors
//
//	3.To refer super class Constructors
/////////////////////////////////////////////////////////////////////////////////////

class A
{
	A()	//should be zero arg
	{
		System.out.println("A Constructor");
	}
}

class B extends A
{
	B()
	{
		//refer super class constructor
		//use super or not bydefault 1st call to parent constructor
		super();								
		System.out.println("B Constuctor");
		//super();							// CTE : must be in 1st state in constructor
	}
}
 
class OOPS_SuperKeywordConstructor
{
	public static void main(String[] args)
	{
		B b = new B();
	}
}


//////////////////////////////////////////////////////////////////////
//
//	Output	:	A Constructor
//				B Constuctor
//
//////////////////////////////////////////////////////////////////////
