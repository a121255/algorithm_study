package ndb.sort;

import java.util.Arrays;
import java.util.Collections;

public class 위에서아래로 {

	public static void main(String[] args) {
		Integer arr[] = {15, 27, 12};
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = i+1; j < arr.length; j++) {
//				if(arr[i]<arr[j]) {
//					int tmp = arr[i];
//					arr[i]=arr[j];
//					arr[j]=tmp;
//				}
//			}
//		}

		Arrays.sort(arr, Collections.reverseOrder());
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
