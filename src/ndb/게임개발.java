package ndb;

import java.util.Scanner;

public class 게임개발 {
	static Scanner sc = new Scanner(System.in);
	static int n = sc.nextInt(); //n - 맵의 세로 크기
	static int m = sc.nextInt(); //m - 맵의 가로 크기

	static int[][] map = new int[n][m];
	static int cnt = 1;
	static int total = 0;
	static int dir = 0;

	public static void main(String[] args) {
		int a = sc.nextInt(); //위에서부터 떨어진 칸의 개수
		int b = sc.nextInt(); //왼쪽으로부터 떨어진 칸의 개수
		int d = sc.nextInt(); //서있는 방향
		System.out.println("");
		System.out.println("map 입력 시작");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				int t = sc.nextInt();
				if(t==0) total++;
				map[i][j] = t;
			}
		}
		System.out.println("map 입력 끝");

		//...........//1, 1에 북쪽(0) 바라보고 있음
		// 1 1 1 1   //첫번째 0에서 시작
		// 1 0 0 1
		// 1 1 0 1
		// 1 1 1 1

		//0:북    1:동    2:남    3:서
		//y-1  x+1  y+1   x-1
		System.out.println("---start");
		game(a, b, d);
		System.out.println("cnt : " + cnt);
	}
	static void game(int a, int b, int d) {
		if(dir<4) {
			go(a, b, d);
		}else {
			back(a, b, d);
			dir=0;
		}
	}

	static void go(int a, int b, int d) {
		if(d==0) {
			if(map[a-1][b]==0) {
				map[a-1][b]=1;
			}else {
				d=3;
				dir++;
				game(a, b, d);
			}
		}
	}
	
	
	static void back(int a, int b, int d) {
		if(d==0 || map[a][b-1]==0) {
			b = b+1;
		}
	}
	
	
	
	
	
	
	
	
	static int direction(int a, int b, int d) {
		if(d==0) {
			if(map[a-1][b]==0) return 3;
			else return 0; 
		}
		else if(d==1){
			if(map[a][b-1]==0) return 0;
			else return 1;  
		}
		else if(d==2){
			if(map[a+1][b]==0) return 1;
			else return 2; 
		}
		else{
			if(map[a][b-1]==0) return 2;
			else return 3; 
		}
	}

}
