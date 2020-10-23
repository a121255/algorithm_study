package ndb.dfsbfs;

import java.util.Scanner;

public class 음료수얼려먹기 {

	static int n, m;
	static int graph[][] = new int[10001][10001];
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				graph[i][j] = sc.nextInt();
			}
		}
		
		int result = 0;
		for (int i = 0; i <n; i++) {
			for (int j = 0; j < m; j++) {
				if(dfs(i,j)) {
					result += 1;
				}
			}
		}
		
		System.out.println(result);
	}

	static boolean dfs(int x, int y) {
		if(x<=-1 || x>=n || y<=-1 || y>=m) return false;
		if(graph[x][y]==0) {
			graph[x][y]=1;
			dfs(x-1,y);
			dfs(x+1,y);
			dfs(x,y-1);
			dfs(x,y+1);
			return true;
		}
		return false;
	}
}


