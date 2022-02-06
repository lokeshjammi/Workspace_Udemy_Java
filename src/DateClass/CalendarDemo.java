package DateClass;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarDemo {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat SDF = new SimpleDateFormat("dd/M/yy hh:mm:ss zzz");
		System.out.println(SDF.format(cal.getTime()));
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		
	}

}
