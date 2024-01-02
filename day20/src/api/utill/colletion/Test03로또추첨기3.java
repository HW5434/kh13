package api.utill.colletion;

import java.util.ArrayList;
import java.util.Random;
import java.util.TreeSet;

public class Test03로또추첨기3 {

	public static void main(String[] args) {

		//[3] 중복 해결(for)
		ArrayList<Integer> lottoNumbers = new ArrayList<>();
		
		Random r = new Random();
		
		for(int i = 0; i < 6; i++) {
			int number = r.nextInt(45) + 1;
			if(lottoNumbers.contains(number) == false) {
			}
			else {
				i--; //반복무효처리
			}
			lottoNumbers.add(number);
		}
	
		
		System.out.println(lottoNumbers);

	}
}
