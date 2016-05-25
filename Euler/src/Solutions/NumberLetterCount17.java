package Solutions;

public class NumberLetterCount17 {

	public static void main(String[] args) {
		
		String total = "";

		for (int i = 1; i <= 5;i++) {
			String str = numberToString(i);
			total = total.concat(str);
		}

		System.out.println(total);
		System.out.println(total.length());
		
		total = numberToString(467);
		System.out.println(total);
	}

	public static String numberToString(int num) {
		String str = String.valueOf(num);

		String dig1 = str.substring(0, 1);
		String dig2 = null;
		String dig3 = null;

		if (str.length() == 2) {
			dig2 = str.substring(1, 2);
		}
		if (str.length() == 3) {
			dig2 = str.substring(1, 2);
			dig3 = str.substring(2);
		}
		if (str.length() == 4) {
			return "onethousand";
		}

		String b = "";

		String one = "one";
		String two = "two";
		String three = "three";
		String four = "four";
		String five = "five";
		String six = "six";
		String seven = "seven";
		String eight = "eight";
		String nine = "nine";

		String eleven = "eleven";
		String twelve = "twelve";
		String thirteen = "thirteen";
		String fourteen = "fourteen";
		String fifteen = "fifteen";
		String sixteen = "sixteen";
		String seventeen = "seventeen";
		String eighteen = "eighteen";
		String nineteen = "nineteen";

		String ten = "ten";
		String twenty = "twenty";
		String thirty = "thirty";
		String forty = "forty";
		String fifty = "fifty";
		String sixty = "sixty";
		String seventy = "seventy";
		String eighty = "eighty";
		String ninety = "ninety";

		String hun = "hundred";
		String and = "and";

		boolean teens = false;

		if (str.length() == 1) {
			switch (Integer.parseInt(str)) {
			case 0:
				return "0";
			case 1:
				b = b.concat(one);
				break;
			case 2:
				b = b.concat(two);
				break;
			case 3:
				b = b.concat(three);
				break;
			case 4:
				b = b.concat(four);
				break;
			case 5:
				b = b.concat(five);
				break;
			case 6:
				b = b.concat(six);
				break;
			case 7:
				b = b.concat(seven);
				break;
			case 8:
				b = b.concat(eight);
				break;
			case 9:
				b = b.concat(nine);
				break;
			}
			return b;
		}
		// DOUBLE DIGIT NUMBERS--------------------------------------
		else if (str.length() == 2) {
			switch (Integer.parseInt(dig1)) {
			case 1:
				if (dig2.equals("0")) {
					b = b.concat(ten);
				} else {
					switch (Integer.parseInt(dig2)) {
					case 1:
						b = b.concat(eleven);
						break;
					case 2:
						b = b.concat(twelve);
						break;
					case 3:
						b = b.concat(thirteen);
						break;
					case 4:
						b = b.concat(fourteen);
						break;
					case 5:
						b = b.concat(fifteen);
						break;
					case 6:
						b = b.concat(sixteen);
						break;
					case 7:
						b = b.concat(seventeen);
						break;
					case 8:
						b = b.concat(eighteen);
						break;
					case 9:
						b = b.concat(nineteen);
						break;
					}
					return b;
				}
				break;

			case 2:
				b = b.concat(twenty);
				break;
			case 3:
				b = b.concat(thirty);
				break;
			case 4:
				b = b.concat(forty);
				break;
			case 5:
				b = b.concat(fifty);
				break;
			case 6:
				b = b.concat(sixty);
				break;
			case 7:
				b = b.concat(seventy);
				break;
			case 8:
				b = b.concat(eighty);
				break;
			case 9:
				b = b.concat(ninety);
				break;
			}

			switch (Integer.parseInt(dig2)) {
			case 1:
				b = b.concat(one);
				break;
			case 2:
				b = b.concat(two);
				break;
			case 3:
				b = b.concat(three);
				break;
			case 4:
				b = b.concat(four);
				break;
			case 5:
				b = b.concat(five);
				break;
			case 6:
				b = b.concat(six);
				break;
			case 7:
				b = b.concat(seven);
				break;
			case 8:
				b = b.concat(eight);
				break;
			case 9:
				b = b.concat(nine);
				break;
			}
			return b;
		}
		// TRIPLE DIGIT NUMBERS-----------------------------
		else {
			switch (Integer.parseInt(dig1)) {
			case 1:
				b = b.concat(one + hun);
				break;
			case 2:
				b = b.concat(two + hun);
				break;
			case 3:
				b = b.concat(three + hun);
				break;
			case 4:
				b = b.concat(four + hun);
				break;
			case 5:
				b = b.concat(five + hun);
				break;
			case 6:
				b = b.concat(six + hun);
				break;
			case 7:
				b = b.concat(seven + hun);
				break;
			case 8:
				b = b.concat(eight + hun);
				break;
			case 9:
				b = b.concat(nine + hun);
				break;
			}
			switch (Integer.parseInt(dig2)) {
			case 0:
				switch (Integer.parseInt(dig3)) {
				case 0:
					break;
				case 1:
					b = b.concat(and + one);
					break;
				case 2:
					b = b.concat(and + two);
					break;
				case 3:
					b = b.concat(and + three);
					break;
				case 4:
					b = b.concat(and + four);
					break;
				case 5:
					b = b.concat(and + five);
					break;
				case 6:
					b = b.concat(and + six);
					break;
				case 7:
					b = b.concat(and + seven);
					break;
				case 8:
					b = b.concat(and + eight);
					break;
				case 9:
					b = b.concat(and + nine);
					break;
				}
				break;
			case 1:
				switch (Integer.parseInt(dig3)) {
				case 0:
					b = b.concat(and + ten);
					teens = true;
					break;
				case 1:
					b = b.concat(and + eleven);
					teens = true;
					break;
				case 2:
					b = b.concat(and + twelve);
					teens = true;
					break;
				case 3:
					b = b.concat(and + thirteen);
					teens = true;
					break;
				case 4:
					b = b.concat(and + fourteen);
					teens = true;
					break;
				case 5:
					b = b.concat(and + fifteen);
					teens = true;
					break;
				case 6:
					b = b.concat(and + sixteen);
					teens = true;
					break;
				case 7:
					b = b.concat(and + seventeen);
					teens = true;
					break;
				case 8:
					b = b.concat(and + eighteen);
					teens = true;
					break;
				case 9:
					b = b.concat(and + nineteen);
					teens = true;
					break;
				}
				break;
			case 2:
				b = b.concat(and + twenty);
				break;
			case 3:
				b = b.concat(and + thirty);
				break;
			case 4:
				b = b.concat(and + forty);
				break;
			case 5:
				b = b.concat(and + fifty);
				break;
			case 6:
				b = b.concat(and + sixty);
				break;
			case 7:
				b = b.concat(and + seventy);
				break;
			case 8:
				b = b.concat(and + eighty);
				break;
			case 9:
				b = b.concat(and + ninety);
				break;
			}
			if (teens == false) {
				switch (Integer.parseInt(dig3)) {
				case 1:
					b = b.concat(one);
					break;
				case 2:
					b = b.concat(two);
					break;
				case 3:
					b = b.concat(three);
					break;
				case 4:
					b = b.concat(four);
					break;
				case 5:
					b = b.concat(five);
					break;
				case 6:
					b = b.concat(six);
					break;
				case 7:
					b = b.concat(seven);
					break;
				case 8:
					b = b.concat(eight);
					break;
				case 9:
					b = b.concat(nine);
					break;
				}
			}
			return b;
		}
	}

}
