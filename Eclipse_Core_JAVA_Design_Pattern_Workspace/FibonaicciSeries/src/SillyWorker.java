
public class SillyWorker {

	public static void main(String[] args) throws Exception {

		int n = 10;

		// stopWatch stopWatch = new StopWatch();
		FibonacciProblem bigProblem = new FibonacciProblem(n);

		long result = bigProblem.solve();
		bigProblem.solve();
		// stopWatch.stop();

		System.out.println("Computing Fib number: " + n);
		System.out.println("Computed Result: " + result);

	}

}