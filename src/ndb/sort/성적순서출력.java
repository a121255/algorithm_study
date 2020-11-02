package ndb.sort;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class 성적순서출력 {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new LinkedHashMap<>();
		map.put("홍길동", 95);
		map.put("이순신", 77);
		map.put("윤지수", 45);
		
		Map<String, Integer>  result = sortMapByValue(map);
		for(Map.Entry<String, Integer> entry : result.entrySet()) {
//			System.out.println("Key : " + entry.getKey() + ", " 
//				+	"Value : " +  entry.getValue());
			System.out.print(entry.getKey()+" ");
		}

	}
	
	public static LinkedHashMap<String, Integer> sortMapByValue(Map<String, Integer> map){
		List<Map.Entry<String, Integer>> entries = new LinkedList<>(map.entrySet());
		Collections.sort(entries, (o1, o2) -> o1.getValue().compareTo(o2.getValue()));
		
		LinkedHashMap<String, Integer> result = new LinkedHashMap<>();
		for(Map.Entry<String, Integer> entry : entries) {
			result.put(entry.getKey(), entry.getValue());
		}
		return result;
	}

}
