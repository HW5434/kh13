package jdbc.app;

import jdbc.dao.EmpDao;
import jdbc.dto.EmpDto;

public class Test05사원정보변경 {
	public static void main(String[] args) {
		
	EmpDto dto = new EmpDto();
	dto.setEmpNo(1);
	dto.setEmpName("사원이름");
	dto.setEmpDept("부서명");
	dto.setEmpDate("2020-01-01");
	dto.setEmpSal(500000);
	
	
	EmpDao dao = new EmpDao();
	boolean result = dao.update(dto);
	
		if(result) {
			System.out.println("사원 정보 변경 완료");
		}
		else {
			System.out.println("사원 정보 변경 실패");
		}
	}
}
