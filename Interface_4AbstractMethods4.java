

/////////////////////////////////////////////////////////////////////////////////////
//
//	Interface : 
//
//	Collection of zero or more abstract methods
//	abstract method is incomplete cz it ends with ';' nd does not have body
//	
/////////////////////////////////////////////////////////////////////////////////////

interface Father
{
	float HT = 6.2f;
	void height();
}

interface Mother
{
	float HT = 5.2f;
	void height();
}

class Child implements Father,Mother
{
	public void height()
	{
		float height = (Father.HT + Mother.HT)/2;
		System.out.println("Child height : "+height);
	}
}

class Interface_4AbstractMethods4
{
	public static void main(String[] args)
	{
		Father f = new Child();
		f.height();

		Mother m = new Child();
		m.height();

		Child c = new Child();
		c.height();
	}
}

////////////////////////////////////////////////////////////////////////////////////
//
//	Output	:	M1 Method
//				M2 Method
//				M3 Method
//
////////////////////////////////////////////////////////////////////////////////////
