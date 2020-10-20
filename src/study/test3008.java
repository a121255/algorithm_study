package study;

import java.util.Arrays;
import java.util.Scanner;

public class test3008 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[9];
		
		int sum = 0;
		
		for(int i=0; i<9; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		//합이 백이 되면 출력 중단
		for(int i=0; i<9; i++) {
			sum += arr[i];
			System.out.println(arr[i]);
			if(sum>=100) {
				break;
			}
		}
	}

}
