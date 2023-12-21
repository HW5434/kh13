package oop.inherit3;

public class Test01상속문제 {
	public static void main(String [] args) {
		
	
	Edge e = new Edge();
	
	e.setUrl("사이트 이름");
	e.refresh();
	e.move();
	e.fullScreen();
	System.out.println();
	
	Whale w = new Whale();
	
	w.setUrl("사이트 이름");
	w.refresh();
	w.move();
	w.papago();
	w.naverSearsh();		
	System.out.println();
	
	Chrome c = new Chrome();
	
	c.setUrl("사이트 이름");
	c.refresh();
	c.move();
	c.chromeStore();
	c.develop();
	System.out.println();
	}
}
