// Write a ajava program to display below Pascal triangle

////////////////////////////////////////////////////////////////
//
//  Output  :               1
//                         1 1
//                        1 2 1
//                       1 3 3 1
//                      1 4 6 4 1
//
////////////////////////////////////////////////////////////////

class PascalTriangle2
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
        number = (number*(i-k)/(k+1));
      }
      System.out.println();
    }
    
  }
}