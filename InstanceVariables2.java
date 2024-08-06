// Demonstration of Instance Block

class InstanceVariables2
{	
	// Instance Variable
	int i;					// default value by JVM

	public static void main(String[] args)
	{
		InstanceVariables2 iobj = new InstanceVariables2();

		System.out.println(iobj.i);
	}
}