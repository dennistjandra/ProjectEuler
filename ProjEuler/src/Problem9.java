
public class Problem9 {

	public static void main (String[] args){
		boolean found = false;
		int a =1, b=1, c=1;
		outter:
		for (a=1; a<1000; a++){
			for (b=1; b<1000; b++){
				c=1000-a-b;
				if (isPyth(a,b,c)){
					break outter;
				}
				else
					System.out.println(a+" "+b+" "+c+" not pyth");
			}
		}
		System.out.println(a+" "+b+" "+c);
		System.out.println(a*b*c);

	}
	
	public static boolean isPyth(int a, int b, int c){
		double cs = Math.pow((Math.pow(a, 2)+Math.pow(b, 2)),.5);
		if (Math.floor(cs)==cs &&cs==c)
			return true;
		else
			return false;
			
	}

}
