
//	OOPS Concepts

/////////////////////////////////////////////////////////////////////////////////////
//
//	Oops Concept 	:	Inheritance
//	
//	Hybrid Inheritance
//
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
		System.out.println("m2 method");
	} 
}

class C extends A
{
	public void m3()
	{
		System.out.println("m3 method");
	}
}
	
class OOPS_HybridInheritance
{
	public static void main(String[] args)
	{
		A a = new A();
		a.m1();

		B b = new B();
		b.m1();
		b.m2();

		C c = new C();
		c.m1();
		c.m3();
	}
}


//////////////////////////////////////////////////////////////////////
//
//	Output	:	m1 method
//				m1 method
//				m2 method
//				m1 method
//				m3 method
//
//////////////////////////////////////////////////////////////////////
