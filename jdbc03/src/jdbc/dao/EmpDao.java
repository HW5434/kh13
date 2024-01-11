package jdbc.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import jdbc.dto.EmpDto;
import jdbc.mapper.EmpMapper;
import jdbc.util.JdbcHelper;

public class EmpDao {
	
		//등록 메소드
			public void insert(EmpDto dto) {
			JdbcTemplate jdbcTemplate = JdbcHelper.getJdbcTemplate();
			String sql = "insert into emp"
					+ "(emp_no, emp_name, emp_dept, emp_date, emp_sal) "
					+ "values(emp_seq.nextval,?,?,?,?)";
			Object[] data = {
			dto.getEmpName(),
			dto.getEmpDept(),
			dto.getEmpDate(),
			dto.getEmpSal()
			};
			jdbcTemplate.update(sql, data);
	}
		// 수정 메소드
			public boolean update(EmpDto dto) {
			JdbcTemplate jdbcTemplate = JdbcHelper.getJdbcTemplate();
			String sql = "update emp set "
					+ "emp_name=?, emp_dept=?, "
					+ "emp_date=?, emp_sal=? "
					+ "where emp_no=?";
			Object[] data = {
					dto.getEmpName(),
					dto.getEmpDept(),
					dto.getEmpDate(),
					dto.getEmpSal(),
					dto.getEmpNo()
			};
			return jdbcTemplate.update(sql,data) > 0;
			
	}
		//삭제 메소드
			public boolean delete(int empNo) {
				JdbcTemplate jdbcTemplate = JdbcHelper.getJdbcTemplate();
				String sql = "delete emp where emp_no=?";
				Object[] data = {empNo};
				return jdbcTemplate.update(sql, data) > 0;
			}
		//목록 메소드
			public List<EmpDto> selectList(){
				JdbcTemplate jdbcTemplate = JdbcHelper.getJdbcTemplate();
				String sql = "select * from emp order by emp_no asc"; //delete문이랑 다름 주의
				//Object[] data = {};
				EmpMapper mapper = new EmpMapper();
				return jdbcTemplate.query(sql, mapper); 
				
			}
		//상세 메소드
			public EmpDto selectOne(int empNo) {
				JdbcTemplate jdbcTemplate = JdbcHelper.getJdbcTemplate();
				String sql = "select * from emp where emp_no=?"; 
				//emp 에서 찾아라 어디서?[where] emp_no에서
				Object[] data = {empNo};
				EmpMapper mapper = new EmpMapper();
				List<EmpDto> list = jdbcTemplate.query(sql, mapper, data);
				
				if(list.isEmpty()) {
					return null; //널로 바꿔라
				}
				else {
					return list.get(0);// 있으면? 가져와야겠지?
				}
			}
			
		//검색 메소드
			public List<EmpDto> selectList(String column, String keyword) {
				JdbcTemplate jdbcTemplate = JdbcHelper.getJdbcTemplate();
				String sql = "select * from emp where instr("+column+" , ?) > 0";
				Object[] data = {keyword};
				EmpMapper mapper = new EmpMapper();
				return jdbcTemplate.query(sql, mapper, data);
				
				
			}
	}

