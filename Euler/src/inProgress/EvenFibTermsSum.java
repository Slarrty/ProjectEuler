package inProgress;

public class EvenFibTermsSum {

	public static void main(String[] args) {
		long total = 0;

		int f = 1, f_1 = 1;

		while (f < 4000001) {
			if ((f + f_1) % 2 == 0) {
				total += (f + f_1);
			}
			
			

			f += f_1;
			
			
		}

		System.out.println(total);
	}

}
