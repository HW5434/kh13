package jdbc.app;

import jdbc.dao.EmpDao;
import jdbc.dto.EmpDto;

public class Test12사원찾기 {
	public static void main(String[] args) {
		//이름
		int EmpNo = 2;
		
		
		EmpDao dao = new EmpDao();
		EmpDto dto = dao.selectOne(EmpNo);
		
		System.out.println(dto);
	}
}
