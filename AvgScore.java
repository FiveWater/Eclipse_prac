package PRAC_06;

import java.util.Scanner;

public class AvgScore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] score = new int[5];
		int sum = 0;
		
		for(int i=0; i<score.length; i++){
			score[i] = sc.nextInt();
		}
		
		for(int i=0; i<score.length; i++){
			if(score[i] < 40){
				score[i] = 40;
			}
			sum += score[i];
		}
		
		System.out.println(sum/5);
	}

}
