import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;


public class Problem13 {
	public static void main(String[] args){
		Scanner s = null;
		File numberFile = new File ("Problem13Numbers.txt");
		try {
			s = new Scanner (numberFile);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		BigInteger sum = BigInteger.ZERO;
		String next = "";
		while (s.hasNext()){
			next = s.next();
			sum= sum.add(new BigInteger(next));
		}
		System.out.println(sum);
	}
}
