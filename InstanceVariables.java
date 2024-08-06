// class name
class InstanceVariables
{
	//instance variable
	int i;
	boolean b;
	
	// method name
	public static void main(String[] args)
	{
		//System.out.println(i);	// C.T.E
		
		InstanceVariables t1 = new InstanceVariables();
		InstanceVariables t2 = new InstanceVariables();

		System.out.println(t1.i);
		System.out.println(t2.i);

		t1.i = 20;
		System.out.println(t1.i);

		InstanceVariables b1 = new InstanceVariables();
		System.out.println(b1.b);
	}
}