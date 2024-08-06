
// Various ways to write methods in java

//-----------------------------------------
// With returntype with No argument method
//------------------------------------------

// write a java program to perform area of a circle with returntype
//	with no argument method

////////////////////////////////////////////////////////////////
//
//  Input   : 5
//
//  Output  : 78.5
//
////////////////////////////////////////////////////////////////

import java.util.*;

class Method_WithRet_NoArg3
{
	//callie method
	public static float circle()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the radius : ");
		int r = sc.nextInt();

		float area = 3.14f*r*r;

		return area;
	}

	// main method
	public static void main(String[] args)
	{
		//caller method
		float k = circle();

		System.out.println("Area of a circle is : "+k);

	}
}