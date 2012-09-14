import java.math.BigInteger;


public class Problem25 {


	public static void main(String[] args) {
		BigInteger fib=BigInteger.ONE;
		BigInteger fibb= BigInteger.ONE;
		int counter = 2;
		while((fib.toString().length()<1000)&&(fibb.toString().length()<1000)){
			fib =fib.add(fibb);
			//swap so that loop is still correct
			BigInteger temp = fib;
			fib = fibb;
			fibb = temp;
			counter ++;
		}
		System.out.println(counter);
	}

}
