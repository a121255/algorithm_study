package baek;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class 바이러스 {
    static ArrayList<Integer>[] list;
    static int n;
    static boolean[] check;
    static int count;
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int m = sc.nextInt();
		
		list = new ArrayList[n + 1];

		for (int i = 1; i < n + 1; i++) {
            list[i] = new ArrayList<Integer>();
        }
 
        for (int i = 0; i < m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
 
            list[u].add(v);
            list[v].add(u);
        }
        
        for (int i = 1; i < n + 1; i++) {
            Collections.sort(list[i]);
        }
        check = new boolean[n + 1];
        
        
	}
	
	   private static void dfs(int x) {
	        if (check[x]) {
	            return;
	        }
	 
	        check[x] = true;
	        System.out.print(x + " ");
	        for (int y : list[x]) {
	            if (!check[y])
	            	count++;
	                dfs(y);
	        }
	 
	    }

}
