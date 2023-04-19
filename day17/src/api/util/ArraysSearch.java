package api.util;

import java.util.Arrays;

public class ArraysSearch {
	
	public static void main(String[] args) {
		
		int[] scores = {75, 47, 23, 56, 89};
		int[] scores2 = Arrays.copyOf(scores, scores.length);  // score길이 만큼 카피해서 저장해라
		
		Arrays.sort(scores2);	// 순서대로 정렬해라
		System.out.println("scores : " + Arrays.toString(scores));	// 배열 내용 보여줘라
		System.out.println("scores2 : " + Arrays.toString(scores2));
		
		int index = Arrays.binarySearch(scores, 75);	// 이진탐색 : scores 내부에서 75를 찾아라. 절반씩 날리면서 찾음
		System.out.println("75가 저장된 인덱스 번호 : " + index);
		
		int[] arr1 = {1, 3, 5, 7, 9};
		int[] arr2 = {1, 3, 5, 7, 9};
		String result = Arrays.equals(arr1, arr2) ? "항목일치" : "항목불일치";
		System.out.println(result);
		
	}	
}
