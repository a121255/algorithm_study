package ndb.DAY1102;

import java.util.Scanner;

public class 미로 {

	static int n, m;
	static int map[][] = {
			{1, 0, 1, 0, 1, 0},	//동빈이는 1, 1에 위치
			{1, 1, 1, 1, 1, 1},
			{0, 0, 0, 0, 0, 1},
			{1, 1, 1, 1, 1, 1},
			{1, 1, 1, 1, 1, 1}				
		};
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		//탈출을 위해 움직여야 하는 최소 칸의 개수
		
		int result=0;
//		for (int i = 0; i < n; i++) {
//			for (int j = 0; j < m; j++) {
//				System.out.println(";;");
//				bfs(i, j);
//				
//			}
//		}
		bfs(0, 0);
		System.out.println(map[n-1][m-1]);
		
	}
	
	static void bfs(int x, int y) {
		if(x>=0 && y>=0 && x<n && y<m) return false;
		int[] dx = {-1, 0, 1, 0 }; //북, 동, 남, 서
		int[] dy = {0, 1, 0, -1};
		
		if(map[x][y]==1) {
			for (int i = 0; i < 4; i++) {
				if(map[x+dx[i]][y+dy[i]]==1) {
					map[x+dx[i]][y+dy[i]] = map[x][y]+1;
					bfs(x+dx[i],y+dy[i]);
				}
					
			}

		}
		
		
	}
	
	

}
