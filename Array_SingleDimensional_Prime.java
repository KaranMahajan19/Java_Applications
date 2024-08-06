//	Arrays
// 	Arays is a collection of homogeneous data elements

/////////////////////////////////////////////////////////////////////
//
//	Single Dimensional Array
//
//	Write a java program to display Prime elements form given array
//
/////////////////////////////////////////////////////////////////////


class Array_SingleDimensional_Prime
{
	public static void main(String[] args)
	{
		int arr[] = {5,9,8,11,13,16,10};

		// for each
		for(int n:arr)
		{
			boolean flag=true;
			for(int i=2; i<=n/2; i++)
			{
				if(n%i==0)
				{
					flag = false;
					break;
				}
			}
			if(flag==true)
			{
				System.out.print(n+" ");
			}
		}
	}
}


//////////////////////////////////////////////////////////////////////
//
//	Output	:	5 11 13
//
//////////////////////////////////////////////////////////////////////
