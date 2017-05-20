package PRAC_07;

import java.util.Scanner;

public class CharIteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		String[] result = new String[test];
		
		for(int i=0; i<test; i++){
			int r = sc.nextInt();
			String line = sc.next();
			char[] data = line.toCharArray();
			
			for(int k=0; k<data.length; k++){
				for(int j=0; j<r; j++){
					result[i] += data[k];
				}
			}
			result[i] = result[i].substring(4);
		}
		for(int i=0; i<test; i++){
			System.out.println(result[i]);
		}
		
	}

}
