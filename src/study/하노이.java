package study;

import java.util.ArrayList;
import java.util.Scanner;

public class 하노이 {
	
	static ArrayList<Integer> x = new ArrayList<>();
	static ArrayList<Integer> y = new ArrayList<>();
	static ArrayList<Integer> z = new ArrayList<>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=n; i>=1; i--) {
			x.add(i);
		}
		
		int k = 0;
		int cnt = 0;
		
		hanoi();
		while(k==0) {
			if(!x.isEmpty()) { //A가 비어있지 않다면 B로 옮겨라
				y.add(x.get(x.size()-1));
				System.out.println(x.get(x.size()-1)+" : A->B");
				x.remove(x.size()-1);
				cnt++;
			}
			
			if(!y.isEmpty()) {
				z.add(y.get(y.size()-1));
				System.out.println(y.get(y.size()-1)+" : B->C");
				y.remove(y.size()-1);
				cnt++;
			}
			
			
		}

		System.out.println("cnt : " + cnt);
	}
	
	public static int hanoi() {
		
		
		
		return 0;
	}

}
