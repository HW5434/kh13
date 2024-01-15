package com.kh.spring06menu.dto;

public class MenuDto {

	private int menuNo;
	private String menuNameKor;
	private String menuNameEng;
	private String menuType;
	private int price;
	
	public MenuDto() {
		super();
	}
	public int getMenuNo() {
		return menuNo;
	}
	public void setMenuNo(int menuNo) {
		this.menuNo = menuNo;
	}
	public String getMenuNameKor() {
		return menuNameKor;
	}
	public void setMenuNameKor(String menuNameKor) {
		this.menuNameKor = menuNameKor;
	}
	public String getMenuNameEng() {
		return menuNameEng;
	}
	public void setMenuNameEng(String menuNameEng) {
		this.menuNameEng = menuNameEng;
	}
	public String getMenuType() {
		return menuType;
	}
	public void setMenuType(String menuType) {
		this.menuType = menuType;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
