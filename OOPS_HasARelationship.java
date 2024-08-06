
//	OOPS Concepts

/////////////////////////////////////////////////////////////////////////////////////
//
//	Oops Concept 	:	Has a relationship / Composition / Aggragatin
//	
//	One Class object we'll create in another class
//
/////////////////////////////////////////////////////////////////////////////////////

class College
{
	public String courseName()
	{
		return "Core Java";
	}

	public double courseFee()
	{
		return 30000d;
	}

	public String trainerName()
	{
		return "Karan Mahajan";
	}
}

class Counsellor
{
	public void getCourseDetails()
	{
		College college = new College();
		System.out.println("Course Name : "+college.courseName());
		System.out.println("Course Fees : "+college.courseFee());
		System.out.println("Trainer Name : "+college.trainerName());
	}
}

class OOPS_HasARelationship
{
	public static void main(String[] args)
	{
		Counsellor counsellor = new Counsellor();

		counsellor.getCourseDetails();
	}
}


//////////////////////////////////////////////////////////////////////
//
//	Output	:	Course Name : Core Java
//				Course Fees : 30000.0
//				Trainer Name : Karan Mahajan
//
//////////////////////////////////////////////////////////////////////
