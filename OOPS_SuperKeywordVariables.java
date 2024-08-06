
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
//	1.To refer super class cariables
/////////////////////////////////////////////////////////////////////////////////////

class A
{
	int i = 10;
	int j = 20;
}

class B extends A
{
	int i = 100;
	int j = 200;

	B(int i, int j)
	{
		System.out.println(i+" "+j);
		System.out.println(this.i+" "+this.j);
		System.out.println(super.i+" "+super.j);
	}
}

class OOPS_SuperKeywordVariables
{
	public static void main(String[] args)
	{
		B b = new B(1000,2000);
	}
}


//////////////////////////////////////////////////////////////////////
//
//	Output	:	1000 2000
//				100 200
//				10 20
//
//////////////////////////////////////////////////////////////////////
