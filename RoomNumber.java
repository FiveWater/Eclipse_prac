package PRAC_08;

import java.util.Scanner;

public class RoomNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String line = Integer.toString(N);
		
		int[] array = new int[10];
	
		line = line.replace('9', '6');
		char[] data = line.toCharArray();
		for(int i=0; i<line.length(); i++){
			array[Integer.parseInt(Character.toString(data[i]))] += 1;		
		}
		array[6] = array[6]/2 + array[6]%2;
		int max = 0;
		for(int i=0; i<9; i++){
			if(max < array[i])
				max = array[i];
		}
		System.out.println(max);
	}

}
