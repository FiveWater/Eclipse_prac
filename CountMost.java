package PRAC_07;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CountMost {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String line = sc.next();
		line = line.toLowerCase();
		char[] data = line.toCharArray();
		int[] count = new int[26];
		int[] count2 = new int[26];
		
		for(int i=0; i<line.length(); i++){
			count[(int)data[i]-97] += 1;
		}
		
		count2 = Arrays.copyOf(count, 26);
		Arrays.sort(count2);
		
		if(count2[25] == count2[24])
			System.out.println("?");
		else{
			for(int i=0; i<26; i++){
				if(count[i] == count2[25])
					System.out.println(Character.toString((char)(i+97)).toUpperCase());
			}
		}
		
	}

}
