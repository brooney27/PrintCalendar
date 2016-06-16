import java.util.*;
/**
 * Java program to demonstrate How to format String in Java by using
 * format() method of String class and printf() method of OutputStream in Java.
 * String.format() is very powerful and not only can format String but numbers
 * and Date in Java
 */
public class DateFormatter{
 
 public static void main(String args[]){
	 
	 Scanner in = new Scanner(System.in);
	 System.out.println("Enter the month: ");
	 int month = in.nextInt() - 1;
	 System.out.println("Enter the year: ");
	 int year = in.nextInt();
	 
	 String months[] = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
	 String days[] = {"Mon","Tue","Wed","Thu","Fri","Sat","Sun"};
	 int[] maxdays = {31,28,31,30,31,30,31,31,30,31,30,31};
	 if(year%4==0)maxdays[1]=29;
	 
	 GregorianCalendar gc = new GregorianCalendar(year,month,1);
	 
	 System.out.println("\t\t\t" + months[month]+ " " + year);
	 for(int i = 0; i < 7; i++){
		 System.out.print(days[i] + "\t");
	 }
	 System.out.println("");
	 int start = gc.get(Calendar.DAY_OF_WEEK);
	 for(int i = 0; i < start; i++){
		 System.out.print("\t");
	 }
	 int day = 1;
	 
	 for(int i = 0; i < 6; i++){
		 for(int j = start; j < 7; j++){
			 System.out.print(day + "\t");
			 day++;
			 if(day==maxdays[month]+1)break;
		 }
		 System.out.println("");
		 start=0;
	 }
 }
}