package collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
	public static void main(String[] args) {
		
		
		// 제네릭 : Set은 순서가 없는 데이터 컬렉션
		Set<String> food = new HashSet<>();
		food.add("닭강정");
		food.add("참치김밥");
		food.add("떡볶이");
		food.add("라면");
		food.add("참치김밥");
		
		System.out.println("food에 저장된 객체 수는? : " + food.size());
		System.out.println(food);
		
		
		// ** Iterator ** 순번이 없는 애들한테 임의로 순번을 부여해서 반복해서 돌게만드는 반복자
		System.out.println();
		Iterator<String> iter = food.iterator();
		
		
		while(iter.hasNext()) {
			String s = iter.next();
			if(s.equals("떡볶이")) {
				System.out.println(s);
				break;
			}
		}
		
		System.out.println();
		food.remove("라면");
		System.out.println(food);
		
		
		System.out.println();
		food.clear();
		if(food.isEmpty()) {
			System.out.println("food가 비어있음");
		} else {
			System.out.println("food가 비어있지 않음");
		}
			
		
	}

}
