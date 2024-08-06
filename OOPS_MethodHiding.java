
//	OOPS Concepts

/////////////////////////////////////////////////////////////////////////////////////
//
//	Oops Concept 	:	Method OverHiding
//
/////////////////////////////////////////////////////////////////////////////////////

class Parent
{
	public static void property()
	{
		System.out.println("Cash/Gold/Land");
	}

	//overridden method
	public static void marry()
	{
		System.out.println("Sakshi");
	}
}

class Child extends Parent
{	
	//overriding method
	public static void marry()
	{
		System.out.println("Rashmika");
	}
}

class OOPS_MethodHiding
{
	public static void main(String[] args)
	{
		Parent p = new Parent();
		p.property();
		p.marry();

		Child c = new Child();
		c.property();
		c.marry();

		// refference type
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
//				Sakshi
//
//////////////////////////////////////////////////////////////////////
