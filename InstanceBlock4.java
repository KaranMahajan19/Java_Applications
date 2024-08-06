// Demonstration of Instance Block

class InstanceBlock2
{	
	// Instance Variable
	int i;					// default value by JVM

	public static void main(String[] args)
	{
		InstanceBlock4 iobj = new InstanceBlock4();

		System.out.println(iobj.i);
	}
}