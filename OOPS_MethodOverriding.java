
//	OOPS Concepts

/////////////////////////////////////////////////////////////////////////////////////
//
//	Oops Concept 	:	Method Overriding
//
//	Having same method name with same parameters in two diff. classess
//
//	Method present in parent class is method overridden
//	Method present in child class is method overriding
//
/////////////////////////////////////////////////////////////////////////////////////

class Parent
{
	public void property()
	{
		System.out.println("Cash/Gold/Land");
	}

	//overridden method
	public final void marry()
	{
		System.out.println("Sakshi");
	}
}

class Child extends Parent
{	
	//overriding method
	public void marry()
	{
		System.out.println("Rashmika");
	}
}

class OOPS_MethodOverriding
{
	public static void main(String[] args)
	{
		Parent p = new Parent();
		p.property();
		p.marry();

		Child c = new Child();
		c.property();
		c.marry();

		Parent p1 = new Child();
		p1.property();
		p1.marry();
	}
}


//////////////////////////////////////////////////////////////////////
//
//	Output	:	Cash/Gold/Land
//				Sakshi
//				Cash/Gold/Land
//				Rashmika
//				Cash/Gold/Land
//				Rashmika
//
//////////////////////////////////////////////////////////////////////
