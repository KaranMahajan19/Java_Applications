
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
//	2.To refer super class methods
/////////////////////////////////////////////////////////////////////////////////////

class A
{
	public void m1()
	{
		System.out.println("m1 method");
	}
}

class B extends A
{
	public void m2()
	{
		//refer super class method
		super.m1();
		System.out.println("m2 method");
	}
}

class OOPS_SuperKeywordMethod
{
	public static void main(String[] args)
	{
		B b = new B();
		b.m2();
	}
}


//////////////////////////////////////////////////////////////////////
//
//	Output	:	m1 method
//				m2 method
//
//////////////////////////////////////////////////////////////////////
