package test.com;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.GregorianCalendar;

//import java.util.Date;
//import java.sql.Date;

public class Test01Date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startTime = System.currentTimeMillis();
		System.out.println("Date");
		System.out.println(System.currentTimeMillis());
//		System.out.println(new java.util.Date());
		System.out.println(new java.sql.Date(System.currentTimeMillis()));
		
		Timestamp ts = new Timestamp(System.currentTimeMillis());
		System.out.println(ts.getTime());
		
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH)+1);
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		System.out.println(cal.get(Calendar.AM));
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		System.out.println(cal.get(Calendar.HOUR_OF_DAY));
		System.out.println(cal.get(Calendar.MINUTE));
		System.out.println(cal.get(Calendar.SECOND));
		
		GregorianCalendar gcal = new GregorianCalendar(2018, 12, 25, 10, 15, 40);
		System.out.println(gcal.get(Calendar.YEAR));
		System.out.println(gcal.get(Calendar.MONTH)+1);
		System.out.println(gcal.get(Calendar.DAY_OF_MONTH));
		System.out.println(gcal.get(Calendar.AM));
		System.out.println(gcal.get(Calendar.DAY_OF_WEEK));
		System.out.println(gcal.get(Calendar.HOUR_OF_DAY));
		System.out.println(gcal.get(Calendar.MINUTE));
		System.out.println(gcal.get(Calendar.SECOND));
		
		
		
		
		System.out.println("============");
		System.out.println(System.currentTimeMillis()-startTime);
		
		
		
		
		
		
	}

}
