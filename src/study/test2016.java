package study;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class test2016 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());	//8   12,345,678
		String a = br.readLine();
		String aa[] = a.split("");
		int b = n%3; //B = 2 1
		
		for(int i=0; i<n; i++) { //0 1 2 3 4 5 6 7
			if(i%3==b && i > 0) {//1  4  7        12,345,678
				System.out.print(",");
				System.out.println("["+i+", " +i%3+"]");
			}
			System.out.print(aa[i]);
		}
	}
		

}

//8
//12421421