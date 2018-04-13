public class EulerConstant {
	
	public static void main(String[] args) {
	
		double result1 = compute(2);
		double result2 = compute(5);
		double result3 = compute(12);

		System.out.printf("Diff of result2 and result1 = %.9f", (result2 - result1));
		System.out.printf("\nDiff of result3 and result2 = %.9f", (result3 - result2));
	}

	private static double compute(int n) {
		
		double e = 1;
		int factorial = 1;
		System.out.println("Computing with n = " + n);
			for (int i = 1; i <= n; i++ ) {
				factorial = factorial * i;
				System.out.print("Factorial of " + i + " is " + factorial + "        ");
				e = e + 1/(double) factorial;
				System.out.printf("e = %.9f", e);
				System.out.println("");

			}
				System.out.printf("e = %.9f", e);
				System.out.println("\n");
				return e;
	}
}
