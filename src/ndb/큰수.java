package ndb;

import java.util.Arrays;
import java.util.Scanner;

public class 큰수 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();	//배열의 크기
		int m = sc.nextInt();	//몇 번 더할지
		int k = sc.nextInt();	//최대 반복수
		
		int list[] = new int[n];
		for (int i = 0; i < list.length; i++) {
			list[i] = sc.nextInt();
		}
		
		int total = 0;
		int cnt = 0;
		Arrays.sort(list);
		for (int i = 0; i < m; i++) {
			if(cnt<k) {
			total += list[list.length-1];
			cnt++;
			}else {
				total += list[list.length-2];
				cnt = 0;
			}
		}
		
		System.out.println("답 : " + total);
		

	}

}
