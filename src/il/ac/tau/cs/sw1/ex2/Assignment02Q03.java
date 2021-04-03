package il.ac.tau.cs.sw1.ex2;

public class Assignment02Q03 {
	public static int fib(int n) {
		if (n==0)
			return 0;
		else if (n==1)
			return 1;
		else 
			return fib(n-1)+fib(n-2);
		
	}

	public static void main(String[] args) {
		int numOfEven = 0;
		int n = Integer.parseInt(args[0]);
		System.out.println("The first "+ n +" Fibonacci numbers are:");
		for (int i = 0; i<n; i++) {
			System.out.print(fib(i)+ " ");
			if (fib(i) % 2 == 0)
				numOfEven++;
		}
		System.out.println("");
		System.out.println("The number of even numbers is: "+numOfEven);
	}

}
