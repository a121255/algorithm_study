package ndb.sort;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class 두배열의원소교체 {

	public static void main(String[] args) {
		int k = 3;
		Integer a[] = {1, 2, 5, 4, 3};
		Integer b[] = {5, 5, 6, 6, 5};
		Arrays.sort(a);
		Arrays.sort(b, Collections.reverseOrder());

		//1 2 3 4 5
		//6 6 5 5 5
		
		for (int i = 0; i < k; i++) {
			if(a[i]<b[i]) { //a의 값이 더 클 경우에는 바꾸지 않음
				int tmp = a[i];
				a[i] = b[i];
				b[i] = tmp;
			}
		}
		
		int result = 0;
		for (int i = 0; i < a.length; i++) {
			result += a[i];
		}
		System.out.println(result);
		
	}

}
