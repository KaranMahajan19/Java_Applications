
/////////////////////////////////////////////////////////////////////////////////////
//
//	Interface  :
//
//	Collection of zero or more abstract methods
//	abstract method is incomplete cz it ends with ';' nd does not have body
//	
/////////////////////////////////////////////////////////////////////////////////////

interface A
{
	//abstract method
	public abstract void show();
	public void display();
	abstract void see();
	void view();
}

class B implements A
{
	public void show()
	{
		System.out.println("Show Method");
	}

	public void display()
	{
		System.out.println("Diplay Method");
	}

	public void see()
	{
		System.out.println("See Method");
	}

	public void view()
	{
		System.out.println("View Method");
	}
}

class Interface_4AbstractMethods
{
	public static void main(String[] args)
	{
		A a = new B();
		a.show();
		a.display();
		a.see();
		a.view();
	}
}

//////////////////////////////////////////////////////////////////////
//
//	Output	:	Show Method
//				Diplay Method
//				See Method
//				View Method
//
//////////////////////////////////////////////////////////////////////
