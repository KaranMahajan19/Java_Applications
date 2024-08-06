
//	OOPS Concepts
//	Object Creation

/////////////////////////////////////////////////////////////////////////////////////
//
//	Oops Concept 	: Object
//
/////////////////////////////////////////////////////////////////////////////////////

class OOPS_ObjectCreation
{
	public static void main(String[] args)
	{
		OOPS_ObjectCreation obj1 = new OOPS_ObjectCreation();
		OOPS_ObjectCreation obj2 = new OOPS_ObjectCreation();
		OOPS_ObjectCreation obj3 = new OOPS_ObjectCreation();

		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		System.out.println(obj3.hashCode());

		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
	}

}

//////////////////////////////////////////////////////////////////////
//
//	Output	:	1940030785
//				1869997857
//				1763847188
//
//				OOPS_ObjectCreation@73a28541
//				OOPS_ObjectCreation@6f75e721
//				OOPS_ObjectCreation@69222c14
//
//////////////////////////////////////////////////////////////////////
