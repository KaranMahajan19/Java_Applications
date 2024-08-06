
//	Arrays
// 	Arays is a collection of homogeneous data elements

/////////////////////////////////////////////////////////////////////////////////////
//
//	Double Dimensional Array
//
//	Write a java program to display array elements in matrix form
//
/////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

class Array_DoubleDimensional_Matrix
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the rows : ");
		int rows = sc.nextInt();

		System.out.print("Enter the columns : ");
		int columns = sc.nextInt();

		int[][] arr = new int[rows][columns];

		// inserting elements
		for(int i=0; i<rows; i++)
		{
			for(int j=0; j<columns; j++)
			{
				System.out.print("Enter elements : ");
				arr[i][j] = sc.nextInt();
			}
		}

		//display elements
		for(int i=0; i<rows; i++)
		{
			for(int j=0; j<columns; j++)
			{

				System.out.print(arr[i][j]+" ");
			}
			//new line
			System.out.println();
		}
	}
}

//////////////////////////////////////////////////////////////////////
//
//	Input	:	Enter the rows : 3
//				Enter the columns : 3
//				Enter elements : 1
//				Enter elements : 2
//				Enter elements : 3
//				Enter elements : 4
//				Enter elements : 5
//				Enter elements : 6
//				Enter elements : 7
//				Enter elements : 8
//				Enter elements : 9
//	
//	Output	:	1 2 3
//				4 5 6
//				7 8 9
//
//////////////////////////////////////////////////////////////////////
