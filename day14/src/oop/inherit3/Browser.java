package oop.inherit3;

public class Browser {

	;
	//	공통기능
	//	주소를 저장할 수 있어야 한다(url)
	//	새로고침 기능이 존재해야 한다(refresh)
	//	페이지 이동 기능이 존재해야 한다(move)
	private String url;
	
	public String getUrl(String url) {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public void refresh() {
		System.out.println("새로고침");
	}
	public void move() {
		System.out.println("페이지 이동");
	}
}

