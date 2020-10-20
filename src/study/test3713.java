package study;

import java.util.Scanner;

public class test3713 {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int arr[] = new int[n+1];
		
		
		for(int i=0; i<=n; i++) {
			if(i==0 || i==1) {
				arr[i]=1;
			}else {
				arr[i] = (arr[i-1] + arr[i-2] * 2)%100007;
			}
		}
		
		System.out.println(arr[n]);
	}

}
