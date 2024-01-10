package jdbc.app;

import java.util.Scanner;

import jdbc.dao.EmpDao;
import jdbc.dto.EmpDto;

public class Test12사원찾기 {
	public static void main(String[] args) {
		//입력
		Scanner sc = new Scanner(System.in);
		int EmpNo = sc.nextInt(); 
		
		
		EmpDao dao = new EmpDao();
		EmpDto dto = dao.selectOne(EmpNo);
		
		System.out.println("이름, 부서, 입사일, 급여");
		System.out.println(dto.getEmpName());
		System.out.println(dto.getEmpDept());
		System.out.println(dto.getEmpDate());
		System.out.println(dto.getEmpSal());
	}
}
