package day27java;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.TimeZone;

public class DateTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//localDate();
		//localTime();
		localDateTime();
	}
	
	public static void localDate() {
		LocalDate localDate = LocalDate.now();
		System.out.println("Current Local date is : "+localDate);
		System.out.println("Day of the month : "+localDate.getDayOfMonth());
		System.out.println("Day of the year : "+localDate.getDayOfYear());
		System.out.println("Day of the week : "+localDate.getDayOfWeek());
		System.out.println("Month value is : "+localDate.getMonthValue());
		System.out.println("Length of the month is : "+localDate.lengthOfMonth());
		System.out.println("Length of the year is : "+localDate.lengthOfYear());
		System.out.println("Is Leap Year : "+localDate.isLeapYear());
		System.out.println("Yesterday date is : "+localDate.minusDays(1));
		System.out.println("Tomorrow's date is : "+localDate.plusDays(1));
		System.out.println("Month name is : "+localDate.getMonth());
		System.out.println("***********Date*************");
		LocalDate pastDate = LocalDate.of(1947, 8, 15);
		System.out.println("Current Local date is : "+pastDate);
		System.out.println("Day of the month : "+pastDate.getDayOfMonth());
		System.out.println("Day of the year : "+pastDate.getDayOfYear());
		System.out.println("Day of the week : "+pastDate.getDayOfWeek());
		System.out.println("Month value is : "+pastDate.getMonthValue());
		System.out.println("Length of the month is : "+pastDate.lengthOfMonth());
		System.out.println("Length of the year is : "+pastDate.lengthOfYear());
		System.out.println("Is Leap Year : "+pastDate.isLeapYear());
		System.out.println("Yesterday date is : "+pastDate.minusDays(1));
		System.out.println("Tomorrow's date is : "+pastDate.plusDays(1));
		System.out.println("Month name is : "+pastDate.getMonth());
		System.out.println("*************Zone ID**************");
		String[] zoneIDs = TimeZone.getAvailableIDs();
//		for (String zone : zoneIDs) {
//			System.out.println(zone);
//		}
		LocalDate cetDate = LocalDate.now(ZoneId.of("US/Eastern"));
		System.out.println("Current Local date is : "+cetDate);
		System.out.println("Day of the month : "+cetDate.getDayOfMonth());
		System.out.println("Day of the year : "+cetDate.getDayOfYear());
		System.out.println("Day of the week : "+cetDate.getDayOfWeek());
		System.out.println("Month value is : "+cetDate.getMonthValue());
		System.out.println("Length of the month is : "+cetDate.lengthOfMonth());
		System.out.println("Length of the year is : "+cetDate.lengthOfYear());
		System.out.println("Is Leap Year : "+cetDate.isLeapYear());
		System.out.println("Yesterday date is : "+cetDate.minusDays(1));
		System.out.println("Tomorrow's date is : "+cetDate.plusDays(1));
		System.out.println("Month name is : "+cetDate.getMonth());
	}
	
	public static void localTime() {
		LocalTime cetTime = LocalTime.now(ZoneId.of("CET"));
		System.out.println("Current time is : "+cetTime);
	
	}
	
	public static void localDateTime() {
		LocalDateTime cetralLocalDateTime = LocalDateTime.now(ZoneId.of("CET"));
		System.out.println("Cetral Local Date Time is : "+cetralLocalDateTime);
		DateTimeFormatter ofPattern = DateTimeFormatter.ofPattern("dd-MM-yy hh:mm:ss");
		System.out.println("Cetral Local Date Time based on Pattern is : "+cetralLocalDateTime.format(ofPattern));
	}
	

}
