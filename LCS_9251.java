package AMORFATI;

import java.util.Scanner;

public class LCS_9251 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String str1, str2;
		str1 = sc.nextLine();
		str2 = sc.nextLine();
		
		long[][] DP = new long[str1.length()+1][str2.length()+1];
		
		for(int i=1; i<=str1.length(); i++){
			for(int j=1; j<=str2.length(); j++){
				if(str1.charAt(i-1) == str2.charAt(j-1)){
					DP[i][j] = DP[i-1][j-1] + 1;
				}
				else{
					DP[i][j] = MAX(DP[i][j-1], DP[i-1][j]);
				}
			}
		}
		System.out.println(DP[str1.length()][str2.length()]);
		
	}

	private static long MAX(long dP, long dP2) {
		// TODO Auto-generated method stub
		if(dP > dP2)
			return dP;
		else
			return dP2;
	}

}
