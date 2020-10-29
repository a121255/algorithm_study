package ndb.dfsbfs;

import java.util.Scanner;

public class 음료수얼려먹기_2 {
	static int n,m;
	static int map[][];
	static int result;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		map = new int[n][m];
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				map[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if(game(i, j)) result++;
				
			}
		}
		System.out.println(result);
	}
	
	static boolean game(int x, int y) {
		if(x<0 || y<0 || x>=n || y>=m) return false;
		if(map[x][y]==0) {
			map[x][y]++;
			game(x-1, y);
			game(x+1, y);
			game(x, y-1);
			game(x, y+1);
			return true;
		}
		return false;
	}

}
