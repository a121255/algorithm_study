package study;

import java.util.Scanner;

public class 애니팡 {
	static int cd[][] = new int[7][7];
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 7; j++) {
				cd[i][j] = sc.nextInt();
			}
		}
		
		int count = 0;
		int x=0;
		
		candy(0);

	}
	
	public static int candy(int i) {
		int cnt = 0;
		
		int j = i;
		if(i==0) {
			int n = 1;
			if(cd[i][j+n]==cd[i][j]) {
				cnt++;
				n++;
				if(cd[i][j+n]==cd[i][j]) {
					cnt++;
				}
			}
			
		}else {
			
		}
		
		
		
		return cnt;
	}

}
