package PRAC_06;

import java.util.ArrayList;
import java.util.Scanner;

public class NumberCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int res = a*b*c;
		String line = Integer.toString(res);
		char[] data = line.toCharArray();
		int[] num = new int[10];
		
		for(int i=0; i<line.length(); i++){
			if(data[i] == '0')
				num[0] += 1;
			else if(data[i] == '1')
				num[1]++;
			else if(data[i] == '2')
				num[2]++;
			else if(data[i] == '3')
				num[3]++;
			else if(data[i] == '4')
				num[4]++;
			else if(data[i] == '5')
				num[5]++;
			else if(data[i] == '6')
				num[6]++;
			else if(data[i] == '7')
				num[7]++;
			else if(data[i] == '8')
				num[8]++;
			else if(data[i] == '9')
				num[9]++;
		}
		for(int i=0; i<10; i++){
			System.out.println(num[i]);
		}
	}

}
