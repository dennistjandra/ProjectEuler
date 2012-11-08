
public class Problem12 {

	public static void main (String[] args){
		int candidate =1;
		int maxDivisors = 1;
		int triangleC =0;
		while (maxDivisors<500){
			triangleC = 0;
			candidate++;
			for (int b=1; b<=candidate;b++)
				triangleC+=b;
			int tempmax = numbDivisors(triangleC);
			if (maxDivisors<tempmax)
				maxDivisors = tempmax;
			System.out.println(triangleC+" "+maxDivisors);
		}
		System.out.println(candidate);
	}
	public static int numbDivisors (int n){
		int counter =0;
		for (int a=1;a<=Math.sqrt(n);a++){
			if (n%a==0)
				counter+=2;
		}
		if(Math.sqrt(n)==Math.floor(Math.sqrt(n)))
			counter--;
		return counter;
	}
}
