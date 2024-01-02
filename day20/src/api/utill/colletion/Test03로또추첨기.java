package api.utill.colletion;

import java.util.ArrayList;
import java.util.Random;
import java.util.TreeSet;

public class Test03로또추첨기 {

	public static void main(String[] args) {

		Random r = new Random();
		ArrayList<Object> b = new ArrayList<>();
		
		
		
		int a = r.nextInt(4) + 1;

//		for(i = 0; i <= r.length(); i++) {
//		}
		
		
		b.add("피카츄");
		b.add("라이츄");
		b.add("파이리");
		b.add("꼬부기");
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(b.size());
	}
}
