
//class name
class IdentifiersRules
{
	//main method
	public static void main(String[] args)
	{	
		// Rule 1 : A to Z, a to z, 0 to 9
		char AtoZ = 'A';
		char atoz = 'a';
		int _0to9 = 0;
		System.out.println(AtoZ);
		System.out.println(atoz);
		System.out.println(_0to9);
		
		// Rule 2 : _ & $
		int _UnderScore = 0;
		int $Dollar = 0 ;
		System.out.println(_UnderScore);
		System.out.println($Dollar);
		
		// Rule 3 : 
		int _a = 0;
		int $ = 0;

		// Rule 4 : 
		int number = 10;
		int NUMBER = 20;
		int NumBer = 30;
		System.out.println(number);
		System.out.println(NUMBER);
		System.out.println(NumBer);

		//Rule 5 :
		/*
		int if = 10;	// invalid
		int else = 10;	// invalid
		int do = 10; // invalid
		*/

		// Rule 6 : Dont take >15 characters for an identifiers
		//			nothing will happen but industry not preffer
		int a123456789123456 = 10;
		System.out.println(a123456789123456);
	}
}