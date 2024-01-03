package api.utill.collection2;

import java.util.HashSet;
import java.util.Set;

public class Test01Set2 {
	public static void main(String[] args) {
		//Set<E>
		// - 전체를 매우 빠르게 탐색할 수 있도록 신경쓴 구조
		// - 구조에 따라 Treeset , HashSet 등이 존재
		
		//HashSet<String> ts = new TreeSet<>(); // 업캐스팅
		Set<String> hs = new HashSet<>();
		
		//데이터 추가
		hs.add("피카츄");
		hs.add("라이츄");
		hs.add("파이리");
		hs.add("꼬부기");
		
		hs.add("꼬부기");
		hs.add("꼬부기");
		hs.add("꼬부기");
		hs.add("꼬부기");
		
		//TreeSet 는 같음이 없음 검색에 특화되서
		//구조적으로 설계가 이렇게 되서
		//인덱스가 없음 따라서 인덱스 관력된 명령이 없음 //get 반복문도 어려움 고로
		//2개의 큰 차이점 정렬 끝
		
		//데이터 검색
		// - 피카츄가 저장소에 있습니까?
		System.out.println(hs.contains("피카츄"));
		
		// - 저장소에서 파이리 지우기
		hs.remove("파이리");
		
		//데이터 출력
		System.out.println(hs);
		System.out.println(hs.size()); //개수
	}
}
