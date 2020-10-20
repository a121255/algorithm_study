package study;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class 배낭 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		int a[][] = new int[N][2];
		
		for (int i = 0; i < a.length; i++) {
			a[i][0] = sc.nextInt();
			a[i][1] = sc.nextInt();
		}
		
//		6 13
//		5 12
//		4  8 
//		2  6 
//		1  7
		Arrays.sort(a, new Comparator<int[]>() {
            public int compare(int[] arg0, int[] arg1) {
            	return arg0[0] - arg1[0];
            }
        });  //무게로 정렬
		
		int sum=0;
		int weight = 0;
		int total = 0;
		
		for (int i = 0; i < a.length; i++) {
			if(weight+a[i][0]>K) {
				continue;
			}else {
				weight += a[i][0];
				sum += a[i][1];
			}
			if(weight==7) {
				if(total<sum) {
					total = sum;
				}
			}
		}
		
		System.out.println(total);
		

	}

}
