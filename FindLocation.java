package PRAC_07;

import java.util.Scanner;

public class FindLocation {
//97~122 a~z
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String line = sc.next();
		char[] data = line.toCharArray();
		int[] result = new int[26];
		
		for(int i=0; i<26; i++){
			for(int j=0; j<data.length; j++){
				int a = 0;
				a = data[j];
				a = a-97;
				
				if(a == i){
					result[i] = j;
					break;
				}
				if(result[i] == 0 && data[j] != 'b')
					result[i] = -1;
			}
		}
		for(int i=0; i<26; i++){
			System.out.print(result[i]+" ");
		}
		
	}

}
