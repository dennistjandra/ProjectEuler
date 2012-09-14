import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Scanner;


public class Problem22 {

	public static void main(String[] args) {
		File file = new File ("names.txt");
		Hashtable table = new Hashtable();
		table.put("A", new Integer(1));
		table.put("B", new Integer(2));
		table.put("C", new Integer(3));
		table.put("D", new Integer(4));
		table.put("E", new Integer(5));
		table.put("F", new Integer(6));
		table.put("G", new Integer(7));
		table.put("H", new Integer(8));
		table.put("I", new Integer(9));
		table.put("J", new Integer(10));
		table.put("K", new Integer(11));
		table.put("L", new Integer(12));
		table.put("M", new Integer(13));
		table.put("N", new Integer(14));
		table.put("O", new Integer(15));
		table.put("P", new Integer(16));
		table.put("Q", new Integer(17));
		table.put("R", new Integer(18));
		table.put("S", new Integer(19));
		table.put("T", new Integer(20));
		table.put("U", new Integer(21));
		table.put("V", new Integer(22));
		table.put("W", new Integer(23));
		table.put("X", new Integer(24));
		table.put("Y", new Integer(25));
		table.put("Z", new Integer(26));
		table.put("\"", new Integer(0));

		ArrayList<String> names = new ArrayList<String>();
		try {
			Scanner s= new Scanner (file);
			s.useDelimiter(",");
			while(s.hasNext())
				names.add(s.next());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		for (int i = 0; i<names.size()-1; i++){
			for (int k = 0; k<(names.size()-i-1); k++){
				if (names.get(k).compareTo(names.get(k+1))>0){
					String temp = names.set(k+1, names.get(k));
					names.set(k, temp);
				}
			}
		}
		Iterator<String> i = names.iterator();
		String name =null;
		int sum = 0;
		int counter = 1;
		int wordValue = 0;
		while(i.hasNext()){
			name = i.next();
			wordValue=0;
			for (int k = 0; k<name.length();k++){
				System.out.println(name.substring(k, k+1));
				wordValue+= (Integer)table.get(name.substring(k, k+1));
			}
			sum += wordValue*counter;
			counter ++;
		}
		System.out.println(sum);
	}
	


}
