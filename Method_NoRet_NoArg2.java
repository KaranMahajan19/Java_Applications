// Various ways to write methods in java

//-----------------------------------------
// No returntype with No argument method
//------------------------------------------

// write a java program to sum of two number

////////////////////////////////////////////////////////////////
//
//  Input   : 10  20
//
//  Output  : 30
//
////////////////////////////////////////////////////////////////

import java.util.*;

class Method_NoRet_NoArg2
{
  // callie method
  public static void sum()
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter First number : ");
    int a = sc.nextInt();

    System.out.print("Enter Second number : ");
    int b = sc.nextInt();

    int c = a+b;
    System.out.println("Sum of two number is : "+c);
  }

  // main method
  public static void main(String[] args)
  {
    //caller
    sum();
    System.out.println("----------------------------");
    sum();
    System.out.println("----------------------------");
    sum();
  }
}