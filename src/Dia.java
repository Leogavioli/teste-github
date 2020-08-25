import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Dia {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		Date d2 = sdf1.parse("21/04/1994");
		System.out.println(d2);
		System.out.println(sdf1.format(d2));
		Date d1 = new Date();
		System.out.println(d1);
		System.out.println(sdf1.format(d1));
		Date d3 = new Date(System.currentTimeMillis());
		System.out.println(d3);
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		System.out.println(sdf2.format(d1));
		Date d4 = new Date(1697540230026L);
		System.out.println(sdf2.format(d4));
		Calendar cal = Calendar.getInstance();
		cal.setTime(d4);
		cal.add(Calendar.DAY_OF_MONTH,3);
		cal.add(Calendar.SECOND, 3600);
		d4=cal.getTime();
		System.out.println(sdf2.format(d4));
		
	
	
		

	}

}
