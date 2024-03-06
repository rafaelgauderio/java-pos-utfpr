package introducao;

import java.util.GregorianCalendar;

public class GregorianDate {

	public static void main(String[] args) {

		int day, month, year, hour, minute, second;
		GregorianCalendar date = new GregorianCalendar();
		day = date.get(date.DAY_OF_MONTH);
		month = date.get(date.MONTH + 1);
		year = date.get(date.YEAR);
		hour = date.HOUR;
		minute = date.MINUTE;
		second = date.SECOND;

		System.out.println("Data: " + day + "/" + month + "/" + year);
		System.out.println("Hora: " + hour + ":" + minute + ":" + second);
		System.out.println(date);
		
	}

}
