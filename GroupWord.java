package PRAC_07;

import java.util.Scanner;

public class GroupWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		
		for(int i=0; i<n; i++){
			String line = sc.next();
			char[] data = line.toCharArray();
			int local_count = 0;
			for(int j=0; j<data.length-2; j++){
				int[] sub = new int[data.length-1-j];
				int index = 0;
				for(int k=j+1; k<data.length; k++){
					
					if(Character.toString(data[j]).equals(Character.toString(data[k]))){
						sub[index] = 0;
						index++;
					}
					else{
						sub[index] = 1;
						index++;
					}
					
				}
				for(int p=0; p<index-1; p++){
					if(sub[p] - sub[p+1] == 1){
						local_count += 1;
					}
				}
			}
			if(local_count == 0)
				count ++;
		}
		System.out.println(count);
		
	}

}
