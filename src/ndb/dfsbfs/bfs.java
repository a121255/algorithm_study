package ndb.dfsbfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class bfs {
	
	static List<List<Integer>> list = new ArrayList<>();
	static boolean [] visited;

	static Queue<Integer> q = new LinkedList<>();
	
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
		bfs(v);

	}

	static void bfs(int v) {
		q.add(v);
		visited[v] = true;
		
		while(!q.isEmpty()) {
			int a = q.poll();
			System.out.println(a);
			for (int i = 0; i < list.get(a).size(); i++) {
				int b = list.get(a).get(i);
				if(!visited[b]) {
				q.add(b);
				visited[b]=true;
				}
			}
		}
	}
}
