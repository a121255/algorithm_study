package study;

import java.util.Scanner;

public class test2631 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int n = sc.nextInt(); //5   7
		 System.out.println(n);
		 int k = sc.nextInt(); //15  27 
		 System.out.println(k);
		 sc.nextLine();
		 String a = sc.nextLine();	//6 9 12 15 18 21 24
		 String arr [] = a.split(" ");
		 int t [] = new int[n];
		 
		 //1~5범위에서 서로를 더햇을 때 15가 나올 때으,ㅣ 경우의 수
		 
		 int count = 0;
		 for(int i=0; i<n; i++) {
			 int sum = 0;
			 for(int j=i; j<n; j++) {

				 sum = sum + Integer.parseInt(arr[j]);
				 if(sum==k) {
					 count++;
				 }
				 
			 }
			 sum = 0;
		 }
		 
		 System.out.println(count);
		 

	}

}
