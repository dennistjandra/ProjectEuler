
public class Problem4 {

	public static void main (String[] args){
		int prod =0;
		String sprod = "";
		int largestP=0;
		for (int i =999; i>99; i--){
			for (int k = 999; k>99; k--){
				prod = i*k;
				sprod = ""+prod;
				if (isPalindrome (sprod)){
					if (prod>largestP)
						largestP=prod;
				}

			}
		}
		System.out.println(largestP);
	}

	public static boolean isPalindrome (String s){
		for (int a = 0; a<s.length()/2;a++){
			if (s.charAt(a)==s.charAt(s.length()-1-a))
			{}
			else
				return false;
		}
		return true;
	}
}