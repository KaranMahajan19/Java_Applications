// Write a ajava program to display below Pattern

////////////////////////////////////////////////////////////////
//
//  Output  :           *
//                      *
//                  * * * * *
//                      *
//                      *
//
////////////////////////////////////////////////////////////////

class PascalTriangle3
{
  public static void main(String[] args)
  {

    //rows
    for(int i=1; i<=5; i++)
    {
      //cloumns
      for(int j=1; j<=5; j++)
      {
        if(i==3 || j==3)
        {
          System.out.print("* ");
        }
        else
        {
          System.out.print("  ");
        }
      }
      System.out.println();
    }
  }
}