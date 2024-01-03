package api.utill.collection2;

import java.util.Set;
import java.util.TreeSet;

public class Test06영화목록 {
	public static void main(String[] args) {
		Set<String> mario = Set.of("서울의 봄" , "그대들은 어떻게 살 것인가" , "3일의 휴가" , "괴물");
		Set<String> Luigi = Set.of("나폴레옹" , "사랑은 낙엽을 타고" , "서울의 봄" , "괴물" , "쏘우 X");
		
		//c 교집합 d 차집합
		Set<String> c = new TreeSet<>();
		c.addAll(mario);
		c.retainAll(Luigi);
		System.out.println(c);
		
		//마리오만 본 영화
		Set<String> d = new TreeSet<>();
		d.addAll(mario);
		d.removeAll(Luigi);
		System.out.println(d);
		
		//루이지만 본 영화
		Set<String> e = new TreeSet<>();
		e.addAll(Luigi);
		e.removeAll(mario);
		System.out.println(e);
		
		Set<String> f = new TreeSet<>();
		f.addAll(mario);
		f.addAll(Luigi);
		f.removeAll(c);
		System.out.println(f);;
	}
}
