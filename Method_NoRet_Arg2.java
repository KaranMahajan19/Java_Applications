// Various ways to write methods in java

//-----------------------------------------
// No returntype with argument method
//------------------------------------------

// write a java program to display factorial of given number

////////////////////////////////////////////////////////////////
//
//  Input   : 5     : 5*4*3*2*1
//
//  Output  : 120
//
////////////////////////////////////////////////////////////////

import java.util.*;

class Method_NoRet_Arg2
{
  //callie
  public static void factorial(int n)
  {
    int fact = 1;
    for(int i=n; i>=1; i--)
    {
      fact *= i;    //fact = fact * i;
    }
    System.out.println("Factorial is : "+fact);
  }
  
  //caller
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter First number : ");
    int n = sc.nextInt();

    //caller
    factorial(n);
  }
}