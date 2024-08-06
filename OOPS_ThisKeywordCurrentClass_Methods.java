
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
//	2. to refer current class methods
/////////////////////////////////////////////////////////////////////////////////////


class A
{
	public void m1()
	{
		System.out.println("m1-method");
		
		// to refer current class method
		this.m2();
	}

	public void m2()
	{
		System.out.println("m2-method");
	}

}

class OOPS_ThisKeywordCurrentClass_Methods
{
	public static void main(String[] args)
	{
		A a = new A();
		a.m1();
	}
}


//////////////////////////////////////////////////////////////////////
//
//	Output	:	m1-method
//				m2-method
//
//////////////////////////////////////////////////////////////////////
