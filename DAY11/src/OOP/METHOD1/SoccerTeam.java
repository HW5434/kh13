package OOP.METHOD1;

public class SoccerTeam {
	
	String name;
	int rank;
	int win , draw , lose ;
	
	//멤버 메소드 - 자주 쓰는 코드
	//void 이름() {코드}
	void information() {

		//this = 현재 실행중인 객체(주인공) a라고 부를수는 없잖아
		System.out.println("순위 : " + this.rank);
		System.out.println("이름 : " + this.name);
		System.out.println(this.win + "승 " + this.draw + "무 " + this.lose + "패");
		System.out.println();
	}
	//데이터는 겹치면 똑같이 2번 나온다 *팀 정보를 저장할 변수가 있어야함*
	void data(int rank , String name , int win , int draw , int lose) {

		this.rank = rank;
		this.name = name;
		this.win = win;
		this.draw = draw;
		this.lose = lose;
	}
	
	
}
