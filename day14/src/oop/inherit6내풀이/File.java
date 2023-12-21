package oop.inherit6내풀이;

public class File {
	
	private int pagesize;
	
	
	public void filename() {
		System.out.println("파일 이름");
	}
	public void filesize() {
		System.out.println("파일 크기");
	}
	public void execute() {
		System.out.println("실행");
	}
	public void information() {
		System.out.println("정보출력");
	}
	
	//chat gpt 힌트는 오버로딩을 하라고 하는데
//	protected void Hwp,Ppt(int pagesize){ (이렇게 쓰고 싶어)
	protected void file(int pagesize){ 
		this.setPagesize(pagesize);

	}
	
	private void setPagesize(int pagesize2) {
		System.out.println("페이지 수");
	}
	
}
