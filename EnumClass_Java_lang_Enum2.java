
/////////////////////////////////////////////////////////////////////////////////////
//	
//	enum : 
//	
//	java.lang.Enum;
//	
//	1.Values()
//	2.Ordinal()
//
/////////////////////////////////////////////////////////////////////////////////////

//enum class
enum Week
{
	//constants
	MON, TUE, WED, THU, FRI, SAT, SUN;
}

class EnumClass_Java_lang_Enum2
{
	public static void main(String[] args)
	{
		Week [] w = Week.values();

		for(Week w1:w)
		{
			System.out.println(w1+" ---> "+w1.ordinal());
		}
	}
}

////////////////////////////////////////////////////////////////////////////////////
//
//	Output	:	MON ---> 0
//				TUE ---> 1
//				WED ---> 2
//				THU ---> 3
//				FRI ---> 4
//				SAT ---> 5
//				SUN ---> 6
//
////////////////////////////////////////////////////////////////////////////////////
