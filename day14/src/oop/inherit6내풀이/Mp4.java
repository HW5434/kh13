package oop.inherit6내풀이;

public class Mp4 extends File{
	
	// 같은 메소드 (Mp3 , Mp4)
	public void forward() {
		System.out.println("빨리 감기");
	}
	public void rewind() {
		System.out.println("되감기");
		}
	//다른 메소드 
	public void speed() {
		System.out.println("재생 속도");
	}
}
