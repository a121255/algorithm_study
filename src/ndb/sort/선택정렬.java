package ndb.sort;

public class 선택정렬 {

	public static void main(String[] args) {
		int array[] = {7, 5, 9, 0, 3, 1, 6, 2, 4, 8};
		
		int tmp = 99;
		for (int i = 0; i < array.length; i++) {
			for (int j = i+1; j < array.length; j++) {
				if(array[i]>array[j]) {
					tmp = array[i];
					array[i] = array[j];
					array[j] = tmp;
				}
			}
			tmp = 99;
		}
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
		}

	}

}
