package study;

import java.util.Scanner;

public class test2628 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 String sa = sc.nextLine();
		 String sb = sc.nextLine();
		 
		 String asa [] = sa.split(" ");  //1 100
		 String asb [] = sb.split(" ");  //2 90
		 
		 int a = Integer.parseInt(asa[0]);
		 int b = Integer.parseInt(asa[1]);
		 int c = Integer.parseInt(asb[0]);
		 int d = Integer.parseInt(asb[1]);

		 if(a>b) {  //99 1 >>> 1 99
			 int temp = a;
			 a = b;
			 b = temp;
		 }
		 
		 if(c>d) { //60 72
			 int temp = c;
			 c = d;
			 d = temp;
		 }
		 
		 if((a<c && b>c)) {  //20<40  80>40
			 if(a<d && b<d) {  //20>80 80<40
				 System.out.println("cross");
			 }else {
				 System.out.println("not cross");
			 }
		 }else {
			 if(a<d && b>d) { //8<100
				 System.out.println("cross");
			 }else {
				 System.out.println("not cross");
			 }
		 }
		 
		
	}

}
