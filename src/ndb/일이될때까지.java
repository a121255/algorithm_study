package ndb;

import java.util.Scanner;

public class 일이될때까지 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //25
		int k = sc.nextInt(); //5
		int cnt = 0;
		while(n>1) {
			if(n%k==0) {
				n = n/k;
				cnt++;
			}else {
				n = n-1;
				cnt++;
			}
		}
		System.out.println(cnt);
		

	}

}
