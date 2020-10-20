package kakao;

public class 비밀지도 {

	static int str[][];
	static int count = 0;
	
	public static void main(String[] args) {
		int n = 5;
		int[] arr1 = {9, 20, 28, 18, 11};
		int[] arr2 = {30, 1, 21, 17, 28};
		str = new int[n][n];
		test(arr1,n);
		test(arr2,n);
		
		String answer[] = new String[n];
		for (int i = 0; i < arr2.length; i++) {
			String a = "";
			for (int j = 0; j < arr2.length; j++) {
				if(str[i][j]==1 ||str[i][j]==2) {
					a+="#";
				}else {
					a+=" ";
				}
			}
			answer[i] = a;
		}
	}
	
	static void test(int arr[], int n) {
		for (int i = 0; i < arr.length; i++) {
			String bin = Integer.toBinaryString(arr[i]);
			//arr1의 첫번째인 9를 2진수로 변경 --> 1001
			String s[] = bin.split("");
			//s[] = 1, 0, 0, 1
			int leng = s.length-1; //3
			
			int a = n-s.length;
			int b = 0;
			if(count==0) {
				for (int j = 0; j < arr.length; j++) {
					if(j<a) {
						str[i][j]=0;
					}else{
						str[i][j]=Integer.parseInt(s[b]);
						b++;
					}
				}
				count++;
			}else {
				for (int j = 0; j < arr.length; j++) {
					if(j<a) {
						str[i][j]+=0;
					}else{
						str[i][j]+=Integer.parseInt(s[b]);
						b++;
					}
				}
			}
		}
		
		
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr.length; j++) {
//				System.out.print(str[i][j]);
//			}
//		System.out.println();
//		}
		
		
//
//		if(s.length==n-1 && j==0) { //4==4
//			str[i][j] = 0;
//			break;
//		}
//		if(str[i][j]==0 || s[leng]=="1") {
//			str[i][j] = Integer.parseInt(s[leng]);
//		}
//		leng--;
	
	}

}