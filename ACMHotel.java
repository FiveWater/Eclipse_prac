package PRAC_08;

import java.util.Scanner;

public class ACMHotel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int t=1; t<=T; t++){
			int H = sc.nextInt();
			int W = sc.nextInt();
			int N = sc.nextInt();
			
			if(H>=1 && H<=99 && W>=1 && W<=99 && N>=1 && N<=(H*W)){
				int[][] room = new int[H][W];
				int a = (N-1)/H+1;
				int b = (N-1)%H+1;

				String line = null;
				line += Integer.toString(b);
				if(a>=1 && a<=9){
					line += "0";
					line += Integer.toString(a);
				}
				else{
					line += Integer.toString(a);
				}
				int m = Integer.parseInt(line.substring(4));
				System.out.println(m);
			}
		}
		
	}

}
