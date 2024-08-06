//	Arrays
// 	Arays is a collection of homogeneous data elements

///////////////////////////////////////////////////////////////////
//
//	Single Dimensional Array
//
//	Write a java program to accept array elements and display them
//
///////////////////////////////////////////////////////////////////

import java.util.Scanner;
import java.util.Arrays;

class Array_SingleDimensional
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Array size : ");
		int size = sc.nextInt();

		int arr[] = new int[size];

		//inserting elements
		for(int i=0; i<arr.length; i++)
		{
			System.out.print("Enter the elements of arr["+i+"] : ");

			arr[i] = sc.nextInt();
		}
		System.out.print("arr"+Arrays.toString(arr));
	}
}


//////////////////////////////////////////////////////////////////////
//
//	Input	:	Enter Array size : 4
//				Enter the elements of arr[0] : 10
//				Enter the elements of arr[1] : 20
//				Enter the elements of arr[2] : 30
//				Enter the elements of arr[3] : 40
//
//	Output	:	arr[10, 20, 30, 40]
//
//////////////////////////////////////////////////////////////////////
