package study;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class test3127 {

    private static int top;
    
	static class Stack {
        private int stackSize;
        private int stackArr[];

        public Stack(int stackSize) {
            top = -1;
            stackArr = new int[stackSize];
            this.stackSize = stackSize;
        }

        public void push(int data) {
            stackArr[++top] = data;
        }

        public int pop(){
            if (top == -1) {
                throw new ArrayIndexOutOfBoundsException();
            }
            return stackArr[top--];
        }

        public int peek() {
            if (top == -1) {
                throw new ArrayIndexOutOfBoundsException();
            }
            return stackArr[top];
        }

        public void printStack() {
            System.out.println("stack list");
            for (int i = top; i >= 0; --i) {
                System.out.println(stackArr[i]);
            }
        }

    }

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		String [] test = s.split(" ");
		
		Stack st = new Stack(200);
		
		for(int i=0; i<test.length; i++) {
			if(test[i].equals("+")) {
				int a = st.pop();
				int b = st.pop();
				st.push(a+b);
			}
			
			else if(test[i].equals("*")) {
				int a = st.pop();
				int b = st.pop();
				st.push(a*b);
			}
			
			else if(test[i].equals("-")) {
				int a = st.pop();
				int b = st.pop();
				st.push(a-b);
			}else {
			
			st.push(Integer.parseInt(test[i]));
			}
		}
		
		System.out.println(st.pop());
		
		Stack<String> st = new Stack(top);

	}
	
	


}
