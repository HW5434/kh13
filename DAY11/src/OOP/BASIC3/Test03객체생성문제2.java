package OOP.BASIC3;

public class Test03객체생성문제2 {
	public static void main(String [] arg) {
		//객체 생성
		SoccerLank a = new SoccerLank();
		
			a.Club = "아스널";
			a.lank = 1;
			a.win = 12;
			a.tie = 3;
			a.lose = 2;
			
		SoccerLank b = new SoccerLank();
			
			b.Club = "리버풀";
			b.lank = 2;
			b.win = 11;
			b.tie = 5;
			b.lose = 1;	
		
		SoccerLank c = new SoccerLank();
			
			c.Club = "애스턴 빌라";
			c.lank = 3;
			c.win = 12;
			c.tie = 2;
			c.lose = 3;	
			
		SoccerLank d = new SoccerLank();
			
			d.Club = "맨 시티";
			d.lank = 4;
			d.win = 10;
			d.tie = 4;
			d.lose = 3;
			
			System.out.println("순위 : " + a.lank);
			System.out.println("클럽명 : " + a.Club);
			System.out.println("승리 : " + a.win);
			System.out.println("무승부 : " + a.tie);
			System.out.println("패배 : " + a.lose);
			System.out.println();
			
			System.out.println("순위 : " + b.lank);
			System.out.println("클럽명 : " + b.Club);
			System.out.println("승리 : " + b.win);
			System.out.println("무승부 : " + b.tie);
			System.out.println("패배 : " + b.lose);
			System.out.println();
			
			System.out.println("순위 : " + c.lank);
			System.out.println("클럽명 : " + c.Club);
			System.out.println("승리 : " + c.win);
			System.out.println("무승부 : " + c.tie);
			System.out.println("패배 : " + c.lose);
			System.out.println();
			
			System.out.println("순위 : " + d.lank);
			System.out.println("클럽명 : " + d.Club);
			System.out.println("승리 : " + d.win);
			System.out.println("무승부 : " + d.tie);
			System.out.println("패배 : " + d.lose);
			System.out.println();
			
	}
	
}
