import java.util.concurrent.atomic.AtomicInteger;


public class UniqueIdThreadLocal {
private static final AtomicInteger unique_id=new AtomicInteger(0);
private static final ThreadLocal<AtomicInteger> unique_num=new ThreadLocal<AtomicInteger>(){
	
};
}
