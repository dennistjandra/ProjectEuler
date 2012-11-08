
public class Problem5 {

	public static void main (String [] args){
		boolean found = false;
		int smallest = 2520;
		while (found == false){
			if (evenlyDivides (smallest))
				break;
			else
				smallest++;
		}
		System.out.println(smallest);
	}
	
	public static boolean evenlyDivides(int n){
		for (int i = 1; i<=20;i++){
			if (n%i!=0)
				return false;
		}
		return true;
	}
}
