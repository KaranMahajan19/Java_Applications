
//	OOPS Concepts

/////////////////////////////////////////////////////////////////////////////////////
//
//	Oops Concept
//
//	Encapsulation Setter Getter Method used to access private data
//
/////////////////////////////////////////////////////////////////////////////////////


class Student
{
	private int studId;
	private String studName;
	private double studFee;

	//////////////////////////////////////////////////
	//	setter methods
	//////////////////////////////////////////////////
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

	//////////////////////////////////////////////////
	//	getter method
	//////////////////////////////////////////////////
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
	
class OOPS_EncapsulationSetterGetterMethod2
{
	public static void main(String[] args)
	{
		//object creation
		Student stud = new Student();
		
		//caller set method
		stud.setStudId(101);
		stud.setStudName("Karan");
		stud.setStudFee(10000d);

		System.out.println("Student Id : "+stud.getStudId());
		System.out.println("Student Name : "+stud.getStudName());
		System.out.println("Student Fee : "+stud.getStudFee());
	}
}


//////////////////////////////////////////////////////////////////////
//
//	Output	:	Student Id : 101
//				Student Name : Karan
//				Student Fee : 10000.0
//
//////////////////////////////////////////////////////////////////////
