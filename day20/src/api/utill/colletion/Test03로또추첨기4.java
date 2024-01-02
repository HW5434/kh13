package api.utill.colletion;

import java.util.ArrayList;
import java.util.Random;
import java.util.TreeSet;

public class Test03로또추첨기4 {

	public static void main(String[] args) {

		//[3] 중복 해결(for)
		ArrayList<Integer> lottoNumbers = new ArrayList<>();
		
		Random r = new Random();
		
		while(lottoNumbers.size() < 6) {
			int number = r.nextInt(45) + 1;
			if(lottoNumbers.contains(number) == false) {
			lottoNumbers.add(number);
			}	
		}
		
		System.out.println(lottoNumbers);

	}
}
