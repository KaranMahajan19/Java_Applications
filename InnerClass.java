
/////////////////////////////////////////////////////////////////////////////////////
//	
//	Inner Classess : 
//
//	Declare a class inside another class
//
/////////////////////////////////////////////////////////////////////////////////////

// outer class
class InnerClass
{
	// inner class
	class Inner
	{
		public void m1()
		{
			System.out.println("m1 method");
		}
	}

	//main method
	public static void main(String[] args)
	{
		InnerClass.Inner i = new InnerClass().new Inner();
		i.m1();

		new InnerClass().new Inner().m1();
	}
	
}
////////////////////////////////////////////////////////////////////////////////////
//
//	Output	:	m1 method
//				m1 method
//
////////////////////////////////////////////////////////////////////////////////////
