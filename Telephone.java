package PRAC_07;

import java.util.Scanner;

public class Telephone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String line = sc.next();
		char[] data = line.toCharArray();
		int[] num = new int[data.length];
		if(line.length() >= 2 && line.length() <= 15){
		for(int i=0; i<data.length; i++){
			if((int)data[i] >= 65 && (int)data[i] <= 67)
				num[i] = 2;
			else if((int)data[i] >= 68 && (int)data[i] <= 70)
				num[i] = 3;
			else if((int)data[i] >= 71 && (int)data[i] <= 73)
				num[i] = 4;
			else if((int)data[i] >= 74 && (int)data[i] <= 76)
				num[i] = 5;
			else if((int)data[i] >= 77 && (int)data[i] <= 79)
				num[i] = 6;
			else if((int)data[i] >= 80 && (int)data[i] <= 83)
				num[i] = 7;
			else if((int)data[i] >= 84 && (int)data[i] <= 86)
				num[i] = 8;
			else if((int)data[i] >= 87 && (int)data[i] <= 90)
				num[i] = 9;
		}
		}
		for(int i=0; i<num.length; i++){
			num[i] += 1;
		}
		int sum = 0;
		for(int i=0; i<num.length; i++){
			sum += num[i];
		}
		System.out.println(sum);
	}

}
