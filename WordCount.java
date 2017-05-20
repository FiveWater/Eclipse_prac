package PRAC_06;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class WordCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		
		ArrayList array = new ArrayList<String>();
		StringTokenizer tokenizer = new StringTokenizer(line);
		
		while(tokenizer.hasMoreTokens()){
			array.add(tokenizer.nextToken());
		}
		System.out.println(array.size());
		
	}

}
