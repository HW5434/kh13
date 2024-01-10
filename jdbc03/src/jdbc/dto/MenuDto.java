package jdbc.dto;

public class MenuDto {

	private int menuNo;
	private String menuNameKr;
	private String menuNameEg;
	private String menuType;
	private int menuPrice;
	
	
	public MenuDto() {
		super();
	}
	
	public int getMenuNo() {
		return menuNo;
	}
	public void setMenuNo(int menuNo) {
		this.menuNo = menuNo;
	}
	public String getMenuNameKr() {
		return menuNameKr;
	}
	public void setMenuNameKr(String menuNameKr) {
		this.menuNameKr = menuNameKr;
	}
	public String getMenuNameEg() {
		return menuNameEg;
	}
	public void setMenuNameEg(String menuNameEg) {
		this.menuNameEg = menuNameEg;
	}
	public String getMenuType() {
		return menuType;
	}
	public void setMenuType(String menuType) {
		this.menuType = menuType;
	}
	public int getMenuPrice() {
		return menuPrice;
	}
	public void setMenuPrice(int menuPrice) {
		this.menuPrice = menuPrice;
	}
}
