package api.utill.collection2;

import java.util.Set;
import java.util.TreeSet;

public class Test07친구추천풀이 {
	public static void main(String[] args) {
		
		//라이츄의 팔로우 목록
		Set<String> f1 = Set.of("피카츄","파이리","꼬부기");
		//꼬부기의 팔로우 목록
		Set<String> f2 = Set.of("피카츄","라이츄","파이리");
		
		//추천 친구 목록
		Set<String> recommand = new TreeSet<>();
		recommand.addAll(f1);
		recommand.addAll(f2);
		recommand.remove("파이리");
		
		System.out.println("<친구 추천 목록>" + recommand.size() + "명");
		for(String name : recommand) {
			System.out.println(" - " + name);
		}
	}
}
