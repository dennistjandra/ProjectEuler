
public class Problem14 {
	public static void main(String[] args){
		int max = 0;
		int maxGiver=0;
		long temp =0;
		int counter = 0;
		for (int i = 2; i <=1000000; i++){
			System.out.println(i);
			temp = i;
			counter=1;
			while (temp!=1){
				if (temp%2==0)
					temp /=2;
				else
					temp = 3*temp+1;
				counter++;
			}
			if (counter>max){
				maxGiver=i;
				max=counter;
			}
		}
		System.out.println(maxGiver);
	}
}
