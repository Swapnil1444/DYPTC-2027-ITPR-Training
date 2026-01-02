package lab5;
import java.time.*;
public class date_time {

	public static void main(String[] args) {
	LocalDateTime tm=LocalDateTime.now();
	int dd=tm.getDayOfYear();
	Month MM=tm.getMonth();
	int yyyy=tm.getYear();
	
	int HH=tm.getHour();
	int mm=tm.getMinute();
	int ss=tm.getSecond();
	
	System.out.print("date:"+dd+"/"+MM+"/"+yyyy+"\n"+"time:"+ HH+":"+mm+":"+ss);
	
	System.out.println("\n\n");
	Month[] m = Month.values();
	
	for(Month  v:m) {
		
		System.out.println(v.name()+" : "+v.length(false)+" Day");
		
	}

	}

}
