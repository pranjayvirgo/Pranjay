import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class DateSubstractionDemo {

	/**
	 * @param args
	 * @throws ParseException 
	 */
	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
String shippingDate="07/19/2012";
DateSubstractionDemo d=new DateSubstractionDemo();
if(d.calculateDayDiff(shippingDate)>5)
{
System.out.println("shipping date is greater than 5");

	}
else{
	System.out.println("shipping date is less than 5");
}
	}
	public int calculateDayDiff(String shippingDate) throws ParseException{
		SimpleDateFormat dateFormat=new SimpleDateFormat("MM/dd/yyyy");
		Date shipping_Date=dateFormat.parse(shippingDate);
		System.out.println("shipping Date"+shipping_Date);
		Date current_date=new Date();
		System.out.println("Current Date"+current_date);
		int dayDiff=(int)((current_date.getTime()-shipping_Date.getTime())/(24*60*60*1000));
		System.out.println(dayDiff);
		return dayDiff;
	}

}
