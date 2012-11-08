import java.math.BigInteger;


public class Problem16 {


	public static void main(String[] args) {
		BigInteger numb = BigInteger.ONE;
		for (int i =1; i<=1000; i++)
			numb = numb.multiply(new BigInteger("2"));
		String numbAsString = numb.toString();
		int sum = 0;
		for (int i =0; i<numbAsString.length();i++)
			sum+= Integer.parseInt(numbAsString.substring(i, i+1));
		System.out.println(sum);

	}

}
