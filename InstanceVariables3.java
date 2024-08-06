// Demonstration of Instance Block

class InstanceVariables3
{	
	// Instance Variable
	int i;					// default value by JVM
	int j = 100;

	public static void main(String[] args)
	{
		InstanceVariables3 iobj1 = new InstanceVariables3();
		System.out.println(iobj1.i);

		InstanceVariables3 iobj2 = new InstanceVariables3();
		System.out.println(iobj2.j);
	}
}