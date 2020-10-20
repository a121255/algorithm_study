package kakao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class 실패율 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();	//n = stage 개수
		//int stages[] = {2, 1, 2, 6, 2, 4, 3, 3}; //각 사용자가 도달한 stage
		int stages[] = {4, 4, 4, 4, 4};
		
		//실패율 = 도달했으나 아직 클리어하지 못한 플레이어 수/스테이지에 도달한 플레이어 수
		//각 스테이지에 도달한 플레이어의 수를 구해준 후, 
		
		double [] per = new double[n];
		double [] clear = new double[n];
		
		for (int i = 1; i < n+1; i++) {
			//clear[i-1] = stages.length;
			for (int j = 0; j < stages.length; j++) {
				if(stages[j]>=i) {
					per[i-1] += 1;
				}
				if(stages[j]>=i && stages[j]<=i) {
					clear[i-1] += 1;
				}
			}
		}
		Map<Integer, Double> fail = new HashMap<Integer, Double>();
		
		//double fail[] = new double[n];
		
		for (int i = 0; i < clear.length; i++) {
			if(clear[i]!=0) {
			fail.put(i, clear[i]/per[i]);
			}else {
				fail.put(i, 0d);
			}
		}
		
		//내림차순 정렬
		List<Integer> keySetList = new ArrayList<>(fail.keySet());
		
		Collections.sort(keySetList, (o1, o2) -> (fail.get(o2).compareTo(fail.get(o1))));
		
		System.out.print("[");
		for (int i = 0; i < clear.length; i++) {
			System.out.print(keySetList.get(i)+1);
			if(i!=clear.length-1) {
				System.out.print(",");
			}
		}
		System.out.print("]");
		
		
        int[] answer = new int[n];
		
		for (int i = 0; i < clear.length; i++) {
			answer[i] = keySetList.get(i);
			System.out.println(answer[i]);
		}
	}

}
