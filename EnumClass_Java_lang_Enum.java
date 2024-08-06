
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

class EnumClass_Java_lang_Enum
{
	public static void main(String[] args)
	{
		Week [] w = Week.values();

		for(Week w1:w)
		{
			System.out.println(w1);
		}
	}
}

////////////////////////////////////////////////////////////////////////////////////
//
//	Output	:	MON
//				TUE
//				WED
//				THU
//				FRI
//				SAT
//				SUN
//
////////////////////////////////////////////////////////////////////////////////////