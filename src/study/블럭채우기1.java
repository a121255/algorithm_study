package study;

import java.util.Scanner;

public class 블럭채우기1 {

	static int arr[] = new int[10001];
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(block(n));

	}
	
	public static int block(int n) {
		if(n==1) {
			return arr[n] = 1;
		} else if(n==2) {
			return arr[n] = 2;
		} else {
			return arr[n] = (block(n-2)+block(n-1))%10000007;
		}
	}

}
