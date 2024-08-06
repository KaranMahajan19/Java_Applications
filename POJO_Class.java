
/////////////////////////////////////////////////////////////////////////////////////
//	
//	POJO class : Plain Old Java Object
//	
//	All Variables must be private
//	All variable must have setter and getter methods
//
/////////////////////////////////////////////////////////////////////////////////////

class A
{
	private int studId;
	private String studName;
	private double studFee;

	//setter methods
	public void setStudId(int studId)
	{
		this.studId = studId;
	}

	public void setStudName(String studName)
	{
		this.studName = studName;
	}

	public void setStudFee(double studFee)
	{
		this.studFee = studFee;
	}

	//getter methods
	public int getStudId()
	{
		return studId;
	}

	public String getStudName()
	{
		return studName;
	}

	public double getStudFee()
	{
		return studFee;
	}

}

class POJO_Class
{
	public static void main(String[] args)
	{
		A a = new A();
		a.setStudId(101);
		a.setStudName("Karan");
		a.setStudFee(10000d);

		System.out.println("Student Id : "+a.getStudId());
		System.out.println("Student Name : "+a.getStudName());
		System.out.println("Student Fee : "+a.getStudFee());
	}
}

////////////////////////////////////////////////////////////////////////////////////
//
//	Output	:	Student Id : 101
//				Student Name : Karan
//				Student Fee : 10000.0
//
////////////////////////////////////////////////////////////////////////////////////
