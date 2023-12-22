package opp.poly2풀이;

import java.util.Scanner;

public class Test02노트북 {
	public static void main(String [] args) {
		int type = 2;
		int action =   1;
		
		Notebook notebook;
		if(type == 1) {//갤럭시북
			notebook = new Galaxybook(); //업케스팅
		}
		else {//맥북
			notebook = new Macbook(); //업케스팅

		}
		
		//노트북에 뭐가 들어있든 기능을 실행하도록 구현
		if(action == 1) {
			notebook.power();
		}
		else if(action == 2) {
			notebook.playVideo();
		}
		else if(action == 3) {
			notebook.typing();
		}
	}
}	