import java.math.BigDecimal;

public class PowerDigitSum16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BigDecimal pow = new BigDecimal(Math.pow(2, 1000));
		
		System.out.println(pow);
		
		String str = pow.toPlainString();
		
		int count = 0;
		int total = 0;
		
		for (int val;count < 302;count++) {
			val = Integer.parseInt(str.substring(count, count+1));
			
			total += val;
		}
		System.out.println(total);
	}

}
