package PRAC_06;

import java.util.Scanner;

public class OXQuiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		int[] result = new int[test];
		
		for(int i=0; i<test; i++){
			String line = sc.next();
			char[] data = line.toCharArray();
			int sum = 0;
			int a = 0;
			
			for(int j=0; j<line.length(); j++){
				if(data[j] == 'O'){
					a += 1;
					sum += a;
				}
				else if(data[j] == 'X'){
					a = 0;
				}
			}
			result[i] = sum;
		}
		for(int i=0; i<test; i++){
			System.out.println(result[i]);
		}
		
	}

}
