
//	OOPS Concepts

/////////////////////////////////////////////////////////////////////////////////////
//
//	Oops Concept
//
//	What is the difference between POJO class and Java Bean class
//
/////////////////////////////////////////////////////////////////////////////////////

class Parent
{
	public void m1()
	{
		System.out.println("Parent m1 method");
	}
}

class Child extends Parent
{
	public void m2()
	{
		System.out.println("Parent m2 method");
	}
}
	
class OOPS_Inheritance
{
	public static void main(String[] args)
	{
		Parent p = new Parent();
		System.out.println("Parent class : ");
		p.m1();

		Child c = new Child();
		System.out.println("Child class : ");
		c.m1();
		c.m2();

		Parent p1 = new Child();
		p1.m1();
		//p1.m2();		// error

		//Child c1 = new Parent();		// invalid
	}
}


//////////////////////////////////////////////////////////////////////
//
//	Output	:	Parent class :
//				Parent m1 method
//				Child class :
//				Parent m1 method
//				Parent m2 method
//
//////////////////////////////////////////////////////////////////////
