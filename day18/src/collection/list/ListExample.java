package collection.list;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
	public static void main(String[] args) {
		
		
		// 제네릭은 타입 ** 안정화 ** 를 위해 객체 내부에 저장되는 타입을 일치시키는 방법
		// 제네릭 : List는 배열처럼 순서가 있는 데이터 컬렉션 
		List<String> list = new ArrayList<>();
		
		String str1 = "Java";
		String str2 = "SpringBoot";
		
		// 컬렉션 특성상 toString()이 이미 오버라이딩 되어 주소가 아니라 내용이 나옴
		System.out.println(list);
		System.out.println();
		
		
		list.add(str1);
		list.add(str2);
		list.add("Database");
		list.add("Jdbc");
		list.add("Database");
		System.out.println(list);
		
		int size = list.size();
		System.out.println("list에 저장된 총 객체의 수 : " + size);
		
		
	
		// ** add ** 로 몇번에, 뭐 추가
		list.add(2, "Network");
		System.out.println(list);
		
		// ** set ** 으로 수정 해야 함
		list.set(3, "PostgreSQL");
		System.out.println(list);
		
		// ** get ** 으로 가져옴
		String s = list.get(2);
		System.out.println(s);
		
		// ** indexOf ** 몇 번째인지 조회
		int idx = list.indexOf("Network");
		System.out.println(idx);
		
		// ** remove ** 로 삭제
		list.remove(5);
		list.remove(str1);
		System.out.println(list);
		
		// ** contains ** 객체 유무 확인
		System.out.println(list.contains(str1));
		System.out.println();
		
		
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println("내부요소 : " + list.get(i));
		}
		System.out.println("--------------------------");
		
		for(String str : list) {
			System.out.println("내부요소 : " + str);
		}
		
		
		
		// ** clear ** 자료 비우기
		System.out.println();
		list.clear();
		System.out.println(list);
		
		// ** isEmpty ** 자료 비어있는지 유무
		System.out.println();
		System.out.println(list.isEmpty());
		
		
	} 

}
