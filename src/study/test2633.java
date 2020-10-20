package study;

import java.util.Scanner;

public class test2633 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int n = sc.nextInt();
		 int k = sc.nextInt();
		 sc.nextLine();
		 String a = sc.nextLine();
		 String arr [] = a.split(" ");

		 
		 //5 7
		 //1 3 5 77
		 int count = 0;
		 for(int i=0; i<n; i++) {
			 
			 if(Integer.parseInt(arr[i])>=k) {
				 System.out.println(i+1);
				 count++;
				 break;
			 }
		 }
		 if(count==0) {
			 System.out.println(n+1);
		 }
	}

}
