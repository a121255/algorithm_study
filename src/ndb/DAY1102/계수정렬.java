package ndb.DAY1102;

public class 계수정렬 {

	public static void main(String[] args) {
		int arr[] = {7, 5, 9, 0, 3, 1, 6, 2, 9, 1, 4, 8, 0, 5, 2};
		
		int tmp = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>tmp) {
				tmp = arr[i];
			}
		}
		
		int [] a = new int[tmp+1];
		
		for (int i = 0; i < arr.length; i++) {
			a[arr[i]]++;
		}

	
		for (int i = 0; i < a.length; i++) {
//			for (int j = 0; j < a[i]; j++) {
//				System.out.print(a[j]);
//			}
			for (int j = 0; j < a[i]; j++) {
				System.out.print(i);
			}
		}
	}

}
