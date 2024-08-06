
// Demonstration of Time

import java.util.Date;

class DateTime3
{
	public static void main(String[] args)
	{
		Date d = new Date();

		int hr = d.getHours();
		int min = d.getMinutes();
		int sec = d.getSeconds();
		
		System.out.println(hr+":"+min+":"+sec);
	}
}  