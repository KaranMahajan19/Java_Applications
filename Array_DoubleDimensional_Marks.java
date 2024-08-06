
//	Arrays
// 	Arays is a collection of homogeneous data elements

/////////////////////////////////////////////////////////////////////////////////////
//
//	Double Dimensional Array
// 
//	Write a java program to accept six marks of a student 
//	then find out total & average
//
/////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

class Array_DoubleDimensional_Marks
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int[] marks = new int[6];

		for(int i=0; i<marks.length; i++)
		{
			System.out.print("Enter the marks : "+(i+1)+" : ");
			marks[i] = sc.nextInt();
		}

		// reading
		int total = 0;
		for(int i:marks)
		{
			total += i;
		}

		System.out.println("Total : "+total);
		System.out.println("Average : "+total/6);
	}
}

//////////////////////////////////////////////////////////////////////
//
//	Input	:	Enter the marks : 1 : 98
//				Enter the marks : 2 : 45
//				Enter the marks : 3 : 81
//				Enter the marks : 4 : 39
//				Enter the marks : 5 : 66
//				Enter the marks : 6 : 49
//	
//	Output	:	Total : 378
//				Average : 63
//
//////////////////////////////////////////////////////////////////////
