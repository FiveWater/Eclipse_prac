package PRAC_06;

import java.util.ArrayList;
import java.util.Scanner;

public class OX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		ArrayList array = new ArrayList<Integer>();
		
		for(int i=1; i<=testcase; i++){
			String line = sc.next();
			char[] data = line.toCharArray();
			int sum = 0;
			int a = 2;
			int j = 0;
			
			whileLoop : 
			while(true){
				if(data[j] == 'O'){
					sum += 1;
					j++;
					
					whileLoop2 :
					while(true){
						if(data[j] == 'O'){
							sum = sum + a;
							a++;
							j++;
						}
						else if(data[j] == 'X'){
							break whileLoop2;
						}
						if(j == line.length())
							break whileLoop;
					}
				}
				else if(data[j] == 'X'){
					sum += 0;
					a = 2;
					j++;
				}
				if(j == line.length())
					break whileLoop;
			}
			array.add(sum);	
		
		}
		
		for(int i=0; i<testcase; i++){
			System.out.println(array.get(i));
		}
	}

}
