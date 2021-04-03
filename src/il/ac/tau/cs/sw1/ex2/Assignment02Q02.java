package il.ac.tau.cs.sw1.ex2;

public class Assignment02Q02 {

	public static void main(String[] args) {
		// do not change this part below
		double piEstimation = 0.0;
		double num = Double.parseDouble(args[0]);
		double result=1;
		for (int i=1; i<=num; i++) {
			double numerator = Math.pow(-1,i);
			double denominator = Math.pow(2,i)+1;
			result+= (numerator/denominator);
		}
		piEstimation = 4*result;
		// do not change this part below
		System.out.println(piEstimation + " " + Math.PI);

	}

}
