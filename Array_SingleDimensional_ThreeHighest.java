//	Arrays
// 	Arays is a collection of homogeneous data elements

/////////////////////////////////////////////////////////////////////
//
//	Single Dimensional Array
//
//	Write a java program to display three highest element from given 
//	positive integer
//
/////////////////////////////////////////////////////////////////////


class Array_SingleDimensional_ThreeHighest
{
	public static void main(String[] args)
	{
		int arr[] = {3,6,9,5,-19,10};
		
		int firstElement = Integer.MIN_VALUE;
		int secondElement = Integer.MIN_VALUE;
		int thirdElement = Integer.MIN_VALUE;

		for(int i:arr)
		{
			if(i>firstElement)
			{
				thirdElement = secondElement;
				secondElement = firstElement;
				firstElement = i;
			}
			
			else if(i>secondElement)
				{
					thirdElement = secondElement;
					secondElement = i;
				}

			else if(i>thirdElement)
			{
				thirdElement = i;
			}
		}
		System.out.print("Three highest elements are : "+firstElement+" "+secondElement+" "+thirdElement);
	}
}

//////////////////////////////////////////////////////////////////////
//
//	Output	:	Three highest elements are : 10 9 6
//
//////////////////////////////////////////////////////////////////////
