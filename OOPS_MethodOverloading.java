
//	OOPS Concepts

/////////////////////////////////////////////////////////////////////////////////////
//
//	Oops Concept 	:	Method Overloading
//
//	Having same method name wirh diff. parameters ina single class
//
/////////////////////////////////////////////////////////////////////////////////////

class MeeSeva
{
	//////////////////////////////////////////////////////
	//	Overloaded methods
	//////////////////////////////////////////////////////
	public void search(int voterId)
	{
		System.out.println("Details Found via votetID");
	}

	public void search(String houseNo)
	{
		System.out.println("Details Found via houseNo");
	}

	public void search(long aadharNo)
	{
		System.out.println("Details Found via aadharNo");
	}
}

class OOPS_MethodOverloading
{
	public static void main(String[] args)
	{
		MeeSeva ms = new MeeSeva();
		ms.search(101);
		ms.search("1-1-3/4/3");
		ms.search(1234567890L);
	}
}


//////////////////////////////////////////////////////////////////////
//
//	Output	:	Details Found via votetID
//				Details Found via houseNo
//				Details Found via aadharNo
//
//////////////////////////////////////////////////////////////////////
