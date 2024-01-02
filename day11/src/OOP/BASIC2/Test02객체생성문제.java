package OOP.BASIC2;

public class Test02객체생성문제 {

	public static void main(String[] args) {

		Student a = new Student();
		
		a.name = "뽀로로";
		a.grade = 1;
		a.point = 70;
		
		Student b = new Student();
		
		b.name = "크롱";
		b.grade = 1;
		b.point = 55;
		
		Student c = new Student();
		
		c.name = "포비";
		c.grade = 2;
		c.point = 80;
		
		Student d = new Student();
		
		d.name = "해리";
		d.grade = 2;
		d.point = 75;
		
		//출력
	
		System.out.println("이름 : " + a.name);
		System.out.println("학년 : " + a.grade);
		System.out.println("점수 : " + a.point);
		System.out.println();
		
		System.out.println("이름 : " + b.name);
		System.out.println("학년 : " + b.grade);
		System.out.println("점수 : " + b.point);
		System.out.println();
		
		System.out.println("이름 : " + c.name);
		System.out.println("학년 : " + c.grade);
		System.out.println("점수 : " + c.point);
		System.out.println();
		
		System.out.println("이름 : " + d.name);
		System.out.println("학년 : " + d.grade);
		System.out.println("점수 : " + d.point);
		System.out.println();
		
		
	}

}
