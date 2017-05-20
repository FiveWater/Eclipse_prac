package PRAC_07;

import java.util.Scanner;

public class Croatia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String line = sc.next();
		
		System.out.println(line.replaceAll("c=|c-|dz=|d-|lj|nj|s=|z=","1").length());
	}

}
