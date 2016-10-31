package Solutions;

import java.util.LinkedList;

public class LongCollatzSeq14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long greatest = 0;
		long longest = 0;
		LinkedList<Long> list = new LinkedList<Long>();

		for (long j = 10; j < 1000000; j++) {
			long i = j;
			while (i != 1) {
				if (i % 2 == 0) {
					i /= 2;
					list.add(i);
				}
				else {
					i = (3 * i) + 1;
					list.add(i);
				}
			}
			
			if (list.size() > longest) {
				greatest = j;
				longest = list.size();
			}
			
			list.clear();
		}
		System.out.println("Yielded a number " + greatest + " with a Collatz length of " + longest);
	}

}
