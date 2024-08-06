
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
//	1.to refer current class variables
/////////////////////////////////////////////////////////////////////////////////////


class A
{
	int i = 10;
	int j = 20;
	A(int i, int j)
	{
		System.out.println(this.i+" "+this.j);	// 10  20
		System.out.println(i+" "+j);			// 100  200
	}

}

class OOPS_ThisKeywordCurrentClass_Variables
{
	public static void main(String[] args)
	{
		A a = new A(100, 200);
	}
}


//////////////////////////////////////////////////////////////////////
//
//	Output	:	10 20
//				100 200
//
//////////////////////////////////////////////////////////////////////
