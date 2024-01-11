package jdbc.app;

import java.util.List;

import jdbc.dao.EmpDao;
import jdbc.dto.EmpDto;

public class Test16사원검색 {
	public static void main(String[] args) {
		int choice = 1;
		String keyword = "3";
		
		String column;
		if(choice == 1) {
			column = "emp_name";
		}
		else 
			column = "emp_dept";
		
		
		EmpDao dao = new EmpDao();
		List<EmpDto> list = dao.selectList(column, keyword);
		
			for(EmpDto dto : list) {
				System.out.println(dto.getEmpName() + "(" + dto.getEmpDept() + ")");
		}
	}
}

