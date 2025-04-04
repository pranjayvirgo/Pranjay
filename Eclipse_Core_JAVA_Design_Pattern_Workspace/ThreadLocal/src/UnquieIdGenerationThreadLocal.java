import java.util.concurrent.atomic.AtomicLong;


public class UnquieIdGenerationThreadLocal {
	 private static final AtomicLong nextId = new AtomicLong(0);
private static ThreadLocal<Long> uniqueId=new ThreadLocal<Long>(){
	@Override
	protected Long initialValue() {
                 return nextId.getAndIncrement();
         }
		     };

public static void getUniqueId(){
	System.out.println(uniqueId.get());
}
}