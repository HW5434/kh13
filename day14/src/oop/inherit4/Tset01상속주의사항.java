package oop.inherit4;

public class Tset01상속주의사항 {
	public static void main(String [] args) {
		Galaxy23s phone = new Galaxy23s("010-1212-3434");
		phone.setNumber("010-1212-3434");
		phone.information(); // Phone
		phone.internet(); //Galaxy23s (재정의)
	}
}
