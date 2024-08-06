//	Demonstration of logical OR operators
//	||

class LogicalOR
{
	public static void main(String[] args)
	{
		boolean b1 = true || true;
		System.out.println(b1);			// true

		boolean b2 = true || false;
		System.out.println(b2);			// true	

		boolean b3 = false || true;
		System.out.println(b3);			// true

		boolean b4 = false || false;
		System.out.println(b4);			// flase
	}
}