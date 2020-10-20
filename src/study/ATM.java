package study;

import java.util.Arrays;
import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		
		Arrays.sort(a);
		
		int cnt = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j <= i; j++) {
				cnt += a[j];
			}
		}
		
//		for (int i = 0; i < a.length; i++) {
//			cnt = a[i]*(n-i);
//		}
		System.out.println(cnt);

	}

}
