
/////////////////////////////////////////////////////////////////////////////////////
//	
//	Abstract class : 
//	
//	Collection of zero or more abstract methods and concrete methods
//	
/////////////////////////////////////////////////////////////////////////////////////

abstract class Shape
{

	//abstract method
	public abstract void area();
}

class Circle extends Shape
{
	public void area()
	{
		int r = 5;
		System.out.println("Area of Circle is : "+3.14f*r*r);
	}
}


class AbstractClass2
{
	public static void main(String[] args)
	{
		Circle c = new Circle();
		c.area();
	}
}

////////////////////////////////////////////////////////////////////////////////////
//
//	Output	:	Area of Circle is : 78.5
//
////////////////////////////////////////////////////////////////////////////////////