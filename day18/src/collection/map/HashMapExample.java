package collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		
		// 제네릭 : Map은 키와 값의 유형을 컴파일시간에 지정함. (JSON 데이터를 파싱하거나 생성하는 데에 많이 사용된다.)
		Map<String, Integer> map = new HashMap<>();
		
		// ** put ** 으로 추가
		map.put("치킨", 30000);
		map.put("라면", 4000);
		map.put("탕수육", 20000);
		map.put("치킨", 24000);
		map.put("짬뽕", 12000);
		System.out.println(map);
		
		// ** size ** 로 key,value 쌍 개수
		System.out.println(map.size());
		
		// ** get() ** 로 value값을 key값으로 얻기
		int price = map.get("탕수육");
		System.out.println("탕수육 가격 : " + price + "원");
		
		// ** Set 으로 key 값 얻어오기 **
		Set<String> kSet = map.keySet();
		System.out.println(kSet);
		
		Iterator<String> kIter = kSet.iterator();
		System.out.println("------------------");
		
		while(kIter.hasNext()) {			// 옆에 자료가 아직 있는가? 엿보기
			String menu = kIter.next();		// 포인터 옆으로 옮기기 -> kiter에 저장 -> 메뉴에 저장
			
			System.out.println(menu);				// key 값
			System.out.println(map.get(menu));		// value 값
			System.out.println();
		}
		
		// ** containsKey() ** 으로 맵 내부에 key 값 있는지 확인
		String food = "치킨";
		
		if(map.containsKey(food)) {
			System.out.println("우리식당 " + food + " 팝니다.");
		} else {
			System.out.println("우리식당 " + food + " 안 팝니다.");
		}
		System.out.println();
		
		// ** remove(key) ** 으로 단일 삭제
		// ** clear() ** 으로 전체 삭제
		map.remove("라면");
		System.out.println(map);
		
		System.out.println();
		
		map.clear();
		System.out.println(map);
		
		System.out.println();
		
		if(map.isEmpty()) {
			System.out.println("비었습니다.");
		} else {
			System.out.println("안 비었습니다.");
		}
		
		
		
		
	}
}
