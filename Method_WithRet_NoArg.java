// Various ways to write methods in java

//-----------------------------------------
// With returntype with No argument method
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

class Method_WithRet_NoArg
{
  //callie
  public static int factorial()
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number : ");
    int n = sc.nextInt();
    
    int fact = 1;
    for(int i=n; i>=1; i--)
    {
      fact *= i;    //fact = fact * i;
    }
    return fact;
  }
  
  //caller
  public static void main(String[] args)
  {
    
    int k = factorial();        //call

    System.out.println("Factorial is : "+k);

  }
}