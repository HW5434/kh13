package oop.inherit6선생님풀이;

//상속은 1개 클래스만 가능
public class DocumentFile extends File{

	private int pageSize;
	
	//getter & setter
	
	
	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	

	
	public DocumentFile(String filename, long filesize) {
		super(filename, filesize);
		this.setPageSize(1);
	}

	public DocumentFile(String filename) {
		super(filename);
		this.setPageSize(pageSize);
	}
	public DocumentFile(String filename, int filesize) {
		super(filename, filesize);
		this.setPageSize(1);
	}
	public DocumentFile(String filename, long filesize , int pageSize) {
		super(filename, filesize);
		this.setPageSize(pageSize);
}
