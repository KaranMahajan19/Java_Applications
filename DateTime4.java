
// Demonstration of Time

import java.util.Date;

class DateTime4
{
	public static void main(String[] args)
	{
		Date d = new Date();

		int date = d.getDate();

		d.setMonth(6);
		int month = d.getMonth();
		
		d.setYear(2024);
		int year = d.getYear();
		
		System.out.println(date+":"+month+":"+year);
	}
}  