package kakao;

import java.util.ArrayList;

public class 다트게임 {

	public static void main(String[] args) {
		String dart = "1D2S#10S";	//S1  D2  T3
		//문자열자르기
		String [] d = dart.split("");
		ArrayList<Integer> ar = new ArrayList<Integer>();
		for (int i = 0; i < d.length; i++) {
			//System.out.println("d[i] : " + d[i]);
			//문자열인지 숫자인지 두자리숫자인지 거리는 곳.
			//ar.size-1도 따로 변수 만들기
			
			if(Character.isDigit(d[i].charAt(0))==true) { //숫자면
				if(Character.isDigit(d[i+1].charAt(0))==true) {//두자리숫자면
					ar.add(Integer.parseInt(d[i]+d[i+1]));
					System.out.println(ar.get(ar.size()-1));
					i++;
				}
			}
			
			if(Character.isDigit(d[i].charAt(0))==true) { //숫자면
				ar.add(Integer.parseInt(d[i]));

				System.out.println(ar.get( ar.size()-1));
			}
			if(d[i].equals("S")) {
				int a = ar.get(ar.size()-1);	//마지막에 들어간 거 가져오기
				System.out.println("a : " + a);
				ar.remove(ar.size()-1);
				ar.add(a*1);
			}
			if(d[i].equals("D")) {
				int a = ar.get(ar.size()-1);
				ar.remove(ar.size()-1);
				ar.add(a*a);
			}
			if(d[i].equals("T")) {
				int a = ar.get(ar.size()-1);
				ar.remove(ar.size()-1);
				ar.add(a*a*a);
			}
			if(d[i].equals("#")) {
				//System.out.println(ar.size()+"//");
				int a = ar.get(ar.size()-1);
				ar.remove(ar.size()-1);
				ar.add(a*-1);
			}
			if(d[i].equals("*")) {
				//System.out.println(ar.size()+"//");
				if(ar.size()>1) {
					int a = ar.get(ar.size()-2);
					int b = ar.get(ar.size()-1);
					ar.remove(ar.size()-1);
					ar.remove(ar.size()-1);
					ar.add(a*2);
					ar.add(b*2);
				}else {
					int a = ar.get(ar.size()-1);
					ar.remove(ar.size()-1);
					ar.add(a*2);
				}
			}
			
		}
		//계산해서 한 수로 만들기
		int result = 0;
		for (int i = 0; i < ar.size()-1; i++) {
			System.out.println(ar.get(i));
			result += ar.get(i);
		}
		System.out.println(result);
	}

}
