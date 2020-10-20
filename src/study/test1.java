package study;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.IntStream;

public class test1 {
	
	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		    int t=0;
		    while(t==0){
		        int n = sc.nextInt();
		        if(n>=1 && n<=100){
		            int m[][] = new int[n][2];
		            boolean check = false;
		            
		            for(int i=0; i<n; i++){
		                int as = sc.nextInt();
	                    m[i][0] = as;
	                    int bs = sc.nextInt();
	                    m[i][1] = bs;
		              
		            }
		            
		            Arrays.sort(m, new Comparator<int[]>(){
		                public int compare(int [] t1, int[] t2){
		                    return t1[0] - t2[0];
		                }
		            });
		            
		            for(int j=0; j<m.length; j++){
		                System.out.println(m[j][0] + " " + m[j][1]);
		            }
		            
		            t=1;
		        }
		    }
		


		
	}
}
