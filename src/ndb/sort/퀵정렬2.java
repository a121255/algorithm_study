package ndb.sort;

public class 퀵정렬2 {

	public static void main(String[] args) {
		int arr[] = {7, 5, 9, 0, 3, 1, 6, 2, 4, 8};
		q(arr, 0, 9);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}
	
	static void q(int arr[], int start, int end) {
		if(start >= end) return;
		
		int pivot = start;
		int left = start+1;
		int right = end;
		
		while(left<=right) {
			while(left <= end && arr[left] <= arr[pivot]) left++;
			
			while(right > start && arr[right] >= arr[pivot]) right--;
			
			if(left>right) {
				//작은수를 피벗과위치변경
				int tmp = arr[pivot];
				arr[pivot] = arr[right];
				arr[right] = tmp;
				
			}else {
				//그냥 서로 변경
				int tmp = arr[left];
				arr[left] = arr[right];
				arr[right] = tmp;
			}
		}


		q(arr, start, right-1);
		q(arr, right+1, end);
		
	}

}
