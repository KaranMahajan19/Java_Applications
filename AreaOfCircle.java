// Write a java program to find out area of circle

import java.util.Scanner;

class AreaOfCircle
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the radius : ");
		int r = sc.nextInt();

		float areacircle = 3.14f*r*r;
		System.out.println("Area of Circle is  : "+areacircle);
	}
}