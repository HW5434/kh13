package oop.inherit6선생님풀이;

public class Hwp extends DocumentFile{

	public Hwp(String filename, int filesize) {
		super(filename, filesize);
	}
	public Hwp(String filename, long filesize, int pageSize) {
		
		super(filename, filesize, pageSize);
	}
	public Hwp(String filename, long filesize) {

		super(filename, filesize);
	}
	public Hwp(String filename) {

		super(filename);
	}
	//추가되는 메소드 구현
	
	public void preview() {
		System.out.println("문서 미리보기 기능");
	}
}
