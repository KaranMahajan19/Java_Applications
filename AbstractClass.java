
/////////////////////////////////////////////////////////////////////////////////////
//	
//	Abstract class : 
//	
//	Collection of zero or more abstract methods and concrete methods
//	
/////////////////////////////////////////////////////////////////////////////////////

abstract class Plan
{
	//instance variable
	protected double rate;

	//abstract method
	public abstract void getRate();

	//concrete method
	public void calculateBillAmt(int units)
	{
		
		System.out.println("Total Units : "+units);
		System.out.println("Total Bills : "+(rate*units));
	}
}

class DomesticPlan extends Plan
{
	public void getRate()
	{
		System.out.println("-------For Domestic-------");
		rate = 2.5d;	
	}
}

class CommercialPlan extends Plan
{
	public void getRate()
	{
		System.out.println("------For Commercial------");
		rate = 5.0d;
	}
}

class AbstractClass
{
	public static void main(String[] args)
	{
		DomesticPlan dp = new DomesticPlan();
		dp.getRate();
		dp.calculateBillAmt(250);

		CommercialPlan cp = new CommercialPlan();
		cp.getRate();
		cp.calculateBillAmt(250);
	}
}

////////////////////////////////////////////////////////////////////////////////////
//
//	Output	:	-------For Domestic-------
//				Total Units : 250
//				Total Bills : 625.0
//				------For Commercial------
//				Total Units : 250
//				Total Bills : 1250.0
//
////////////////////////////////////////////////////////////////////////////////////
