public class Date 

{ public static void main(String[] arg) {




String day = "Friday";
int date = 9;
String month = "March";
int year = 2018;


System.out.println ("American format:" );
System.out.print(day+ ", ");
System.out.print(month);
System.out.print(" ");
System.out.print(date);
System.out.print(", ");
System.out.println(year);
System.out.println ("European format:" );
System.out.print(day+" ");
System.out.print(date);
System.out.print(" ");
System.out.print(month);
System.out.print(" ");
System.out.print(year);
}

}




public class Time {
public static void main (String[] arg) {
int hour = 15;
int minute = 20;
int second = 10;


int hour2 = 15;
int minute2 = 44;
int second2 = 20;


System.out.println(hour*60*60 + minute*60 + second);
System.out.println(24*60*60 - (hour*60*60 + minute*60 + second));
System.out.println((hour*60*60 + minute*60 + second)/(24.00*60*60));

System.out.println((hour2*60*60 + minute2*60 + second2) - (hour*60*60 + minute*60 + second) );
 }

}