import java.text.*; 
import java.util.*; 

public class DateFormatTest 
{ 
  public DateFormatTest() throws ParseException
  { 
    String dateString = "07/25/2012"; 
     
    DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
    Date convertedDate = (Date)dateFormat.parse(dateString); 

    System.out.println("Converted string to date : " + convertedDate); 
  } 

  public static void main(String[] argv) throws ParseException 
  { 
    new DateFormatTest() ; 
  } 
} 

