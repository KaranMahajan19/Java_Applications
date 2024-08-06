
////////////////////////////////////////////////////////////
//
//	Input	:	Enter a No : 101
//				Enter a Name : Karan Mahajan
//				Enter a Salary : 30.123
//
//	Output	:	101 KaranMahajan 30.123
//
////////////////////////////////////////////////////////////

import java.util.*;
class Querry
{
	public static void main(String[] args)
	{
		Scanner sc  = new Scanner(System.in);
		System.out.print("Enter a No : ");
		int no = sc.nextInt();

		System.out.print("Enter a Name : ");
		String name = sc.next();

		System.out.print("Enter a Salary : ");
		double sal = sc.nextDouble();
		
		System.out.print(no+" "+name+" "+sal);

	}
}