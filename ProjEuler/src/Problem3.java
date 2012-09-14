
public class Problem3 {

	public static void main (String[] args){
		 long numb = (long) 600851475143.0  ;
		 long i =0;
		 boolean flag = false;
		 System.out.println(checkPrime(5));
		 for (i = 13195; i>1; i--){
			 if (checkPrime (i)&& numb%i==0){
				 flag = true;
				 break;
			 }
			 else
				 System.out.println(i+" is not prime");
		 }
		 if (flag ==true){
			 System.out.println(i);
		 }
		 else
			 System.out.println(1);
		 
	}
	
	public static boolean checkPrime (long i){
		for (long k=2; k<i;k++){
			if (i%k==0)
				return false;
		}
		return true;
	}
}
