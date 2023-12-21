package oop.inherit6선생님풀이;

public class Ppt extends DocumentFile{
	//
	
	public Ppt(String filename, int filesize) {
		super(filename, filesize);
	}
	public Ppt(String filename, long filesize, int pageSize) {
	
		super(filename, filesize, pageSize);
	}
	public Ppt(String filename, long filesize) {
	
		super(filename, filesize);
	}
	public Ppt(String filename) {
	
		super(filename);
	}
	
	//추가되는 메소드
	public void slideShow() {
		System.out.println("슬라이드쇼 시작");

	}
}
