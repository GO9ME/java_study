package api.util.collection;

import java.util.HashMap;
import java.util.Set;

// Map
public class HashMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. HashMap 생성
		// map은 순서가 없는 자료구조, key의 값으로 저장될 위치로 계산해서 저장되기 때문에 추출했을 때 순서대로 나오지 않음
		HashMap<String, Integer> map = new HashMap<>();
		map.put("1", 100);
		map.put("2", 200);
		map.put("3", 300);
		map.put("4", 400);
		map.put("5", 500);
		map.put("6", 600);
		// 3. map 에 저장된 요소의 개수
		System.out.println(map.size());

		// 4. map에서 데이터 꺼내기
		System.out.println("1번 키의 값 : " + map.get("1"));

		// 5. Map 에 저장된 모든 데이터를 한번에 꺼내서 출력하기
		// 1) map의 모든키를 추출(모든 key가 set에 담겨서 리턴)
		Set<String> keylist = map.keySet();
		for ( String key : keylist) {
//			System.out.println(key);
			int value = map.get(key);
			System.out.println(value);
		}
		
		
	}

}
