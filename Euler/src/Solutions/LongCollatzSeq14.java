package Solutions;

public class LongCollatzSeq14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int val = 10;
		int iter = 0;
		int greatest = 0;
		int i;
		int saved = 0;

		for (; val < 1000000; val++) {
			System.out.println(val);
			for (; true;) {
				if (iter > 0) {
					i = saved;
				}
				else {
					i = val;
				}
				if (i % 2 == 0) {
					i /= 2;
					saved = i;
				} else {
					i *= 3;
					i += 1;
					saved = i;
				}

				if (i == 1) {
					iter++;
					if (iter > greatest) {
						greatest = val;
						break;
					}
				} else {
					iter++;
				}
			}
		}
		System.out.println(greatest);
	}

}
