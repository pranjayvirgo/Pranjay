import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class ThreadLocalTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService executor=Executors.newFixedThreadPool(10);
		for(int i=0;i<10;i++){
			executor.execute(new Runnable() {
				
				@Override
				public void run() {
					UnquieIdGenerationThreadLocal.getUniqueId();
					
				}
			});
		}
	}

}
