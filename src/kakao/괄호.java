package kakao;

public class 괄호 {

	public static void main(String[] args) {
		String p = "()))((()";
		String [] list = p.split("");

	}
	
	
	static boolean bal(String [] list) { // ** 균형잡힌문자열인지 확인
		int cnt = 0;
		for (int i = 0; i < list.length; i++) {
			if(list[i].equals("(")) {
				cnt++;
			}else {
				cnt--;
			}
		}
		return cnt == 0;
	}
	
	static void right(String [] list) {	// ** 올바른문자열인지 확인 -- 열렸으면 닫혀야됨
		int cnt = 0; 
		
	}
	
	static void div() {	// ** 문자열 나누기
		
	}

}
