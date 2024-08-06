

/////////////////////////////////////////////////////////////////////////////////////
//
//	Package :	
//----------------
//	Collection of classess, interfaces, enums, annotations
//	
//	1.Pre-Defined Packages
//	2.User-defined Packages
//
//	1.Pre defined packages
//	----------------------
/////////////////////////////////////////////////////////////////////////////////////

package com.karan.www;
import java.util.Calendar;

class Package
{
	public static void main(String[] args)
	{
		Calendar c = Calendar.getInstance();
		int h = c.get(Calendar.HOUR_OF_DAY);

		if(h<12)
		{
			System.out.println("Good Morningggg.....");
		}
		else if(h<16)
		{
			System.out.println("Good Afternoon.....");
		}
		else if(h<20)
		{
			System.out.println("Good Evening.....");
		}
		else
		{
			System.out.println("Good Night.....");
		}
	}
}

//////////////////////////////////////////////////////////////////////
//
//	Command to compile : javac -d . Package.java 
//	
//	Comman to run 	   : java com.karan.www.Package
//
//	Output			   : Good Morningggg.....
//
//////////////////////////////////////////////////////////////////////
