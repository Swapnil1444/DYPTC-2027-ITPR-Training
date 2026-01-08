import java.time.*;
public class date_time {

	public static void main(String[] args) {
		LocalDateTime time= LocalDateTime.now();
		System.out.println(time);
		System.out.println(time.getDayOfMonth());
		System.out.println(time.getDayOfYear());
		System.out.println(time.getMonth());
		
		
		ZonedDateTime zone=ZonedDateTime.now();
		System.out.println(zone);
		System.out.println(zone);

	}

}
