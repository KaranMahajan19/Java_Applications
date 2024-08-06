// class name
class InstanceMethod
{
	// Instance/Non Static Method
	public void m1()
	{
		System.out.println("This is Non Static Method");
	}

	// method name
	public static void main(String[] args)
	{
		//m1();	// C.T.E
		
		InstanceMethod obj = new InstanceMethod();
		obj.m1();
	}
}