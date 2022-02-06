package DateClass;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date.toString());
		SimpleDateFormat SDF = new SimpleDateFormat("M/dd/yy hh:mm:ss zzzz");
		System.out.println(SDF.format(date));
	}

}
