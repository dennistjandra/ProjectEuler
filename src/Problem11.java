import java.util.Scanner;


public class Problem11 {
	static int [][]d;
	public static void main (String[] args){
		String[] rawData = new String [20];
		rawData[0]= "08 02 22 97 38 15 00 40 00 75 04 05 07 78 52 12 50 77 91 08";
		rawData[1]= "49 49 99 40 17 81 18 57 60 87 17 40 98 43 69 48 04 56 62 00";
		rawData[2]= "81 49 31 73 55 79 14 29 93 71 40 67 53 88 30 03 49 13 36 65";
		rawData[3]= "52 70 95 23 04 60 11 42 69 24 68 56 01 32 56 71 37 02 36 91";
		rawData[4]= "22 31 16 71 51 67 63 89 41 92 36 54 22 40 40 28 66 33 13 80";
		rawData[5]= "24 47 32 60 99 03 45 02 44 75 33 53 78 36 84 20 35 17 12 50";
		rawData[6]= "32 98 81 28 64 23 67 10 26 38 40 67 59 54 70 66 18 38 64 70";
		rawData[7]= "67 26 20 68 02 62 12 20 95 63 94 39 63 08 40 91 66 49 94 21";
		rawData[8]= "24 55 58 05 66 73 99 26 97 17 78 78 96 83 14 88 34 89 63 72";
		rawData[9]= "21 36 23 09 75 00 76 44 20 45 35 14 00 61 33 97 34 31 33 95";
		rawData[10]= "78 17 53 28 22 75 31 67 15 94 03 80 04 62 16 14 09 53 56 92";
		rawData[11]= "16 39 05 42 96 35 31 47 55 58 88 24 00 17 54 24 36 29 85 57";
		rawData[12]= "86 56 00 48 35 71 89 07 05 44 44 37 44 60 21 58 51 54 17 58";
		rawData[13]= "19 80 81 68 05 94 47 69 28 73 92 13 86 52 17 77 04 89 55 40";
		rawData[14]= "04 52 08 83 97 35 99 16 07 97 57 32 16 26 26 79 33 27 98 66";
		rawData[15]= "88 36 68 87 57 62 20 72 03 46 33 67 46 55 12 32 63 93 53 69";
		rawData[16]= "04 42 16 73 38 25 39 11 24 94 72 18 08 46 29 32 40 62 76 36";
		rawData[17]= "20 69 36 41 72 30 23 88 34 62 99 69 82 67 59 85 74 04 36 16";
		rawData[18]= "20 73 35 29 78 31 90 01 74 31 49 71 48 86 81 16 23 57 05 54";
		rawData[19]= "01 70 54 71 83 51 54 69 16 92 33 48 61 43 52 01 89 19 67 48";
		//convert raw data to 2d int array;
		d = new int[20][20];
		for (int i=0; i<20;i++)	{
			Scanner s = new Scanner (rawData[i]);
			s.useDelimiter(" ");
			for (int k =0; k<20;k++){
				d[i][k]=s.nextInt();
			}

		}
		//check all prods for all cells
		int prod =0;
		for (int i =0; i<20; i++){
			for(int k=0; k<20; k++){
				if (maxProd(i,k)>prod)
					prod= maxProd(i,k);
			}
		}
		System.out.println(prod);
	}
	
	public static int maxProd (int i, int k){
		int prod = 0;
		if (prodLeft(i,k)>prod)
			prod=prodLeft(i,k);
		if (prodRight(i,k)>prod)
			prod=prodRight(i,k);
		if (prodDown(i,k)>prod)
			prod=prodDown(i,k);
		if (prodUp(i,k)>prod)
			prod=prodUp(i,k);
		if (prodDiagRight(i,k)>prod)
			prod=prodDiagRight(i,k);
		if (prodDiagLeft(i,k)>prod)
			prod=prodDiagLeft(i,k);
		return prod;
	}
	public static int prodLeft(int i,int k){
		int prod =1;
		if (k>2){
			for (int a=0;a<4; a++){
				prod*=d[i][k-a];
			}
			return prod;
		}
		else return 0;
	}
	public static int prodRight(int i,int k){
		int prod =1;
		if (k<17){
			for (int a=0;a<4; a++){
				prod*=d[i][k+a];
			}
			return prod;
		}
		else return 0;
	}
	public static int prodUp(int i,int k){
		int prod =1;
		if (i>2){
			for (int a=0;a<4; a++){
				prod*=d[i-a][k];
			}
			return prod;
		}
		else return 0;
	}
	public static int prodDown(int i,int k){
		int prod =1;
		if (i<17){
			for (int a=0;a<4; a++){
				prod*=d[i+a][k];
			}
			return prod;
		}
		else return 0;
	} 	
	public static int prodDiagRight(int i,int k){
		int prod =1;
		if (i<17&&k<17){
			for (int a=0;a<4; a++){
				prod*=d[i+a][k+a];
			}
			return prod;
		}
		else return 0;
	}
	public static int prodDiagLeft(int i,int k){
		int prod =1;
		if (i<17&&k>2){
			for (int a=0;a<4; a++){
				prod*=d[i+a][k-a];
			}
			return prod;
		}
		else return 0;
	}
}
