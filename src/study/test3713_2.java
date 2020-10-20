package study;

import java.util.Scanner;

public class test3713_2 {

	static int ar[] = new int[10001];
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		ar[0]= 1; ar[1] = 1;

		System.out.println(test(n));
	}
	
	static int test(int i) {
		if(ar[i] != 0) {
			return ar[i];
		}
		return ar[i] = (test(i-1) + test(i-2) * 2)%100007;
	}

}
