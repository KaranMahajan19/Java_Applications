// Write a ajava program to display below loop pattern

////////////////////////////////////////////////////////////////
//
//  Output  :       1             1
//                  1 2         2 1
//                  1 2 3     3 2 1
//                  1 2 3 4 4 3 2 1
//
////////////////////////////////////////////////////////////////

class PyramidLoopPatterns5
{
  public static void main(String[] args)
  {
    int rows = 4;
    for(int i=1; i<=rows; i++)
    {
      // left side elements
      for(int j=1; j<=i; j++)
      {
        System.out.print(j+" ");
      }

      // spaces
      for(int j=1; j<=(rows-i)*2; j++)
      {
        System.out.print("  ");
      }

      // right side elements
      for(int j=i; j>=1; j--)
      {
        System.out.print(j+" ");
      }
      System.out.println();
    }
  }
}
