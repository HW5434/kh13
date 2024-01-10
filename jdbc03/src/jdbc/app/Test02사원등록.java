package jdbc.app;

import java.util.Scanner;

import jdbc.dao.EmpDao;
import jdbc.dto.EmpDto;

public class Test02사원등록 {
	public static void main(String[] args) {
		
		//Dto 생성
		Scanner sc = new Scanner(System.in);
		
		EmpDto dto = new EmpDto();
		//출력문
		dto.setEmpName(sc.nextLine());
		//출력문
		dto.setEmpDept(sc.nextLine());
		//출력문
		dto.setEmpDate(sc.nextLine());
		//출력문
		dto.setEmpSal(sc.nextInt());
		
		
		//Dao 처리
		EmpDao dao = new EmpDao();
		dao.insert(dto);
		
		System.out.println("사원정보 등록 완료");
		
		
	}
}
