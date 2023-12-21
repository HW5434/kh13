package oop.inherit6내풀이;

public class Test01파일 {
	public static void main(String [] args) {
		
		Mp4 m4 = new Mp4();
		
		m4.filename();
		m4.filesize();
		m4.execute();
		m4.information();
		
		m4.forward();
		m4.rewind();
		m4.speed();
		
		Mp3 m3 = new Mp3();
		
		m3.filename();
		m3.filesize();
		m3.execute();
		m3.information();
		
		m3.forward();
		m3.rewind();
		m3.duration();
		
		Hwp hp = new Hwp();
		
		hp.filename();
		hp.filesize();
		hp.execute();
		hp.information();
		
		hp.pagesize();
		hp.preview();
		
		Ppt pt = new Ppt();
		
		pt.filename();
		pt.filesize();
		pt.execute();
		pt.information();
		
		pt.pagesize();
		pt.slideShow();
		
	}
}
