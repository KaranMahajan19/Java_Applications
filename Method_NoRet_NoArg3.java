// Various ways to write methods in java

//-----------------------------------------
// No returntype with No argument method
//------------------------------------------

// write a java program to display Perfect square from 1 to 100

////////////////////////////////////////////////////////////////
//
//  Output  : 1  4  9  16  25  36  49  64  81  100
//
////////////////////////////////////////////////////////////////

import java.util.*;

class Method_NoRet_NoArg3
{
  // callie method
  public static void square()
  {
    for(int i=1; i<=10; i++)
    {
      System.out.print(i*i+"  ");
    }
  }

  // main method
  public static void main(String[] args)
  {
    // caller
    square();
  }
}