package oop.constructor3;

import java.util.Scanner;

public class Player {
	//맴버 필드 
	private String name;
	private String job;
	private int level;
	private int money;
	
//	Player() { 잘못된 사례 문제점 종속성(하나가 없으면 작동을 안함)
//		Scanner sc = new Scanner(System.in);
//		System.out.print("아이디 : ");
//		this.name = sc.next();
//		System.out.print("직업 : ");
//		this.job = sc.next();
//		this.level = 1;
//		this.money = 100;
//	}		
	
	//생성자 초기화
	Player(String name , String job) {
		this(name , job , 0 , 0);
	}
	
	
		
	//set 생성자 초기화 하는 공간이랑 겹칠수 없음
	
	void setName(String name) { 
		this.name = name;	
	}
	void setJob(String job) { 
		//if(job == "전사" || .....)
		switch(job) {
		case "전사":
		case "궁수":
		case "도적":
		case "마법사":
		this.job = job;	
		}
		
	}
	void setLevel(int level) { 
		this.level = level;	
		if(level < 1)return;
		this.level = level;
	}
	void setMoney(int money) {
		this.money = money;	
		if(money < 0)return;
		this.money= money;
	}
	
	Player(String name , String job , int level , int money) {
		this.setName(name);
		this.setJob(job);
		this.setLevel(level);
		this.setMoney(money);
	}
	
	//get
	String getName() {
		return this.name;
	}
	
	String getJob() {
		return this.job;
	}
	
	int getLevel() {
		return this.level;
	}
	
	int getMoney() {
		return this.money;
	}
	
	void information() {
		System.out.println("<게임 캐릭터 정보>");
		System.out.println("아이디 : " + this.name);
		System.out.println("직업 : " + this.job);
		System.out.println("레벨 : " + this.level);
		System.out.println("소지금 : " + this.money);
	}
	
	void levelUp() {
		this.level++;
	}
	
}
