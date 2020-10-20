package study;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 사투리 {

	static String [] an;
	static String [] as;
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String n = br.readLine();
		String s = br.readLine();
		
		an = n.split("");
		as = s.split("");
		
		int [] cnt = new int[an.length];
		
		for (int i = 0; i < an.length; i++) {
			System.out.println(test1(i));
		}
		
	}
	
	static int test1(int n) {
		int count = 0;
		for (int j = 0; j < as.length; j++) {
			if(an[n].equals(as[j])) {
				count++;
				if(j!=as.length-1)
				count += test2(n+1, j);
			}
		}
		return count;
	}
	
	static int test2(int n, int j) {
		int count = 0;
		for (int i = j; i < as.length; i++) {
			
				count++;
			
		}

		return count;
	}

}
