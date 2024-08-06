
//	OOPS Concepts

/////////////////////////////////////////////////////////////////////////////////////
//
//	Oops Concept 	:	Constructors
//
//	User Defined Constructor : Constructor declared by User
//	-------------------------
//	2. Parameterized Constructor
//		:	if we pass atleast one arg to userdefined constructor
//
/////////////////////////////////////////////////////////////////////////////////////

class OOPS_UserDefConstructorParameterized
{
	//current class variables
	private int empId;
	private String empName;
	private double empSal;

	public OOPS_UserDefConstructorParameterized(int empId, String empName, double empSal)
	{
		// this : current class variable
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
	}

	public void getEmployeeDetails()
	{
		System.out.println("Employee Id : "+empId);
		System.out.println("Employee Name : "+empName);
		System.out.println("Employee Salary : "+empSal);
	}


	public static void main(String[] args)
	{
		OOPS_UserDefConstructorParameterized obj = new OOPS_UserDefConstructorParameterized(101, "Karan", 10000d);	//passing parameters
		obj.getEmployeeDetails();
	}
}


//////////////////////////////////////////////////////////////////////
//
//	Output	:	Employee Id : 101
//				Employee Name : Karan
//				Employee Salary : 10000.0
//
//////////////////////////////////////////////////////////////////////
