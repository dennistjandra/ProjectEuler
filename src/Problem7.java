public class Problem7 {

	public static void main (String[] args){
		int primes = 0;
		int candidate =1;
		while (primes!=10001){
			candidate++;
			if (checkPrime(candidate)){
				primes ++;
			}
		}
		System.out.println(candidate);
	}
	public static boolean checkPrime (long i){
		for (long k=2; k<i;k++){
			if (i%k==0)
				return false;
		}
		return true;
	}
}
