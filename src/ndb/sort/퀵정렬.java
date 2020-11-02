package ndb.sort;

public class 퀵정렬 {

	static int arr[]= {5, 7, 9, 0, 3, 1, 6, 2, 4, 8};

	public static void main(String[] args) {
		quick(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
	}
	
	static void quick(int[] arr) {
		int pivot = arr[0];
		int tmp=0;
		int tmp2=0;
		for (int i = 1; i < arr.length; i++) {
			if(pivot<arr[i]) {
				tmp = i;
				break;
			}
		}
		for (int i = arr.length-1; i > 0; i--) {
			if(pivot>arr[i]) {
				tmp2 = arr[i];
				break;
			}
		}
	
		if(tmp>tmp2) {
			int t = arr[0];
			arr[0] = arr[tmp];
			arr[tmp] = t;
			int ar[] = new int[arr.length-tmp];
			for (int i = 0; i < ar.length; i++) {
				ar[i] = arr[i];
			}
			quick(ar);
			int a[] = new int[arr.length-tmp-1];
			for (int i = 0; i < a.length; i++) {
				a[i] = arr[i+tmp+1];
			}
			quick(a);
		}else {
			int t = arr[tmp];
			arr[tmp] = arr[tmp2];
			arr[tmp2] = t;
			quick(arr);
		}
	}

}
