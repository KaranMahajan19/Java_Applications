// Various ways to write methods in java

//-----------------------------------------
// No returntype with argument method
//------------------------------------------

// write a java program to display Sum of two numbers

////////////////////////////////////////////////////////////////
//
//  Input   : 10  20
//
//  Output  : 30
//
////////////////////////////////////////////////////////////////

import java.util.*;

class Method_NoRet_Arg
{
  //callie
  public static void sum(int a, int b)
  {
    int c = a+b;
    System.out.println("Sum of two number is : "+c);
  }
  
  //caller
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter First number : ");
    int a = sc.nextInt();

    System.out.println("Enter Second number : ");
    int b = sc.nextInt();

    sum(a,b);
    System.out.println("----------------------------");
    sum(5,10);
  }
}