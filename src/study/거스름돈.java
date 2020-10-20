package study;

import java.util.Scanner;

public class 거스름돈 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		int money = sc.nextInt();
		int n = sc.nextInt();
		sc.nextLine();
		String a = sc.nextLine();
		String ar [] = a.split(" ");
		int coin[] = new int[n];
		
		for(int i=0; i<ar.length; i++) {
			coin[i] = Integer.parseInt(ar[i]);
		}
		
		int pivot = -1;
		for(int i=0; i<n; i++) {
			if(money>coin[i]) {
				pivot = i;
			}
		}
	
		int count = 0;
		
		while(money>0) {
			System.out.println("1바퀴 : " + coin[pivot]);
			count = count + money/coin[pivot];
			money = money%coin[pivot];
			pivot = pivot-1;
		}
		
		System.out.println(count);
	}

}
