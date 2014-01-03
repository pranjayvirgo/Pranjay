import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	try{
		
	ApplicationContext context = 
		    	  new FileSystemXmlApplicationContext(new String[] {"spring-config.xml"});
		 
		    	
	}
	catch(Exception e){
		
	}

}
}

