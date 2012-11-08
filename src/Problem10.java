
public class Problem10 {

	public static void main (String [] args){
		long sum =0;
		for (int i =2; i<2000000; i++){
			System.out.println (i);
			if (checkPrime(i))
				sum+=i;
		}
		System.out.println(sum);
	}
	public static boolean checkPrime (long i){
		for (long k=2; k<i;k++){
			if (i%k==0)
				return false;
		}
		return true;
	}
}
