//	Arrays
// 	Arays is a collection of homogeneous data elements

/////////////////////////////////////////////////////////////////////
//
//	Single Dimensional Array
//
//	Write a java program to display Even & Odd elements form given array
//
/////////////////////////////////////////////////////////////////////


class Array_SingleDimensional_Even_Odd
{
	public static void main(String[] args)
	{
		int arr[] = {4,6,5,9,8,11,10};

		int even=0, odd=0;
		// for each
		for(int i:arr)
		{
			//even elements
			if(i%2==0)
			{
				even++;
			}

			//odd elements
			if(i%2==1)
			{
				odd++;
			}
		}
		System.out.println("Even Elements are : "+even);
		System.out.println("Odd Elements are : "+odd);
	}
}


//////////////////////////////////////////////////////////////////////
//
//	Output	:	Even Elements are : 4
//				Odd Elements are : 3
//
//////////////////////////////////////////////////////////////////////
