package ndb;

import java.util.Scanner;

public class 왕실의나이트 {
	static int cnt = 8;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int a = (str.substring(0,1)).charAt(0)-96;
		int b = Integer.parseInt(str.substring(1,2));

		int i=0; int j=0;
		i=a+2; j=b+1;
		re(i,j);

		i=a+2; j=b-1;
		re(i,j);
		
		i=a-2; j=b+1;
		re(i,j);
		
		i=a-2; j=b-1;
		re(i,j);
		
		
		i=a+1; j=b+2;
		re(i,j);
		
		i=a-1; j=b+2;
		re(i,j);
		
		i=a+1; j=b-2;
		re(i,j);
		
		i=a-1; j=b-2;
		re(i,j);
		
		System.out.println(cnt);
		
	}
	
	private static void re(int i, int j) {
		if(i<1||i>8||j<1||j>8) {
			cnt--;
		}
	}

}
