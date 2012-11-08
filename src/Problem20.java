import java.math.BigInteger;


public class Problem20 {

	public static void main(String[] args) {
		BigInteger factorial = BigInteger.ONE;
		for (int i = 2; i<=100; i++){
			factorial = factorial.multiply(new BigInteger(((Integer)i).toString()));
			System.out.println(((Integer)i).toString());
		}
		System.out.println(factorial);
		String facAsNum = factorial.toString();
		int sum = 0;
		for (int i = 0; i<facAsNum.length();i++)
			sum += Integer.parseInt(facAsNum.substring(i, i+1));
		System.out.println(sum);
	}

}
