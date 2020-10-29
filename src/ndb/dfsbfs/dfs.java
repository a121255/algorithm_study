package ndb.dfsbfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class dfs {
	static List<List<Integer>> list = new ArrayList<>();
	static Queue<Integer> q = new LinkedList<>();
	static boolean [] visited;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int v = sc.nextInt();
		
		visited = new boolean[n+1];
		
		for (int i = 0; i <= n; i++) {
			list.add(new ArrayList<Integer>());
		}
		
		for (int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			list.get(a).add(b);
			list.get(b).add(a);
		}
		
//		for (int i = 1; i <= n; i++) {
//				System.out.print(list.get(i));
//
//		}
	
		dfs(v);
		visited = new boolean[n+1];
		System.out.println();
		bfs(v);
	}
	
	static void dfs(int v) {
		if(visited[v]==false) {
			System.out.print(v);
			visited[v]=true;
			List<Integer> m = list.get(v);
			
			for (int i = 0; i < m.size(); i++) {
				if(visited[m.get(i)]==false) {
					dfs(m.get(i));
				}
			}
		}
	}

	static void bfs(int v) {
		q.add(v);
		visited[v]=true;	

		while(!q.isEmpty()) {
			int x = q.poll();
			System.out.println(x);
			for (int i = 0; i < list.get(x).size(); i++) {
				int y = list.get(x).get(i);
				if(!visited[y]) {
					q.add(y);
					visited[y]=true;
				}
			}
		}
	}

}
