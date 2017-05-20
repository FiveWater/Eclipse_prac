package PRAC_07;

import java.util.Scanner;

public class ReverseNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		String a1 = Integer.toString(a);
		String b1 = Integer.toString(b);
		
		char[] a2 = a1.toCharArray();
		char[] b2 = b1.toCharArray();
		
		String a3 = null;
		String b3 = null;
		char[] r_a2 = new char[a2.length];
		char[] r_b2 = new char[b2.length];
		
		for(int i=0; i<a2.length; i++){
			r_a2[i] = a2[a2.length-1-i];
			a3 += r_a2[i];
		}
		for(int i=0; i<b2.length; i++){
			r_b2[i] = b2[b2.length-1-i];
			b3 += r_b2[i];
		}
		a3 = a3.substring(4);
		b3 = b3.substring(4);
		
		int a4 = Integer.parseInt(a3);
		int b4 = Integer.parseInt(b3);
		
		if(a4 < b4)
			System.out.println(b4);
		else
			System.out.println(a4);
		
	}

}
