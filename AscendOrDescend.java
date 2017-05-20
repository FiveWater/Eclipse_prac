package PRAC_06;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class AscendOrDescend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		ArrayList array = new ArrayList<Integer>();
		StringTokenizer tokenizer = new StringTokenizer(line);
		int i = 0;
		int as = 0;
		int des = 0;
		
		while(tokenizer.hasMoreTokens()){
			array.add(tokenizer.nextToken());
			i++;
		}
		
		for(int j=0; j<7; j++){
			if(Integer.parseInt((String) array.get(j+1)) - Integer.parseInt((String) array.get(j)) == 1){
				as++;
			}
		}
		for(int j=0; j<7; j++){
			if(Integer.parseInt((String)array.get(j))- Integer.parseInt((String)array.get(j+1)) == 1){
				des++;
			}
		}
		if(as == 7)
			System.out.println("ascending");
		else if(des == 7)
			System.out.println("descending");
		else
			System.out.println("mixed");
		
	}

}
