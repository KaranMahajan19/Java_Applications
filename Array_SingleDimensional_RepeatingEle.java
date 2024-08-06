//	Arrays
// 	Arays is a collection of homogeneous data elements

/////////////////////////////////////////////////////////////////////
//
//	Single Dimensional Array
//
//	Write a java program to display most repeating element form given 
//	array
//
/////////////////////////////////////////////////////////////////////

class Array_SingleDimensional_RepeatingEle
{
	public static void main(String[] args)
	{
		int arr[] = {5,2,6,1,6,9,8,6,2,6};
		
		int element=0;
		int maxCount=0;

		//nested for loop
		for(int i=0; i<arr.length; i++)
		{
			int count = 0;
			for(int j=0; j<arr.length; j++)
			{
				if(arr[i] == arr[j])
				{
					count++;
				}
			}
			if(count>maxCount)
			{
				maxCount=count;
				element=arr[i];
			}
		}
		System.out.println(element+" is repeating for "+maxCount+" times");

	}
}

//////////////////////////////////////////////////////////////////////
//
//	Output	:	6 is repeating for 4 times
// 
//////////////////////////////////////////////////////////////////////
