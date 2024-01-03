package api.utill.collection2;

import java.util.Set;
import java.util.TreeSet;

public class Test07친구추천 {
	public static void main(String[] args) {
		
		Set<String> 피카츄 = Set.of("라이츄", "꼬부기");
		Set<String> 라이츄 = Set.of("피카츄" , "파이리" , "꼬부기");
		Set<String> 파이리 = Set.of("피카츄" , "라이츄" , "꼬부기");
		Set<String> 꼬부기 = Set.of("피카츄" , "라이츄" , "파이리");
		
		Set<String>모두 = new TreeSet<>();
		모두.addAll(피카츄);
		모두.addAll(라이츄);
		모두.addAll(파이리);
		모두.addAll(꼬부기);

		System.out.println(모두);
		
		//ex 파이리의 친구 추천은?
		
		Set<String>친구파이리 = new TreeSet<>();
//		파이리.remove();
		System.out.println(친구파이리);
		
		//친구 추천 입력하면 현재 친구를 제외한 나머지
		//없으면 없음 입력
	}
}
