import java.time.*;

class ImplicitImport
{
	public static void main(String[] args)
	{
		LocalDate date = LocalDate.now();
		System.out.println(date);

		LocalTime time = LocalTime.now();
		System.out.println(time);
	}
}