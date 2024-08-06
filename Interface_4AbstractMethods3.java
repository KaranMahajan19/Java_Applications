
/////////////////////////////////////////////////////////////////////////////////////
//
//	Interface : 
//
//	Collection of zero or more abstract methods
//	abstract method is incomplete cz it ends with ';' nd does not have body
//	
/////////////////////////////////////////////////////////////////////////////////////

interface A
{
	void m1();
}

interface B
{
	void m2();
}

//class can implements more than one interface
interface C extends A,B
{
	void m3();
}

class D implements C
{
	public void m1()
	{
		System.out.println("M1 Method");
	}

	public void m2()
	{
		System.out.println("M2 Method");
	}

	public void m3()
	{
		System.out.println("M3 Method");
	}
}

class Interface_4AbstractMethods3
{
	public static void main(String[] args)
	{
		C c = new D();
		c.m1();
		c.m2();
		c.m3();
	}
}

////////////////////////////////////////////////////////////////////////////////////
//
//	Output	:	M1 Method
//				M2 Method
//				M3 Method
//
////////////////////////////////////////////////////////////////////////////////////