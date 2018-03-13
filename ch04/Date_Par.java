/**
* Exercise 4-2 Create Methods and Passing Arguments on Print Date.
*/


public class Date_Par 

{ 

public static void printAmerican(String day, int date, String month, int year) {
	
	System.out.println ("American format:" );
System.out.print(day+ ", ");
System.out.print(month);
System.out.print(" ");
System.out.print(date);
System.out.print(", ");
System.out.println(year);
	
	
}

public static void printEuropean(String day, int date, String month, int year) {
	
System.out.println ("European format:" );
System.out.print(day+" ");
System.out.print(date);
System.out.print(" ");
System.out.print(month);
System.out.print(" ");
System.out.print(year);
	
	
}

public static void main(String[] arg) {




String day = "Friday";
int date = 9;
String month = "March";
int year = 2018;


printAmerican(day, date, month, year);
printEuropean(day, date, month, year);

}

}