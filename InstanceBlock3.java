// Demonstration of Instance Block

class InstanceBlock3
{	
	// Instance Block
	{
		System.out.println("Instance Block");
	}

	public static void main(String[] args)
	{
		InstanceBlock2 iobj1 = new InstanceBlock2();

		System.out.println("Main method");
		
		InstanceBlock2 iobj2 = new InstanceBlock2();
	}
}