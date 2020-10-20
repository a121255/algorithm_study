package study;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class 회의실 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[][] = new int[n][2];
	 
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < 2; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		
		Arrays.sort(a, new Comparator<int[]>() {
            public int compare(int[] arg0, int[] arg1) {
                if(arg0[1] == arg1[1]) {
                    return arg0[0] - arg1[0];
                } else {
                    return arg0[1] - arg1[1];
                }
            }
        });    
		
		int end = -1;	//4	7 11 14
	    int count = 0;	//4
	    
	    for(int i=0; i<n; i++) {
            if(a[i][0] >= end ) {
                end = a[i][1];
                count++;
            }
        }
        
        System.out.println(count);
		
	}
	
	
	
	

}
