package Solutions;

public class LongCollatzSeq14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long val = 10;
		long iter = 0;
		long greatest = 0;
		long i;
		long saved = 0;
		long lastiter = 0;
		

		for (; val < 1000000; val++) {
			System.out.println(val);
			for (; true;) {
				if (iter != 0) {
					i = saved;
				} else {
					i = val;
				}
				// --------------------------------------
				if (i % 2 == 0) {
					i /= 2;
					saved = i;
				} else {
					i *= 3;
					i += 1;
					saved = i;
				}
				// --------------------------------------
				if (i == 1) {
					iter++;

					if (iter > lastiter) {
						greatest = val;
						break;
					}

				} else {
					iter++;
				}
			}
			lastiter = iter;
			iter = 0;
		}
		System.out.println(greatest);
	}

}
