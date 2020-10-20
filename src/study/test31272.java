package study;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class test31272 {

	private static int top;
	private static int stackSize;
	private static  int stackArr[];
	
	static class stack{
		static int pop() {
			int a = stackArr[top];
			top--;
			return a; 
		}
		
	}
	

	
	public static void main(String[] args) throws Exception{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		String [] test = s.split(" ");
		
		
		for(int i=0; i<test.length; i++) {
			if(test[i].equals("+")) {
				int a = st.pop(1);
				int b = stackArr[top-1];
			}
		}

	}

}
