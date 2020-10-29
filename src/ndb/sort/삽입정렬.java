package ndb.sort;

public class 삽입정렬 {

	public static void main(String[] args) {
		int array[] = {7, 5, 9, 0, 3, 1, 6, 2, 4, 8};
		int tmp=99;
		for (int i = 1; i < array.length; i++) {
			for (int j = i; j >0; j--) {
				if(array[j]<array[j-1]) {
					tmp = array[j-1];
					array[j-1] = array[j];
					array[j]=tmp;
				}
			}
		}
		//--까지라는 건 생각햇는데 그 뒤를..
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

}
