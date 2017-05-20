package PRAC_08;

import java.util.Scanner;

public class FindingRule {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[][] people = new int[15][15];
		int T = sc.nextInt();
		
		for(int i=1; i<=14; i++){
			people[0][i] = i;
		}
		
		for(int i=1; i<=14; i++){
			for(int j=1; j<=14; j++){
				people[i][j] = 0;
				for(int k=1; k<=j; k++){
					people[i][j] += people[i-1][k];
				}
			}
		}
		
		for(int t=1; t<=T; t++){
			int k = sc.nextInt();
			int n = sc.nextInt();
			
			System.out.println(people[k][n]);
		}
		
	}

}
