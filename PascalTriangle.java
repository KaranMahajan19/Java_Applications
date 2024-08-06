// Write a ajava program to display below Pascal triangle

////////////////////////////////////////////////////////////////
//
//  Output  :           1
//                     1 1
//                    1 1 1
//                   1 1 1 1
//                  1 1 1 1 1
//
////////////////////////////////////////////////////////////////

class PascalTriangle
{
  public static void main(String[] args)
  {
    //rows
    for(int i=0; i<5; i++)
    {
      for(int j=1; j<(5-i); j++)
      {
        System.out.print(" ");
      }

      //element
      int number = 1;
      for(int k=0; k<=i; k++)
      {
        System.out.print(number+" ");
      }
      System.out.println();
    }
    
  }
}