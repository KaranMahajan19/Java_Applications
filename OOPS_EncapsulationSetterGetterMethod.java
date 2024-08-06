
//	OOPS Concepts

/////////////////////////////////////////////////////////////////////////////////////
//
//	Oops Concept
//
//	Encapsulation Setter Getter Method used to access private data
//
/////////////////////////////////////////////////////////////////////////////////////


// main method
class OOPS_EncapsulationSetterGetterMethod
{
	private double balance = 90000d;

	//setter method
	public void setBalance(double balance)
	{
		this.balance = balance;
	}

	//getter method
	public double getBalance()
	{
		return balance;
	}

	public static void main(String[] args)
	{
		OOPS_EncapsulationSetterGetterMethod setget = new OOPS_EncapsulationSetterGetterMethod();
		System.out.println(setget.balance);
	}

}

//////////////////////////////////////////////////////////////////////
//
//	Output	:	90000
//
//////////////////////////////////////////////////////////////////////
