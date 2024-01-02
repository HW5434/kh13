package api.utill.colletion;

import java.util.ArrayList;
import java.util.Random;
import java.util.TreeSet;

public class Test03로또추첨기2 {

	public static void main(String[] args) {

		//제너릭 타입에는 참조형만 가능
		ArrayList<Integer> lottoNumbers = new ArrayList<>();
		
		Random r = new Random();
		
		lottoNumbers.add(r.nextInt(45) + 1);
		lottoNumbers.add(r.nextInt(45) + 1);
		lottoNumbers.add(r.nextInt(45) + 1);
		lottoNumbers.add(r.nextInt(45) + 1);
		lottoNumbers.add(r.nextInt(45) + 1);
		lottoNumbers.add(r.nextInt(45) + 1);
		//이걸 반복문으로 바꿔야겠구나
		
		System.out.println(lottoNumbers);

	}
}
